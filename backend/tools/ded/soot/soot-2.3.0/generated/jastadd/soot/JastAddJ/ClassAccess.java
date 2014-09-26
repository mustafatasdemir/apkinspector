
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;



public class ClassAccess extends Access implements Cloneable {
    public void flushCache() {
        super.flushCache();
        type_computed = false;
        type_value = null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ClassAccess clone() throws CloneNotSupportedException {
        ClassAccess node = (ClassAccess)super.clone();
        node.type_computed = false;
        node.type_value = null;
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ClassAccess copy() {
      try {
          ClassAccess node = (ClassAccess)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ClassAccess fullCopy() {
        ClassAccess res = (ClassAccess)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in NameCheck.jrag at line 172



  public void nameCheck() {
    if(isQualified() && !qualifier().isTypeAccess())
      error("class literal may only contain type names");
  }

    // Declared in PrettyPrint.jadd at line 536


  public void toString(StringBuffer s) {
    s.append("class");
  }

    // Declared in Transformations.jrag at line 160


  // remote collection / demand driven creation of accessor
  public void transformation() {
    super.transformation();
    // touch static class method before any accessors to make it first in method
    if(isQualified() && qualifier().type().isReferenceType()) {
      hostType().topLevelType().createStaticClassMethod();
      FieldDeclaration f = hostType().topLevelType().createStaticClassField(prevExpr().type().referenceClassFieldName());
    }
    
  }

    // Declared in Expressions.jrag at line 883



  public soot.Value eval(Body b) {
    if(prevExpr().type().isPrimitiveType() || prevExpr().type().isVoid()) {
      TypeDecl typeDecl = lookupType("java.lang", prevExpr().type().primitiveClassName());
      SimpleSet c = typeDecl.memberFields("TYPE");
      FieldDeclaration f = (FieldDeclaration)c.iterator().next();
      return Jimple.v().newStaticFieldRef(f.sootRef());
    }
    else {
      FieldDeclaration f = hostType().topLevelType().createStaticClassField(prevExpr().type().referenceClassFieldName());
      // add method to perform lookup as a side-effect
      MethodDecl m = hostType().topLevelType().createStaticClassMethod();

      soot.jimple.Stmt next_label = b.newLabel();
      soot.jimple.Stmt end_label = b.newLabel();
      Local result = b.newTemp(type().getSootType());
      Local ref = asLocal(b, Jimple.v().newStaticFieldRef(f.sootRef()));
      b.setLine(this);
      b.add(
        Jimple.v().newIfStmt(
          Jimple.v().newNeExpr(ref, soot.jimple.NullConstant.v()),
          next_label
        )
      );
      // emit string literal
        
      ArrayList list = new ArrayList();
      list.add(new StringLiteral(prevExpr().type().jvmName()).eval(b));
      Local l = asLocal(b, Jimple.v().newStaticInvokeExpr(m.sootRef(), list));
      b.setLine(this);
      b.add(Jimple.v().newAssignStmt(
        Jimple.v().newStaticFieldRef(f.sootRef()),
        l
      ));
      b.setLine(this);
      b.add(Jimple.v().newAssignStmt(result, l));
      b.add(Jimple.v().newGotoStmt(end_label));
      b.addLabel(next_label);
      b.add(Jimple.v().newAssignStmt(
        result,
        Jimple.v().newStaticFieldRef(f.sootRef())
      ));
      b.addLabel(end_label);
      return result;
    }
  }

    // Declared in java.ast at line 3
    // Declared in java.ast line 36

    public ClassAccess() {
        super();


    }

    // Declared in java.ast at line 9


  protected int numChildren() {
    return 0;
  }

    // Declared in java.ast at line 12

  public boolean mayHaveRewrite() { return false; }

    // Declared in TypeAnalysis.jrag at line 401
private TypeDecl refined_TypeAnalysis_type()
{ return lookupType("java.lang", "Class"); }

    // Declared in ResolveAmbiguousNames.jrag at line 47
 @SuppressWarnings({"unchecked", "cast"})     public boolean isClassAccess() {
        boolean isClassAccess_value = isClassAccess_compute();
        return isClassAccess_value;
    }

    private boolean isClassAccess_compute() {  return true;  }

    // Declared in SyntacticClassification.jrag at line 91
 @SuppressWarnings({"unchecked", "cast"})     public NameType predNameType() {
        NameType predNameType_value = predNameType_compute();
        return predNameType_value;
    }

    private NameType predNameType_compute() {  return NameType.TYPE_NAME;  }

    // Declared in Generics.jrag at line 99
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl type() {
        if(type_computed)
            return type_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        type_value = type_compute();
        if(isFinal && num == boundariesCrossed)
            type_computed = true;
        return type_value;
    }

    private TypeDecl type_compute() {
    GenericClassDecl d = (GenericClassDecl)refined_TypeAnalysis_type();
    TypeDecl type = qualifier().type();
    if(type.isPrimitive())
      type = type.boxed();
    ArrayList list = new ArrayList();
    list.add(type);
    return d.lookupParTypeDecl(list);
  }

public ASTNode rewriteTo() {
    return super.rewriteTo();
}

}
