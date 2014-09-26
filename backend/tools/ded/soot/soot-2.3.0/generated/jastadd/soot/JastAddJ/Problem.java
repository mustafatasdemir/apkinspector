
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;

public class Problem extends java.lang.Object implements Comparable {
    // Declared in ErrorCheck.jrag at line 75

    public int compareTo(Object o) {
      if(o instanceof Problem) {
        Problem other = (Problem)o;
        if(!fileName.equals(other.fileName))
          return fileName.compareTo(other.fileName);
        if(line != other.line)
          return line - other.line;
        return message.compareTo(other.message);
      }
      return 0;
    }

    // Declared in ErrorCheck.jrag at line 86

    public static class Severity {
      public static final Severity ERROR = new Severity();
      public static final Severity WARNING = new Severity();
      private Severity() { }
    }

    // Declared in ErrorCheck.jrag at line 91

    public static class Kind {
      public static final Kind OTHER = new Kind();
      public static final Kind LEXICAL = new Kind();
      public static final Kind SYNTACTIC = new Kind();
      public static final Kind SEMANTIC = new Kind();
      private Kind() { }
    }

    // Declared in ErrorCheck.jrag at line 98

    protected int line = -1;

    // Declared in ErrorCheck.jrag at line 99

    public int line() { return line; }

    // Declared in ErrorCheck.jrag at line 100

    protected int column = -1;

    // Declared in ErrorCheck.jrag at line 101

    public int column() { return column; }

    // Declared in ErrorCheck.jrag at line 102

    protected int endLine = -1;

    // Declared in ErrorCheck.jrag at line 103

    public int endLine() { return endLine; }

    // Declared in ErrorCheck.jrag at line 104

    protected int endColumn = -1;

    // Declared in ErrorCheck.jrag at line 105

    public int endColumn() { return endColumn; }

    // Declared in ErrorCheck.jrag at line 106

    protected String fileName;

    // Declared in ErrorCheck.jrag at line 107

    public String fileName() { return fileName; }

    // Declared in ErrorCheck.jrag at line 108

    public void setFileName(String fileName) { this.fileName = fileName; }

    // Declared in ErrorCheck.jrag at line 109

    protected String message;

    // Declared in ErrorCheck.jrag at line 110

    public String message() { return message; }

    // Declared in ErrorCheck.jrag at line 111

    protected Severity severity = Severity.ERROR;

    // Declared in ErrorCheck.jrag at line 112

    public Severity severity() { return severity; }

    // Declared in ErrorCheck.jrag at line 113

    protected Kind kind = Kind.OTHER;

    // Declared in ErrorCheck.jrag at line 114

    public Kind kind() { return kind; }

    // Declared in ErrorCheck.jrag at line 115

    public Problem(String fileName, String message) {
      this.fileName = fileName;
      this.message = message;
    }

    // Declared in ErrorCheck.jrag at line 119

    public Problem(String fileName, String message, int line) {
      this(fileName, message);
      this.line = line;
    }

    // Declared in ErrorCheck.jrag at line 123

    public Problem(String fileName, String message, int line, Severity severity) {
      this(fileName, message);
      this.line = line;
      this.severity = severity;
    }

    // Declared in ErrorCheck.jrag at line 128

    public Problem(String fileName, String message, int line, int column, Severity severity) {
      this(fileName, message);
      this.line = line;
      this.column = column;
      this.severity = severity;
    }

    // Declared in ErrorCheck.jrag at line 134

    public Problem(String fileName, String message, int line, Severity severity, Kind kind) {
      this(fileName, message);
      this.line = line;
      this.kind = kind;
      this.severity = severity;
    }

    // Declared in ErrorCheck.jrag at line 140

    public Problem(String fileName, String message, int line, int column, Severity severity, Kind kind) {
      this(fileName, message);
      this.line = line;
      this.column = column;
      this.kind = kind;
      this.severity = severity;
    }

    // Declared in ErrorCheck.jrag at line 147

    public Problem(String fileName, String message, int line, int column, int endLine, int endColumn, Severity severity, Kind kind) {
      this(fileName, message);
      this.line = line;
      this.column = column;
      this.endLine = endLine;
      this.endColumn = endColumn;
      this.kind = kind;
      this.severity = severity;
    }

    // Declared in ErrorCheck.jrag at line 156

    public String toString() {
      String location = "";
      if(line != -1 && column != -1)
        location = line + "," + column + ":";
      else if(line != -1)
        location = line + ":";
      String s = "";
      if(this.kind == Kind.LEXICAL)
        s = "Lexical Error: ";
      else if(this.kind == Kind.SYNTACTIC)
        s = "Syntactic Error: ";
      else if(this.kind == Kind.SEMANTIC)
        s = "Semantic Error: ";
      return fileName + ":" + location + "\n" + "  " + s + message;
    }


}
