
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;
// A BoundMethodAccess is a method access that bypasses the normal name binding.
// It receives its corresponding declaration explicitly through the constructor.

public class BoundMethodAccess extends MethodAccess implements Cloneable {
    public void flushCache() {
        super.flushCache();
        decl_computed = false;
        decl_value = null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public BoundMethodAccess clone() throws CloneNotSupportedException {
        BoundMethodAccess node = (BoundMethodAccess)super.clone();
        node.decl_computed = false;
        node.decl_value = null;
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public BoundMethodAccess copy() {
      try {
          BoundMethodAccess node = (BoundMethodAccess)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public BoundMethodAccess fullCopy() {
        BoundMethodAccess res = (BoundMethodAccess)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in BoundNames.jrag at line 61


  // A BoundMethodAccess is a MethodAccess where the name analysis is bypassed by explicitly setting the desired binding
  // this is useful when name binding is cached and recomputation is undesired
  public BoundMethodAccess(String name, List args, MethodDecl methodDecl) {
    this(name, args);
    this.methodDecl = methodDecl;
  }

    // Declared in BoundNames.jrag at line 65

  private MethodDecl methodDecl;

    // Declared in BoundNames.ast at line 3
    // Declared in BoundNames.ast line 3

    public BoundMethodAccess() {
        super();

        setChild(new List(), 0);

    }

    // Declared in BoundNames.ast at line 11


    // Declared in BoundNames.ast line 3
    public BoundMethodAccess(String p0, List<Expr> p1) {
        setID(p0);
        setChild(p1, 0);
    }

    // Declared in BoundNames.ast at line 17


    // Declared in BoundNames.ast line 3
    public BoundMethodAccess(beaver.Symbol p0, List<Expr> p1) {
        setID(p0);
        setChild(p1, 0);
    }

    // Declared in BoundNames.ast at line 22


  protected int numChildren() {
    return 1;
  }

    // Declared in BoundNames.ast at line 25

  public boolean mayHaveRewrite() { return false; }

    // Declared in java.ast at line 2
    // Declared in java.ast line 17
    public void setID(String value) {
        tokenString_ID = value;
    }

    // Declared in java.ast at line 5

    public int IDstart;

    // Declared in java.ast at line 6

    public int IDend;

    // Declared in java.ast at line 7

    public void setID(beaver.Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
          throw new UnsupportedOperationException("setID is only valid for String lexemes");
        tokenString_ID = (String)symbol.value;
        IDstart = symbol.getStart();
        IDend = symbol.getEnd();
    }

    // Declared in java.ast at line 14

    public String getID() {
        return tokenString_ID != null ? tokenString_ID : "";
    }

    // Declared in java.ast at line 2
    // Declared in java.ast line 17
    public void setArgList(List<Expr> list) {
        setChild(list, 0);
    }

    // Declared in java.ast at line 6


    private int getNumArg = 0;

    // Declared in java.ast at line 7

    public int getNumArg() {
        return getArgList().getNumChild();
    }

    // Declared in java.ast at line 11


     @SuppressWarnings({"unchecked", "cast"})  public Expr getArg(int i) {
        return (Expr)getArgList().getChild(i);
    }

    // Declared in java.ast at line 15


    public void addArg(Expr node) {
        List<Expr> list = getArgList();
        list.addChild(node);
    }

    // Declared in java.ast at line 20


    public void setArg(Expr node, int i) {
        List<Expr> list = getArgList();
        list.setChild(node, i);
    }

    // Declared in java.ast at line 24

    public List<Expr> getArgs() {
        return getArgList();
    }

    // Declared in java.ast at line 27

    public List<Expr> getArgsNoTransform() {
        return getArgListNoTransform();
    }

    // Declared in java.ast at line 31


     @SuppressWarnings({"unchecked", "cast"})  public List<Expr> getArgList() {
        return (List<Expr>)getChild(0);
    }

    // Declared in java.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Expr> getArgListNoTransform() {
        return (List<Expr>)getChildNoTransform(0);
    }

    // Declared in BoundNames.jrag at line 66
 @SuppressWarnings({"unchecked", "cast"})     public MethodDecl decl() {
        if(decl_computed)
            return decl_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        decl_value = decl_compute();
        if(isFinal && num == boundariesCrossed)
            decl_computed = true;
        return decl_value;
    }

    private MethodDecl decl_compute() {  return methodDecl;  }

public ASTNode rewriteTo() {
    return super.rewriteTo();
}

}
