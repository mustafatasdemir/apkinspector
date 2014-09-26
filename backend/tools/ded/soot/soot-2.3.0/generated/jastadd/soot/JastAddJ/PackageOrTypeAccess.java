
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;


public class PackageOrTypeAccess extends Access implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public PackageOrTypeAccess clone() throws CloneNotSupportedException {
        PackageOrTypeAccess node = (PackageOrTypeAccess)super.clone();
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public PackageOrTypeAccess copy() {
      try {
          PackageOrTypeAccess node = (PackageOrTypeAccess)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public PackageOrTypeAccess fullCopy() {
        PackageOrTypeAccess res = (PackageOrTypeAccess)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in NameCheck.jrag at line 55

  
  public void nameCheck() {
    error("packageortype name " + name());
  }

    // Declared in NodeConstructors.jrag at line 28

  public PackageOrTypeAccess(String name, int start, int end) {
    this(name);
    this.start = start;
    this.end = end;
  }

    // Declared in java.ast at line 3
    // Declared in java.ast line 31

    public PackageOrTypeAccess() {
        super();


    }

    // Declared in java.ast at line 10


    // Declared in java.ast line 31
    public PackageOrTypeAccess(String p0) {
        setID(p0);
    }

    // Declared in java.ast at line 15


    // Declared in java.ast line 31
    public PackageOrTypeAccess(beaver.Symbol p0) {
        setID(p0);
    }

    // Declared in java.ast at line 19


  protected int numChildren() {
    return 0;
  }

    // Declared in java.ast at line 22

  public boolean mayHaveRewrite() { return true; }

    // Declared in java.ast at line 2
    // Declared in java.ast line 31
    protected String tokenString_ID;

    // Declared in java.ast at line 3

    public void setID(String value) {
        tokenString_ID = value;
    }

    // Declared in java.ast at line 6

    public int IDstart;

    // Declared in java.ast at line 7

    public int IDend;

    // Declared in java.ast at line 8

    public void setID(beaver.Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
          throw new UnsupportedOperationException("setID is only valid for String lexemes");
        tokenString_ID = (String)symbol.value;
        IDstart = symbol.getStart();
        IDend = symbol.getEnd();
    }

    // Declared in java.ast at line 15

    public String getID() {
        return tokenString_ID != null ? tokenString_ID : "";
    }

    // Declared in LookupType.jrag at line 338
 @SuppressWarnings({"unchecked", "cast"})     public SimpleSet qualifiedLookupType(String name) {
        SimpleSet qualifiedLookupType_String_value = qualifiedLookupType_compute(name);
        return qualifiedLookupType_String_value;
    }

    private SimpleSet qualifiedLookupType_compute(String name) {  return SimpleSet.emptySet;  }

    // Declared in LookupVariable.jrag at line 140
 @SuppressWarnings({"unchecked", "cast"})     public SimpleSet qualifiedLookupVariable(String name) {
        SimpleSet qualifiedLookupVariable_String_value = qualifiedLookupVariable_compute(name);
        return qualifiedLookupVariable_String_value;
    }

    private SimpleSet qualifiedLookupVariable_compute(String name) {  return SimpleSet.emptySet;  }

    // Declared in PrettyPrint.jadd at line 787
 @SuppressWarnings({"unchecked", "cast"})     public String dumpString() {
        String dumpString_value = dumpString_compute();
        return dumpString_value;
    }

    private String dumpString_compute() {  return getClass().getName() + " [" + getID() + "]";  }

    // Declared in QualifiedNames.jrag at line 15
 @SuppressWarnings({"unchecked", "cast"})     public String name() {
        String name_value = name_compute();
        return name_value;
    }

    private String name_compute() {  return getID();  }

    // Declared in QualifiedNames.jrag at line 37
 @SuppressWarnings({"unchecked", "cast"})     public String packageName() {
        String packageName_value = packageName_compute();
        return packageName_value;
    }

    private String packageName_compute() {
    StringBuffer s = new StringBuffer();
    if(hasPrevExpr()) {
      s.append(prevExpr().packageName());
      s.append(".");
    }
    s.append(name());
    return s.toString();
  }

    // Declared in SyntacticClassification.jrag at line 108
 @SuppressWarnings({"unchecked", "cast"})     public NameType predNameType() {
        NameType predNameType_value = predNameType_compute();
        return predNameType_value;
    }

    private NameType predNameType_compute() {  return NameType.PACKAGE_OR_TYPE_NAME;  }

public ASTNode rewriteTo() {
    // Declared in ResolveAmbiguousNames.jrag at line 169
    if(!duringSyntacticClassification()) {
        duringResolveAmbiguousNames++;
        ASTNode result = rewriteRule0();
        duringResolveAmbiguousNames--;
        return result;
    }

    return super.rewriteTo();
}

    // Declared in ResolveAmbiguousNames.jrag at line 169
    private Access rewriteRule0() {
{
      if(!lookupType(name()).isEmpty())
        return new TypeAccess(name(), start(), end());
      else
        return new PackageAccess(name(), start(), end());
    }    }
}
