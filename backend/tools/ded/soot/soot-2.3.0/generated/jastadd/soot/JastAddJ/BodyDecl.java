
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;



public abstract class BodyDecl extends ASTNode<ASTNode> implements Cloneable {
    public void flushCache() {
        super.flushCache();
        isDAafter_Variable_values = null;
        isDUafter_Variable_values = null;
        isDAbefore_Variable_values = null;
        isDUbefore_Variable_values = null;
        typeThrowable_computed = false;
        typeThrowable_value = null;
        lookupVariable_String_values = null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public BodyDecl clone() throws CloneNotSupportedException {
        BodyDecl node = (BodyDecl)super.clone();
        node.isDAafter_Variable_values = null;
        node.isDUafter_Variable_values = null;
        node.isDAbefore_Variable_values = null;
        node.isDUbefore_Variable_values = null;
        node.typeThrowable_computed = false;
        node.typeThrowable_value = null;
        node.lookupVariable_String_values = null;
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
    // Declared in BranchTarget.jrag at line 211

  public void collectFinally(Stmt branchStmt, ArrayList list) {
    // terminate search if body declaration is reached
  }

    // Declared in Generics.jrag at line 1031


  // TODO: for a substituted class decl we need to search the original, substitute with the enclosing type of this
  // substituted type that is a paramterized type, and return the new value
  /*
  eq ClassDeclSubstituted.localMethodsSignatureMap() = original().localMethodsSignatureMap();
  eq ClassDeclSubstituted.memberFields(String name) = original().memberFields(name);
  eq ClassDeclSubstituted.localFields(String name) = original().localFields(name);
  eq ClassDeclSubstituted.memberTypes(String name) = original().memberTypes(name);
  eq ClassDeclSubstituted.localTypeDecls(String name) = original().localTypeDecls(name);
  eq ClassDeclSubstituted.constructors() = original().constructors();

  eq InterfaceDeclSubstituted.localMethodsSignatureMap() = original().localMethodsSignatureMap();
  eq InterfaceDeclSubstituted.memberFields(String name) = original().memberFields(name);
  eq InterfaceDeclSubstituted.localFields(String name) = original().localFields(name);
  eq InterfaceDeclSubstituted.memberTypes(String name) = original().memberTypes(name);
  eq InterfaceDeclSubstituted.localTypeDecls(String name) = original().localTypeDecls(name);
  eq InterfaceDeclSubstituted.constructors() = original().constructors();
  */
  /*

  eq GenericClassDeclSubstituted.localMethodsSignatureMap() = original().localMethodsSignatureMap();
  eq GenericClassDeclSubstituted.memberFields(String name) = original().memberFields(name);
  eq GenericClassDeclSubstituted.localFields(String name) = original().localFields(name);
  eq GenericClassDeclSubstituted.memberTypes(String name) = original().memberTypes(name);
  eq GenericClassDeclSubstituted.localTypeDecls(String name) = original().localTypeDecls(name);
  eq GenericClassDeclSubstituted.constructors() = original().constructors();

  eq GenericInterfaceDeclSubstituted.localMethodsSignatureMap() = original().localMethodsSignatureMap();
  eq GenericInterfaceDeclSubstituted.memberFields(String name) = original().memberFields(name);
  eq GenericInterfaceDeclSubstituted.localFields(String name) = original().localFields(name);
  eq GenericInterfaceDeclSubstituted.memberTypes(String name) = original().memberTypes(name);
  eq GenericInterfaceDeclSubstituted.localTypeDecls(String name) = original().localTypeDecls(name);
  eq GenericInterfaceDeclSubstituted.constructors() = original().constructors();
  */

  public BodyDecl p(Parameterization parTypeDecl) {
    throw new Error("Operation p not supported for " + getClass().getName());
  }

    // Declared in EmitJimple.jrag at line 204

  
  public void jimplify1phase2() {
  }

    // Declared in EmitJimple.jrag at line 654


  public void jimplify2() {
  }

    // Declared in java.ast at line 3
    // Declared in java.ast line 69

    public BodyDecl() {
        super();


    }

    // Declared in java.ast at line 9


  protected int numChildren() {
    return 0;
  }

    // Declared in java.ast at line 12

  public boolean mayHaveRewrite() { return false; }

    protected java.util.Map isDAafter_Variable_values;
    // Declared in DefiniteAssignment.jrag at line 245
 @SuppressWarnings({"unchecked", "cast"})     public boolean isDAafter(Variable v) {
        Object _parameters = v;
if(isDAafter_Variable_values == null) isDAafter_Variable_values = new java.util.HashMap(4);
        if(isDAafter_Variable_values.containsKey(_parameters))
            return ((Boolean)isDAafter_Variable_values.get(_parameters)).booleanValue();
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean isDAafter_Variable_value = isDAafter_compute(v);
        if(isFinal && num == boundariesCrossed)
            isDAafter_Variable_values.put(_parameters, Boolean.valueOf(isDAafter_Variable_value));
        return isDAafter_Variable_value;
    }

    private boolean isDAafter_compute(Variable v) {  return true;  }

    protected java.util.Map isDUafter_Variable_values;
    // Declared in DefiniteAssignment.jrag at line 709
 @SuppressWarnings({"unchecked", "cast"})     public boolean isDUafter(Variable v) {
        Object _parameters = v;
if(isDUafter_Variable_values == null) isDUafter_Variable_values = new java.util.HashMap(4);
        if(isDUafter_Variable_values.containsKey(_parameters))
            return ((Boolean)isDUafter_Variable_values.get(_parameters)).booleanValue();
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean isDUafter_Variable_value = isDUafter_compute(v);
        if(isFinal && num == boundariesCrossed)
            isDUafter_Variable_values.put(_parameters, Boolean.valueOf(isDUafter_Variable_value));
        return isDUafter_Variable_value;
    }

    private boolean isDUafter_compute(Variable v) {  return true;  }

    // Declared in LookupType.jrag at line 391
 @SuppressWarnings({"unchecked", "cast"})     public boolean declaresType(String name) {
        boolean declaresType_String_value = declaresType_compute(name);
        return declaresType_String_value;
    }

    private boolean declaresType_compute(String name) {  return false;  }

    // Declared in LookupType.jrag at line 393
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl type(String name) {
        TypeDecl type_String_value = type_compute(name);
        return type_String_value;
    }

    private TypeDecl type_compute(String name) {  return null;  }

    // Declared in TypeAnalysis.jrag at line 271
 @SuppressWarnings({"unchecked", "cast"})     public boolean isVoid() {
        boolean isVoid_value = isVoid_compute();
        return isVoid_value;
    }

    private boolean isVoid_compute() {  return false;  }

    // Declared in Annotations.jrag at line 283
 @SuppressWarnings({"unchecked", "cast"})     public boolean hasAnnotationSuppressWarnings(String s) {
        boolean hasAnnotationSuppressWarnings_String_value = hasAnnotationSuppressWarnings_compute(s);
        return hasAnnotationSuppressWarnings_String_value;
    }

    private boolean hasAnnotationSuppressWarnings_compute(String s) {  return false;  }

    // Declared in Annotations.jrag at line 326
 @SuppressWarnings({"unchecked", "cast"})     public boolean isDeprecated() {
        boolean isDeprecated_value = isDeprecated_compute();
        return isDeprecated_value;
    }

    private boolean isDeprecated_compute() {  return false;  }

    // Declared in Enums.jrag at line 26
 @SuppressWarnings({"unchecked", "cast"})     public boolean isEnumConstant() {
        boolean isEnumConstant_value = isEnumConstant_compute();
        return isEnumConstant_value;
    }

    private boolean isEnumConstant_compute() {  return false;  }

    // Declared in GenericsParTypeDecl.jrag at line 64
 @SuppressWarnings({"unchecked", "cast"})     public boolean visibleTypeParameters() {
        boolean visibleTypeParameters_value = visibleTypeParameters_compute();
        return visibleTypeParameters_value;
    }

    private boolean visibleTypeParameters_compute() {  return true;  }

    // Declared in EmitJimple.jrag at line 162
 @SuppressWarnings({"unchecked", "cast"})     public boolean generate() {
        boolean generate_value = generate_compute();
        return generate_value;
    }

    private boolean generate_compute() {  return true;  }

    protected java.util.Map isDAbefore_Variable_values;
    // Declared in DefiniteAssignment.jrag at line 244
 @SuppressWarnings({"unchecked", "cast"})     public boolean isDAbefore(Variable v) {
        Object _parameters = v;
if(isDAbefore_Variable_values == null) isDAbefore_Variable_values = new java.util.HashMap(4);
        if(isDAbefore_Variable_values.containsKey(_parameters))
            return ((Boolean)isDAbefore_Variable_values.get(_parameters)).booleanValue();
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean isDAbefore_Variable_value = getParent().Define_boolean_isDAbefore(this, null, v);
        if(isFinal && num == boundariesCrossed)
            isDAbefore_Variable_values.put(_parameters, Boolean.valueOf(isDAbefore_Variable_value));
        return isDAbefore_Variable_value;
    }

    protected java.util.Map isDUbefore_Variable_values;
    // Declared in DefiniteAssignment.jrag at line 708
 @SuppressWarnings({"unchecked", "cast"})     public boolean isDUbefore(Variable v) {
        Object _parameters = v;
if(isDUbefore_Variable_values == null) isDUbefore_Variable_values = new java.util.HashMap(4);
        if(isDUbefore_Variable_values.containsKey(_parameters))
            return ((Boolean)isDUbefore_Variable_values.get(_parameters)).booleanValue();
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean isDUbefore_Variable_value = getParent().Define_boolean_isDUbefore(this, null, v);
        if(isFinal && num == boundariesCrossed)
            isDUbefore_Variable_values.put(_parameters, Boolean.valueOf(isDUbefore_Variable_value));
        return isDUbefore_Variable_value;
    }

    protected boolean typeThrowable_computed = false;
    protected TypeDecl typeThrowable_value;
    // Declared in ExceptionHandling.jrag at line 22
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl typeThrowable() {
        if(typeThrowable_computed)
            return typeThrowable_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        typeThrowable_value = getParent().Define_TypeDecl_typeThrowable(this, null);
        if(isFinal && num == boundariesCrossed)
            typeThrowable_computed = true;
        return typeThrowable_value;
    }

    // Declared in LookupMethod.jrag at line 25
 @SuppressWarnings({"unchecked", "cast"})     public Collection lookupMethod(String name) {
        Collection lookupMethod_String_value = getParent().Define_Collection_lookupMethod(this, null, name);
        return lookupMethod_String_value;
    }

    // Declared in LookupType.jrag at line 97
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl lookupType(String packageName, String typeName) {
        TypeDecl lookupType_String_String_value = getParent().Define_TypeDecl_lookupType(this, null, packageName, typeName);
        return lookupType_String_String_value;
    }

    // Declared in LookupType.jrag at line 173
 @SuppressWarnings({"unchecked", "cast"})     public SimpleSet lookupType(String name) {
        SimpleSet lookupType_String_value = getParent().Define_SimpleSet_lookupType(this, null, name);
        return lookupType_String_value;
    }

    protected java.util.Map lookupVariable_String_values;
    // Declared in LookupVariable.jrag at line 15
 @SuppressWarnings({"unchecked", "cast"})     public SimpleSet lookupVariable(String name) {
        Object _parameters = name;
if(lookupVariable_String_values == null) lookupVariable_String_values = new java.util.HashMap(4);
        if(lookupVariable_String_values.containsKey(_parameters))
            return (SimpleSet)lookupVariable_String_values.get(_parameters);
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
        if(isFinal && num == boundariesCrossed)
            lookupVariable_String_values.put(_parameters, lookupVariable_String_value);
        return lookupVariable_String_value;
    }

    // Declared in SyntacticClassification.jrag at line 21
 @SuppressWarnings({"unchecked", "cast"})     public NameType nameType() {
        NameType nameType_value = getParent().Define_NameType_nameType(this, null);
        return nameType_value;
    }

    // Declared in TypeAnalysis.jrag at line 567
 @SuppressWarnings({"unchecked", "cast"})     public String hostPackage() {
        String hostPackage_value = getParent().Define_String_hostPackage(this, null);
        return hostPackage_value;
    }

    // Declared in TypeAnalysis.jrag at line 582
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl hostType() {
        TypeDecl hostType_value = getParent().Define_TypeDecl_hostType(this, null);
        return hostType_value;
    }

    // Declared in Statements.jrag at line 446
    public ArrayList Define_ArrayList_exceptionRanges(ASTNode caller, ASTNode child) {
        if(true) {
      int childIndex = this.getIndexOfChild(caller);
            return null;
        }
        return getParent().Define_ArrayList_exceptionRanges(this, caller);
    }

    // Declared in TypeAnalysis.jrag at line 515
    public BodyDecl Define_BodyDecl_enclosingBodyDecl(ASTNode caller, ASTNode child) {
        if(true) {
      int childIndex = this.getIndexOfChild(caller);
            return this;
        }
        return getParent().Define_BodyDecl_enclosingBodyDecl(this, caller);
    }

public ASTNode rewriteTo() {
    return super.rewriteTo();
}

}
