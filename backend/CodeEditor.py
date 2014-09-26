from PyQt4.QtGui import *
from PyQt4.QtCore import *
from SyntaxHighter import *
from RenamingDialog import *
from Ui_MainWindow import Ui_mainWindow

class LineNumberArea(QWidget):
    codeEditor = None
    
    def __init__(self, editor):
        QWidget.__init__(self, editor)
        self.codeEditor = editor
        
    def sizeHint(self):
        return QSize(self.codeEditor.lineNumberAreaWidth(), 0)
        
    def paintEvent(self, event):
        self.codeEditor.lineNumberAreaPaintEvent(event)
        

class CodeEditor(QPlainTextEdit):
    lineNumberArea = None
    allLineNumber = None        # allLineNumber is the number of rows of dalvik code editor
    annotation = None           # annotation is the content in annotation editor

    
    # this is the flag for annotation editor.
    # flag == 0 : it never open/create the annotaion editor
    # flag == 1 : the annotation editor has been created.  
    #             After the user click the "Add Annotation" item firstly, the annotation editor is created
    flag = None
    
    annotationDockWidget = None
    firstOpenFlag = None            # firstOpenFlag == 1: the annotation editor has been opened once.
    
    # this a flag for each opened method.
    # flag == 0: there is no annotation for this method
    # flag == 1: there is a annotation for this method
    methodOpened2AnnotationFlag = None
    
    method2annotation = None        # this the annotation content for each opened method
    currentMethod = None            # this is the current method which is being opened and viewed.
    renamingDockWidget = None
    
    # this is a flag for each opened method
    # flag == 0: there is no reanaming table for this method
    # flag == 1: there is a renaming table for this method
    methodOpened2RenamingFlag = None
    
    method2renaming = None          # this is the renaming table for each opened method 
    method2NewCodes = None          # this is the new codes after renaming
    renamingTable = None            # renamingTable is the content in renaming table

    # this is the flag for the renaming table.
    # flag == 0 : it never open/create the renaming table
    # flag == 1 : the renaming table has been created.  
    #             After the user click the "Renaming" item firstly, the renaming table is created
    flagRenaming = None   
   
    firstRenameFlag = None          # firstRenameFlag == 1: the renaming table editor has been opened once.
    class2annotaion = None          # this the annotation content for each opened class(smali tab)

    # this a flag for each opened class.
    # flag == 0: there is no annotation for this class
    # flag == 1: there is a annotation for this class    
    classOpened2AnnotationFlag = None
    
    currentClass = None    # this is the current class which is being opened and viewed.    

    
    def __init__(self, parent = None):
        QPlainTextEdit.__init__(self, parent)
        self.allLineNumber = 0
        self.annotation = ""
        self.flag = 0
        self.firstOpenFlag = 0
        self.methodOpened2AnnotationFlag = {}
        self.method2annotation = {}
        
        self.renamingTable = {}
        self.methodOpened2RenamingFlag = {}
        self.method2renaming = {}
        self.method2NewCodes = {}
        self.flagRenaming = 0
        self.firstRenameFlag = 0
        
        self.class2annotation = {}
        self.classOpened2AnnotationFlag = {}

        self.lineNumberArea = LineNumberArea(self)
        self.connect(self, SIGNAL("blockCountChanged(int )"), self.updateLineNumberAreaWidth)
        self.connect(self, SIGNAL("updateRequest(QRect, int)"), self.updateLineNumberArea)
        self.connect(self, SIGNAL("cursorPositionChanged()"), self.highlightCurrentLine)
        
        self.updateLineNumberAreaWidth()
        self.highlightCurrentLine()
        
        highlighter = Highlighter(self.document())
   
    # get the line number area's width
    def lineNumberAreaWidth(self):
        digits = 1
        max = self.blockCount()
        if self.blockCount() <= 1:
            max = 1
        while (max >= 10):
            max /= 10
            digits += 1
        
        space = 3+ QFontMetrics(QFont('Latin', 20)).width("9") * digits
        return space
    
    # update the line number area's width
    def updateLineNumberAreaWidth(self):
        self.setViewportMargins(self.lineNumberAreaWidth(), 0, 0, 0)
        
    # update the line number area
    def updateLineNumberArea(self, rect, dy):
        if dy:
            self.lineNumberArea.scroll(0, dy)
        else:
            self.lineNumberArea.update(0, rect.y(), self.lineNumberArea.width(), rect.height())
        
        if rect.contains(self.viewport().rect()):
            self.updateLineNumberAreaWidth()
            
            
    def resizeEvent(self, e):
        QPlainTextEdit.resizeEvent(self, e)
        cr = self.contentsRect()
        self.lineNumberArea.setGeometry(QRect(cr.left(), cr.top(), self.lineNumberAreaWidth(), cr.height()))


    def highlightCurrentLine(self):
        extraSelections = []
        
        if (not self.isReadOnly()):
            selection = QTextEdit.ExtraSelection()
            
            lineColor = QColor(Qt.yellow).lighter(160)
            
            selection.format.setBackground(lineColor)
            selection.format.setProperty(QTextFormat.FullWidthSelection, 1)
            selection.cursor = self.textCursor()
            selection.cursor.clearSelection()
            extraSelections.append(selection)
            
        self.setExtraSelections(extraSelections)
        
        
    def lineNumberAreaPaintEvent(self, event):
        painter = QPainter(self.lineNumberArea)
        painter.fillRect(event.rect(), Qt.lightGray)
        
        block = self.firstVisibleBlock()
        blockNumber = block.blockNumber()
        top = self.blockBoundingGeometry(block).translated(self.contentOffset()).top()
        bottom = top + self.blockBoundingRect(block).height()
        
        while(block.isValid() and top <= event.rect().bottom() ):
            if block.isVisible and bottom >= event.rect().top():
                number = str(blockNumber + 1)

                painter.setPen(Qt.black)
                painter.drawText(0, top, self.lineNumberArea.width(), QFontMetrics(QFont('Latin', 20)).height(), Qt.AlignRight, number)
            
            block = block.next()
            top = bottom
            bottom = top + self.blockBoundingRect(block).height()
            blockNumber = blockNumber + 1
            
    # this contextMenuEvent method is to build a mouse menu
    def contextMenuEvent(self, event):
        import Global
        mainwindow = Global.MAINWINDOW        
        index = mainwindow.tabWidget.currentIndex()   
        
        menu = self.createStandardContextMenu()
        menu.addSeparator()
        if index == 1:
            actionGotoCFG = menu.addAction("Goto CFG")
            actionRenaming = menu.addAction("Renaming")
            self.connect(actionGotoCFG, SIGNAL("triggered()"), self.gotoCFG)
            self.connect(actionRenaming, SIGNAL("triggered()"), self.renaming)
        if index == 1 or index ==2:
            actionAnnotation = menu.addAction("Add Annotation")
            self.connect(actionAnnotation, SIGNAL("triggered()"), self.addAnnotation)
        if index == 3:
            actionAnnotationSmali = menu.addAction("Add Annotation")
            self.connect(actionAnnotationSmali, SIGNAL("triggered()"), self.addAnnotationSmali)
        menu.exec_(event.globalPos())

    # overload the method for calculating the all line numbers
    def setPlainText(self, plainText):
        QPlainTextEdit.setPlainText(self, plainText)
        self.allLineNumber = len(plainText.split("\n")) - 1
  
    # Yuan get the text from UI
    def toPlainText(self):
         allText = ""
         document = QPlainTextEdit.document(self)
         textBlock = document.begin()
         while textBlock != document.end():
             allText += textBlock.text() + "\n"
             textBlock = textBlock.next()
         
         return allText

    # reset all
    def reset(self):
        if self.flag == 1:
            self.annotationDockWidget.setVisible(0)
            self.annotationDockWidget = None
        self.allLineNumber = 0
        self.annotation = ""
        self.flag = 0
        self.firstOpenFlag = 0
        self.methodOpened2AnnotationFlag.clear()
        self.method2annotation.clear()
        self.currentMethod = None
    
        if self.flagRenaming == 1:
            self.renamingDockWidget.setVisible(0)
            self.renamingDockWidget = None
        self.renamingTable.clear()
        self.methodOpened2RenamingFlag.clear()
        self.method2renaming.clear()
        self.method2NewCodes.clear()
        self.flagRenaming = 0
        self.firstRenameFlag = 0     
      
        self.class2annotation.clear()
        self.classOpened2AnnotationFlag.clear()
        self.currentClass = None
 
    # save the annotation
    def saveAnnotation(self):
        self.method2annotation[self.currentMethod] = self.annotationDockWidget.widget().toPlainText()

    # save the annotation for smali tab
    def saveAnnotationSmali(self):
        self.class2annotation[self.currentClass] = self.annotationDockWidget.widget().toPlainText()
    

    # update the annotation in the annotation editor
    def updateAnnotation(self):
        self.annotationDockWidget.widget().setPlainText(self.annotation)
        
    
    # add an opened method
    def addOpenedMethod(self, method):
        self.currentMethod = method
        if method in self.methodOpened2AnnotationFlag.keys():
            return
        else:
            # if it creates a method firstly, the flag is set to 0. 
            # That is to say, there's no annotation for the method when it's create at the first time.
            self.methodOpened2AnnotationFlag[self.currentMethod] = 0

            # if it creates a method firstly, the flag is set to 0. 
            # That is to say, there's no renaming table for the method when it's create at the first time.
            self.methodOpened2RenamingFlag[self.currentMethod] = 0
            
            # set the inital annotation for this method to be used next time.
            content = ""
            for i in range(0, self.allLineNumber):
                content += "\n"
            self.method2annotation[method] = content
            self.annotation = content
        
            # set the inital renaming table for this method to be used next time
            self.renamingTable = {}
            for i in range(0, self.allLineNumber):
                for j in range(0, 20):
                    self.renamingTable[20*i + j] = QString("")
            self.method2renaming[method] = self.renamingTable
            
            
    # add an opened class
    def addOpenedClass(self, classname):
        self.currentClass = classname
        if classname in self.classOpened2AnnotationFlag.keys():
            return
        else:
            # if it creates a class firstly, the flag is set to 0. 
            # That is to say, there's no annotation for the class when it's create at the first time.
            self.classOpened2AnnotationFlag[self.currentClass] = 0
         
            # set the inital annotation for this class to be used next time.
            content = ""
            for i in range(0, self.allLineNumber):
                content += "\n"
            self.class2annotation[classname] = content
            self.annotation = content
        

    # goto the CFG when the user click the Goto CFG
    def gotoCFG(self):
        import Global
        if Global.CONFIG["CFG"] == 0:
            return
        
        currentCursor = self.textCursor()
        currentCursor.select(QTextCursor.LineUnderCursor)
        text = currentCursor.selectedText()
        lineContent = str(text)
        if text.startsWith(QString("0x")) == 0:
            return
        lineOffset = lineContent[2:lineContent.index(" ")]

        # change the string type to hex type
        offset = int(lineOffset, 16)
        
        graph = Global.GRAPH
        tabWidget = Global.TABWIDGET
        for node in graph.nodeList:
            if node.minOffset <= offset and node.maxOffset >= offset:
                tabWidget.setCurrentIndex(0)
                node.setSelected(1)
                graph.view.centerOn(node)
                break
        
        
    # open the Annotation view, which is implemented by a QDockWidget
    def addAnnotation(self):
        import Global
        mainwindow = Global.MAINWINDOW
        
        # set the flag to 1 for the openning method.
        # the flag ==1 means that the current method has a annotation.
        if self.currentMethod == None:
            return
        if self.methodOpened2AnnotationFlag[self.currentMethod] == 0:
            self.methodOpened2AnnotationFlag[self.currentMethod] = 1
            
        # get the current line number of the cursor
        cursorLineNumber = self.textCursor().blockNumber()
         
        # there's no annotation editor now and it will create the editor. 
        if self.flag == 0:
            index2title = {1:"Annotation--Dalvik", 2:"Annotation--Bytecode"}
            index2layout = {1:mainwindow.gridLayout_12, 2:mainwindow.gridLayout_13}
            index2widget = {1:mainwindow.plainTextEdit_dalvik, 2:mainwindow.plainTextEdit_bytecode}
            
            index = mainwindow.tabWidget.currentIndex()
            
            if index not in index2title.keys():
                return
                
            title = index2title[index]
            layout = index2layout[index]
            widget = index2widget[index]        
            
            plainTextEdit  = CodeEditor()
            sizePolicy = QSizePolicy(QSizePolicy.Expanding, QSizePolicy.Expanding)
            sizePolicy.setHorizontalStretch(0)
            sizePolicy.setVerticalStretch(0)
            sizePolicy.setHeightForWidth(plainTextEdit.sizePolicy().hasHeightForWidth())
            plainTextEdit.setSizePolicy(sizePolicy)
            plainTextEdit.setVerticalScrollBarPolicy(Qt.ScrollBarAsNeeded)
            plainTextEdit.setHorizontalScrollBarPolicy(Qt.ScrollBarAsNeeded)
            plainTextEdit.setLineWrapMode(QPlainTextEdit.NoWrap)
            plainTextEdit.setCenterOnScroll(False)
            plainTextEdit.setMinimumHeight(100)
            plainTextEdit.setMaximumHeight(100)
            
            self.annotationDockWidget = QDockWidget(title)
            self.annotationDockWidget.setFeatures(QDockWidget.DockWidgetClosable)
            self.annotationDockWidget.setWidget(plainTextEdit)
            self.annotationDockWidget.setAllowedAreas(Qt.AllDockWidgetAreas)
            self.annotationDockWidget.setVisible(1)
            self.annotationDockWidget.setFloating(1)
            mainwindow.addDockWidget(Qt.BottomDockWidgetArea, self.annotationDockWidget)
            layout.addWidget(self.annotationDockWidget, 1, 0, 1, 1)

            # update a annotation
            self.updateAnnotation()
            
            # set the curosr
            for i in range(0, cursorLineNumber):
                self.annotationDockWidget.widget().moveCursor(QTextCursor.Down, QTextCursor.MoveAnchor)
            
            # set the annotation editor's flag to 1 
            self.flag = 1
            
            # It means the annotation editor has been opened once
            self.firstOpenFlag = 1
            
        elif self.flag == 1:
            if self.firstOpenFlag == 1:
                self.annotationDockWidget.setVisible(1)
            elif self.firstOpenFlag == 0:
                self.annotationDockWidget.setVisible(1)
                self.annotation = self.method2annotation[self.currentMethod]
                self.updateAnnotation()
                self.firstOpenFlag = 1
            self.annotationDockWidget.widget().moveCursor(QTextCursor.Start, QTextCursor.MoveAnchor)
            # set the curosr
            for i in range(0, cursorLineNumber):
                self.annotationDockWidget.widget().moveCursor(QTextCursor.Down, QTextCursor.MoveAnchor)


    # open the Annotation view for smali tab, which is implemented by a QDockWidget
    def addAnnotationSmali(self):
        import Global
        mainwindow = Global.MAINWINDOW
        
        # set the flag to 1 for the openning class.
        # the flag ==1 means that the current class has a annotation.
        if self.currentClass == None:
            return
        if self.classOpened2AnnotationFlag[self.currentClass] == 0:
            self.classOpened2AnnotationFlag[self.currentClass] = 1
            
        # get the current line number of the cursor
        cursorLineNumber = self.textCursor().blockNumber()
         
        # there's no annotation editor now and it will create the editor. 
        if self.flag == 0:
            title = "Annotation--Smali"
            layout = mainwindow.gridLayout_14
            
            plainTextEdit  = CodeEditor()
            sizePolicy = QSizePolicy(QSizePolicy.Expanding, QSizePolicy.Expanding)
            sizePolicy.setHorizontalStretch(0)
            sizePolicy.setVerticalStretch(0)
            sizePolicy.setHeightForWidth(plainTextEdit.sizePolicy().hasHeightForWidth())
            plainTextEdit.setSizePolicy(sizePolicy)
            plainTextEdit.setVerticalScrollBarPolicy(Qt.ScrollBarAsNeeded)
            plainTextEdit.setHorizontalScrollBarPolicy(Qt.ScrollBarAsNeeded)
            plainTextEdit.setLineWrapMode(QPlainTextEdit.NoWrap)
            plainTextEdit.setCenterOnScroll(False)
            plainTextEdit.setMinimumHeight(100)
            plainTextEdit.setMaximumHeight(100)
            
            self.annotationDockWidget = QDockWidget(title)
            self.annotationDockWidget.setFeatures(QDockWidget.DockWidgetClosable)
            self.annotationDockWidget.setWidget(plainTextEdit)
            self.annotationDockWidget.setAllowedAreas(Qt.AllDockWidgetAreas)
            self.annotationDockWidget.setVisible(1)
            self.annotationDockWidget.setFloating(1)
            mainwindow.addDockWidget(Qt.BottomDockWidgetArea, self.annotationDockWidget)
            layout.addWidget(self.annotationDockWidget, 1, 0, 1, 1)

            # update a annotation
            self.updateAnnotation()
            
            # set the curosr
            for i in range(0, cursorLineNumber):
                self.annotationDockWidget.widget().moveCursor(QTextCursor.Down, QTextCursor.MoveAnchor)
            
            # set the annotation editor's flag to 1 
            self.flag = 1
            
            # It means the annotation editor has been opened once
            self.firstOpenFlag = 1
            
        elif self.flag == 1:
            if self.firstOpenFlag == 1:
                self.annotationDockWidget.setVisible(1)
            elif self.firstOpenFlag == 0:
                self.annotationDockWidget.setVisible(1)
                self.annotation = self.class2annotation[self.currentClass]
                self.updateAnnotation()
                self.firstOpenFlag = 1
            self.annotationDockWidget.widget().moveCursor(QTextCursor.Start, QTextCursor.MoveAnchor)
            # set the curosr
            for i in range(0, cursorLineNumber):
                self.annotationDockWidget.widget().moveCursor(QTextCursor.Down, QTextCursor.MoveAnchor)


    # update the renaming table
    def updateRenamingTable(self):
        for i in range(0, self.allLineNumber):
            for j in range(0, 20):
                text = self.renamingTable[20*i + j]
                self.renamingDockWidget.widget().setItem(i, j, QTableWidgetItem(text))
        
    # save the renaming table
    def saveRenamingTable(self):
        renamingTable = {}
        for i in range(0, self.allLineNumber):
            for j in range(0, 20):
                if self.renamingDockWidget.widget().item(i, j) != None:
                    renamingTable[20*i + j] = self.renamingDockWidget.widget().item(i, j).text()
                else:
                    renamingTable[20*i + j] = QString("")
        
        self.method2renaming[self.currentMethod] = renamingTable

    # save the new codes.
    def saveNewCodes(self):
        self.method2NewCodes[self.currentMethod] = self.toPlainText()

    # when the user select rigister's name or other name, he can rename it
    def renaming(self):
        import Global
        mainwindow = Global.MAINWINDOW
        
        # set the flag to 1 for the openning method.
        # the flag ==1 means that the current method has a renaming table.
        if self.currentMethod == None:
            return
        if self.methodOpened2RenamingFlag[self.currentMethod] == 0:
            self.methodOpened2RenamingFlag[self.currentMethod] = 1
        
        cursor = self.textCursor()
        # get the current line number of the cursor
        cursorLineNumber = cursor.blockNumber()
         
        # there's no renaming table now and it will create the renaming table. 
        if self.flagRenaming == 0:
            index2title = {1:"RenamingTable--Dalvik"}
            index2layout = {1:mainwindow.gridLayout_12}
            
            index = mainwindow.tabWidget.currentIndex()
            
            if index not in index2title.keys():
                return
            
            title = index2title[index]
            layout = index2layout[index]
            
            # at most, a line has 10 elements to be renamed
            renamingTable = QTableWidget(self.allLineNumber, 20)
            headerLabels = ["A0", "A1"," B0", "B1", "C0", "C1", "D0", "D1", "E0", "E1", "F0", "F1", "G0", "G1", "H0", "H1", "I0", "I1", "J0", "J1"]
            renamingTable.setHorizontalHeaderLabels(headerLabels)
            
          
            sizePolicy = QSizePolicy(QSizePolicy.Expanding, QSizePolicy.Expanding)
            sizePolicy.setHorizontalStretch(0)
            sizePolicy.setVerticalStretch(0)
            sizePolicy.setHeightForWidth(renamingTable.sizePolicy().hasHeightForWidth())
            renamingTable.setSizePolicy(sizePolicy)
            renamingTable.setVerticalScrollBarPolicy(Qt.ScrollBarAsNeeded)
            renamingTable.setHorizontalScrollBarPolicy(Qt.ScrollBarAsNeeded)
            renamingTable.setMinimumHeight(100)
            renamingTable.setMaximumHeight(100)
            
            self.renamingDockWidget = QDockWidget(title)
            self.renamingDockWidget.setFeatures(QDockWidget.DockWidgetClosable)
            self.renamingDockWidget.setWidget(renamingTable)
            self.renamingDockWidget.setAllowedAreas(Qt.AllDockWidgetAreas)
            self.renamingDockWidget.setVisible(1)
            self.renamingDockWidget.setFloating(1)
            mainwindow.addDockWidget(Qt.BottomDockWidgetArea, self.renamingDockWidget)
            layout.addWidget(self.renamingDockWidget, 1, 0, 1, 1)
            
            # update the renaming table
            self.updateRenamingTable()
    
            # set the curosr in renaming table
            self.renamingDockWidget.widget().setCurrentItem(self.renamingDockWidget.widget().item(cursorLineNumber, 0))
            
            # set the renaming table's flag to 1 
            self.flagRenaming = 1
            
            # firstRenameFlag ==1 means the renaming table has been opened once
            self.firstRenameFlag = 1
            
        elif self.flagRenaming == 1:
            if self.firstRenameFlag == 1:
                self.renamingDockWidget.setVisible(1)
            elif self.firstRenameFlag == 0:
                self.renamingDockWidget.setVisible(1)
                self.renamingTable = self.method2renaming[self.currentMethod]
                self.updateRenamingTable()
                self.firstRenameFlag = 1
            # set the curosr in renaming table
            self.renamingDockWidget.widget().setCurrentItem(self.renamingDockWidget.widget().item(cursorLineNumber, 0))


        # pop a dialog to rename the selected string
        selectedText = cursor.selectedText()
        if len(selectedText.split(" ")) != 1 or selectedText == QString(""):
            return
        else:
            renamingDialog = RenamingDialog()
            renamingDialog.lineEdit_old.setText(selectedText)
            renamingDialog.exec_()
            newText = renamingDialog.newName
            if newText == None or newText == QString(""):
                return
            
            # update the renaming table by add two item at blank space
            for i in range(0, 20, 2):
                itemText = self.renamingDockWidget.widget().item(cursorLineNumber, i).text()
                if itemText == QString("") or itemText == selectedText:
                    self.renamingDockWidget.widget().item(cursorLineNumber, i).setText(selectedText)
                    self.renamingDockWidget.widget().item(cursorLineNumber, i+1).setText(newText)
                    break
            
            # change the string to a new string
            cursor.insertText(newText)
            
            # update the node in CFG
            cursor.select(QTextCursor.LineUnderCursor)
            text = cursor.selectedText()
            lineContent = str(text)
            if text.startsWith(QString("0x")) == 0:
                return
            lineOffset = lineContent[2:lineContent.index(" ")]

            # change the string type to hex type
            offset = int(lineOffset, 16)
        
            import Global
            graph = Global.GRAPH
            tabWidget = Global.TABWIDGET
            for node in graph.nodeList:
                if node.minOffset <= offset and node.maxOffset >= offset:
                    break
            
            tList =  node.text().split("\n")
            firstLine = tList[0]
            endLine = tList[-2]
            for row in tList:
                rowOffset = row[:row.index(" ")]
                # change the string type to hex type
                rowOffset = int(rowOffset, 16)
                if rowOffset == offset:
                    break
            updatedText = node.text().replace(row, text)
            node.setText(updatedText)

    
    
