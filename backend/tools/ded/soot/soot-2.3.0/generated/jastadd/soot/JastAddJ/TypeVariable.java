
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;



public class TypeVariable extends ReferenceType implements Cloneable {
    public void flushCache() {
        super.flushCache();
        toInterface_computed = false;
        toInterface_value = null;
        involvesTypeParameters_visited = 0;
        memberFields_String_values = null;
        castingConversionTo_TypeDecl_values = null;
        erasure_computed = false;
        erasure_value = null;
        fullName_computed = false;
        fullName_value = null;
        lubType_computed = false;
        lubType_value = null;
        usesTypeVariable_visited = 0;
        usesTypeVariable_computed = false;
        usesTypeVariable_initialized = false;
        accessibleFrom_TypeDecl_values = null;
        typeName_computed = false;
        typeName_value = null;
        sameStructure_TypeDecl_visited = new java.util.HashMap(4);
        subtype_TypeDecl_visited = new java.util.HashMap(4);
        getSubstitutedTypeBound_int_TypeDecl_values = null;
        instanceOf_TypeDecl_values = null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public TypeVariable clone() throws CloneNotSupportedException {
        TypeVariable node = (TypeVariable)super.clone();
        node.toInterface_computed = false;
        node.toInterface_value = null;
        node.involvesTypeParameters_visited = 0;
        node.memberFields_String_values = null;
        node.castingConversionTo_TypeDecl_values = null;
        node.erasure_computed = false;
        node.erasure_value = null;
        node.fullName_computed = false;
        node.fullName_value = null;
        node.lubType_computed = false;
        node.lubType_value = null;
        node.usesTypeVariable_visited = 0;
        node.usesTypeVariable_computed = false;
        node.usesTypeVariable_initialized = false;
        node.accessibleFrom_TypeDecl_values = null;
        node.typeName_computed = false;
        node.typeName_value = null;
        node.sameStructure_TypeDecl_visited = new java.util.HashMap(4);
        node.subtype_TypeDecl_visited = new java.util.HashMap(4);
        node.getSubstitutedTypeBound_int_TypeDecl_values = null;
        node.instanceOf_TypeDecl_values = null;
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public TypeVariable copy() {
      try {
          TypeVariable node = (TypeVariable)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public TypeVariable fullCopy() {
        TypeVariable res = (TypeVariable)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in GenericTypeVariables.jrag at line 28
    

  public void nameCheck() {
    if(extractSingleType(lookupType(name())) != this)
      error("*** Semantic Error: type variable " + name() + " is multiply declared");
  }

    // Declared in GenericTypeVariables.jrag at line 66


  public void typeCheck() {
    if(!getTypeBound(0).type().isTypeVariable() && !getTypeBound(0).type().isClassDecl() && !getTypeBound(0).type().isInterfaceDecl()) {
      error("the first type bound must be either a type variable, or a class or interface type which " + 
        getTypeBound(0).type().fullName() + " is not");
    }
    for(int i = 1; i < getNumTypeBound(); i++) {
      if(!getTypeBound(i).type().isInterfaceDecl()) {
        error("type bound " + i + " must be an interface type which " + 
          getTypeBound(i).type().fullName() + " is not");
      }
    }
    HashSet typeSet = new HashSet();
    for(int i = 0; i < getNumTypeBound(); i++) {
      TypeDecl type = getTypeBound(i).type();
      TypeDecl erasure = type.erasure();
      if(typeSet.contains(erasure)) {
        if(type != erasure) {
          error("the erasure " + erasure.fullName() + " of typebound " + getTypeBound(i) + " is multiply declared in " + this);
        }
        else {
          error(type.fullName() + " is multiply declared");
        }
      }
      typeSet.add(erasure);
    }

    for(int i = 0; i < getNumTypeBound(); i++) {
      TypeDecl type = getTypeBound(i).type();
      for(Iterator iter = type.methodsIterator(); iter.hasNext(); ) {
        MethodDecl m = (MethodDecl)iter.next();
        for(int j = i+1; j < getNumTypeBound(); j++) {
          TypeDecl destType = getTypeBound(j).type();
          for(Iterator destIter = destType.memberMethods(m.name()).iterator(); destIter.hasNext(); ) {
            MethodDecl n = (MethodDecl)destIter.next();
            if(m.sameSignature(n) && m.type() != n.type()) {
              error("the two bounds, " + type.name() + " and " + destType.name() + ", in type variable " + name() + 
                " have a method " + m.signature() + " with conflicting return types " + m.type().name() + " and " + n.type().name());
            }
          }
        }
      }
    }

    
  }

    // Declared in Generics.jrag at line 736

  public Access substitute(Parameterization parTypeDecl) {
    if(parTypeDecl.isRawType())
      return erasure().createBoundAccess();
    return parTypeDecl.substitute(this).createBoundAccess();
  }

    // Declared in Generics.jrag at line 781


  public Access substituteReturnType(Parameterization parTypeDecl) {
    if(parTypeDecl.isRawType())
      return erasure().createBoundAccess();
    TypeDecl typeDecl = parTypeDecl.substitute(this);
    if(typeDecl instanceof WildcardType) {
      // the bound of this type variable
      return createBoundAccess();
      //return lubType().createBoundAccess();
      //return typeObject().createBoundAccess();
    }
    else if(typeDecl instanceof WildcardExtendsType) {
      if(typeDecl.instanceOf(this))
        return ((WildcardExtendsType)typeDecl).extendsType().createBoundAccess();
      else 
        return createBoundAccess();

      // the bound of this type variable of the bound of the wild card if it is more specific
      //return ((WildcardExtendsType)typeDecl).extendsType().createBoundAccess();
    }
    else if(typeDecl instanceof WildcardSuperType) {
      // the bound of this type variable 
      return createBoundAccess();
      //return typeObject().createBoundAccess();
    }
    return typeDecl.createBoundAccess();
  }

    // Declared in Generics.jrag at line 815

  public Access substituteParameterType(Parameterization parTypeDecl) {
    if(parTypeDecl.isRawType())
      return erasure().createBoundAccess();
    TypeDecl typeDecl = parTypeDecl.substitute(this);
    if(typeDecl instanceof WildcardType)
      return typeNull().createQualifiedAccess();
    else if(typeDecl instanceof WildcardExtendsType)
      return typeNull().createQualifiedAccess();
    else if(typeDecl instanceof WildcardSuperType)
      return ((WildcardSuperType)typeDecl).superType().createBoundAccess();
    return typeDecl.createBoundAccess();
  }

    // Declared in Generics.jrag at line 1283


  public Access createQualifiedAccess() {
    return createBoundAccess();
  }

    // Declared in GenericsPrettyPrint.jrag at line 11

  public void toString(StringBuffer s) {
    s.append(name());
    if(getNumTypeBound() > 0) {
      s.append(" extends ");
      s.append(getTypeBound(0).type().fullName());
      for(int i = 1; i < getNumTypeBound(); i++) {
        s.append(" & ");
        s.append(getTypeBound(i).type().fullName());
      }
    }
  }

    // Declared in Generics.ast at line 3
    // Declared in Generics.ast line 15

    public TypeVariable() {
        super();

        setChild(new List(), 1);
        setChild(new List(), 2);

    }

    // Declared in Generics.ast at line 12


    // Declared in Generics.ast line 15
    public TypeVariable(Modifiers p0, String p1, List<BodyDecl> p2, List<Access> p3) {
        setChild(p0, 0);
        setID(p1);
        setChild(p2, 1);
        setChild(p3, 2);
    }

    // Declared in Generics.ast at line 20


    // Declared in Generics.ast line 15
    public TypeVariable(Modifiers p0, beaver.Symbol p1, List<BodyDecl> p2, List<Access> p3) {
        setChild(p0, 0);
        setID(p1);
        setChild(p2, 1);
        setChild(p3, 2);
    }

    // Declared in Generics.ast at line 27


  protected int numChildren() {
    return 3;
  }

    // Declared in Generics.ast at line 30

  public boolean mayHaveRewrite() { return true; }

    // Declared in Generics.ast at line 2
    // Declared in Generics.ast line 15
    public void setModifiers(Modifiers node) {
        setChild(node, 0);
    }

    // Declared in Generics.ast at line 5

    public Modifiers getModifiers() {
        return (Modifiers)getChild(0);
    }

    // Declared in Generics.ast at line 9


    public Modifiers getModifiersNoTransform() {
        return (Modifiers)getChildNoTransform(0);
    }

    // Declared in Generics.ast at line 2
    // Declared in Generics.ast line 15
    public void setID(String value) {
        tokenString_ID = value;
    }

    // Declared in Generics.ast at line 5

    public int IDstart;

    // Declared in Generics.ast at line 6

    public int IDend;

    // Declared in Generics.ast at line 7

    public void setID(beaver.Symbol symbol) {
        if(symbol.value != null && !(symbol.value instanceof String))
          throw new UnsupportedOperationException("setID is only valid for String lexemes");
        tokenString_ID = (String)symbol.value;
        IDstart = symbol.getStart();
        IDend = symbol.getEnd();
    }

    // Declared in Generics.ast at line 14

    public String getID() {
        return tokenString_ID != null ? tokenString_ID : "";
    }

    // Declared in Generics.ast at line 2
    // Declared in Generics.ast line 15
    public void setBodyDeclList(List<BodyDecl> list) {
        setChild(list, 1);
    }

    // Declared in Generics.ast at line 6


    private int getNumBodyDecl = 0;

    // Declared in Generics.ast at line 7

    public int getNumBodyDecl() {
        return getBodyDeclList().getNumChild();
    }

    // Declared in Generics.ast at line 11


     @SuppressWarnings({"unchecked", "cast"})  public BodyDecl getBodyDecl(int i) {
        return (BodyDecl)getBodyDeclList().getChild(i);
    }

    // Declared in Generics.ast at line 15


    public void addBodyDecl(BodyDecl node) {
        List<BodyDecl> list = getBodyDeclList();
        list.addChild(node);
    }

    // Declared in Generics.ast at line 20


    public void setBodyDecl(BodyDecl node, int i) {
        List<BodyDecl> list = getBodyDeclList();
        list.setChild(node, i);
    }

    // Declared in Generics.ast at line 24

    public List<BodyDecl> getBodyDecls() {
        return getBodyDeclList();
    }

    // Declared in Generics.ast at line 27

    public List<BodyDecl> getBodyDeclsNoTransform() {
        return getBodyDeclListNoTransform();
    }

    // Declared in Generics.ast at line 31


     @SuppressWarnings({"unchecked", "cast"})  public List<BodyDecl> getBodyDeclList() {
        return (List<BodyDecl>)getChild(1);
    }

    // Declared in Generics.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<BodyDecl> getBodyDeclListNoTransform() {
        return (List<BodyDecl>)getChildNoTransform(1);
    }

    // Declared in Generics.ast at line 2
    // Declared in Generics.ast line 15
    public void setTypeBoundList(List<Access> list) {
        setChild(list, 2);
    }

    // Declared in Generics.ast at line 6


    private int getNumTypeBound = 0;

    // Declared in Generics.ast at line 7

    public int getNumTypeBound() {
        return getTypeBoundList().getNumChild();
    }

    // Declared in Generics.ast at line 11


     @SuppressWarnings({"unchecked", "cast"})  public Access getTypeBound(int i) {
        return (Access)getTypeBoundList().getChild(i);
    }

    // Declared in Generics.ast at line 15


    public void addTypeBound(Access node) {
        List<Access> list = getTypeBoundList();
        list.addChild(node);
    }

    // Declared in Generics.ast at line 20


    public void setTypeBound(Access node, int i) {
        List<Access> list = getTypeBoundList();
        list.setChild(node, i);
    }

    // Declared in Generics.ast at line 24

    public List<Access> getTypeBounds() {
        return getTypeBoundList();
    }

    // Declared in Generics.ast at line 27

    public List<Access> getTypeBoundsNoTransform() {
        return getTypeBoundListNoTransform();
    }

    // Declared in Generics.ast at line 31


     @SuppressWarnings({"unchecked", "cast"})  public List<Access> getTypeBoundList() {
        return (List<Access>)getChild(2);
    }

    // Declared in Generics.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Access> getTypeBoundListNoTransform() {
        return (List<Access>)getChildNoTransform(2);
    }

    protected boolean toInterface_computed = false;
    protected TypeDecl toInterface_value;
    // Declared in GLBTypeFactory.jadd at line 12
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl toInterface() {
        if(toInterface_computed)
            return toInterface_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        toInterface_value = toInterface_compute();
        toInterface_value.setParent(this);
        toInterface_value.is$Final = true;
        if(true)
            toInterface_computed = true;
        return toInterface_value;
    }

    private TypeDecl toInterface_compute() {
    // convert var to interface
    InterfaceDecl ITj = new InterfaceDecl();
    ITj.setID("ITj_" + hashCode());
    // I'm assuming that TypeVariable has no members of it's own.
    // TODO: would it be enough to add only public members of a bound
    // that is TypeVariable or ClassDecl and add other (interface)
    // bounds as superinterfaces to ITj
    // TODO: Is it really necessary to add public members to the new
    // interface? Or is an empty interface more than enough since java
    // has a nominal type system.
    for (int i = 0; i < getNumTypeBound(); i++) {
      TypeDecl bound = getTypeBound(i).type();
      for (int j = 0; j < bound.getNumBodyDecl(); j++) {
        BodyDecl bd = bound.getBodyDecl(j);
        if (bd instanceof FieldDeclaration) {
          FieldDeclaration fd = (FieldDeclaration) bd.fullCopy();
          if (fd.isPublic())
            ITj.addBodyDecl(fd);
        } 
        else if (bd instanceof MethodDecl) {
          MethodDecl md = (MethodDecl) bd;
          if (md.isPublic())
            ITj.addBodyDecl((BodyDecl)md.fullCopy());
        }
      }
    }
    return ITj;
  }

    protected int involvesTypeParameters_visited;
    protected boolean involvesTypeParameters_computed = false;
    protected boolean involvesTypeParameters_initialized = false;
    protected boolean involvesTypeParameters_value;
 @SuppressWarnings({"unchecked", "cast"})     public boolean involvesTypeParameters() {
        if(involvesTypeParameters_computed)
            return involvesTypeParameters_value;
        if (!involvesTypeParameters_initialized) {
            involvesTypeParameters_initialized = true;
            involvesTypeParameters_value = false;
        }
        if (!IN_CIRCLE) {
            IN_CIRCLE = true;
            int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
            CIRCLE_INDEX = 1;
            do {
                involvesTypeParameters_visited = CIRCLE_INDEX;
                CHANGE = false;
                boolean new_involvesTypeParameters_value = involvesTypeParameters_compute();
                if (new_involvesTypeParameters_value!=involvesTypeParameters_value)
                    CHANGE = true;
                involvesTypeParameters_value = new_involvesTypeParameters_value; 
                CIRCLE_INDEX++;
            } while (CHANGE);
            if(isFinal && num == boundariesCrossed)
{
            involvesTypeParameters_computed = true;
            }
            else {
            RESET_CYCLE = true;
            involvesTypeParameters_compute();
            RESET_CYCLE = false;
              involvesTypeParameters_computed = false;
              involvesTypeParameters_initialized = false;
            }
            IN_CIRCLE = false; 
            return involvesTypeParameters_value;
        }
        if(involvesTypeParameters_visited != CIRCLE_INDEX) {
            involvesTypeParameters_visited = CIRCLE_INDEX;
            if (RESET_CYCLE) {
                involvesTypeParameters_computed = false;
                involvesTypeParameters_initialized = false;
                return involvesTypeParameters_value;
            }
            boolean new_involvesTypeParameters_value = involvesTypeParameters_compute();
            if (new_involvesTypeParameters_value!=involvesTypeParameters_value)
                CHANGE = true;
            involvesTypeParameters_value = new_involvesTypeParameters_value; 
            return involvesTypeParameters_value;
        }
        return involvesTypeParameters_value;
    }

    private boolean involvesTypeParameters_compute() {  return true;  }

    // Declared in GenericTypeVariables.jrag at line 33
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl lowerBound() {
        TypeDecl lowerBound_value = lowerBound_compute();
        return lowerBound_value;
    }

    private TypeDecl lowerBound_compute() {  return getTypeBound(0).type();  }

    // Declared in GenericTypeVariables.jrag at line 38
 @SuppressWarnings({"unchecked", "cast"})     public Collection memberMethods(String name) {
        Collection memberMethods_String_value = memberMethods_compute(name);
        return memberMethods_String_value;
    }

    private Collection memberMethods_compute(String name) {
    Collection list = new HashSet();
    for(int i = 0; i < getNumTypeBound(); i++) {
      for(Iterator iter = getTypeBound(i).type().memberMethods(name).iterator(); iter.hasNext(); ) {
        MethodDecl decl = (MethodDecl)iter.next();
        //if(decl.accessibleFrom(hostType()))
          list.add(decl);
      }
    }
    return list;
  }

    // Declared in GenericTypeVariables.jrag at line 50
 @SuppressWarnings({"unchecked", "cast"})     public SimpleSet memberFields(String name) {
        Object _parameters = name;
if(memberFields_String_values == null) memberFields_String_values = new java.util.HashMap(4);
        if(memberFields_String_values.containsKey(_parameters))
            return (SimpleSet)memberFields_String_values.get(_parameters);
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        SimpleSet memberFields_String_value = memberFields_compute(name);
        if(isFinal && num == boundariesCrossed)
            memberFields_String_values.put(_parameters, memberFields_String_value);
        return memberFields_String_value;
    }

    private SimpleSet memberFields_compute(String name) {
    SimpleSet set = SimpleSet.emptySet;
    for(int i = 0; i < getNumTypeBound(); i++) {
      for(Iterator iter = getTypeBound(i).type().memberFields(name).iterator(); iter.hasNext(); ) {
        FieldDeclaration decl = (FieldDeclaration)iter.next();
        //if(decl.accessibleFrom(hostType()))
          set = set.add(decl);
      }
    }
    return set;
  }

    // Declared in Generics.jrag at line 66
 @SuppressWarnings({"unchecked", "cast"})     public boolean castingConversionTo(TypeDecl type) {
        Object _parameters = type;
if(castingConversionTo_TypeDecl_values == null) castingConversionTo_TypeDecl_values = new java.util.HashMap(4);
        if(castingConversionTo_TypeDecl_values.containsKey(_parameters))
            return ((Boolean)castingConversionTo_TypeDecl_values.get(_parameters)).booleanValue();
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean castingConversionTo_TypeDecl_value = castingConversionTo_compute(type);
        if(isFinal && num == boundariesCrossed)
            castingConversionTo_TypeDecl_values.put(_parameters, Boolean.valueOf(castingConversionTo_TypeDecl_value));
        return castingConversionTo_TypeDecl_value;
    }

    private boolean castingConversionTo_compute(TypeDecl type) {
    if(!type.isReferenceType())
      return false;
    if(getNumTypeBound() == 0) return true;
    for(int i = 0; i < getNumTypeBound(); i++)
      if(getTypeBound(i).type().castingConversionTo(type))
        return true;
    return false;
  }

    // Declared in Generics.jrag at line 129
 @SuppressWarnings({"unchecked", "cast"})     public boolean isNestedType() {
        boolean isNestedType_value = isNestedType_compute();
        return isNestedType_value;
    }

    private boolean isNestedType_compute() {  return false;  }

    // Declared in Generics.jrag at line 319
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl erasure() {
        if(erasure_computed)
            return erasure_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        erasure_value = erasure_compute();
        if(isFinal && num == boundariesCrossed)
            erasure_computed = true;
        return erasure_value;
    }

    private TypeDecl erasure_compute() {  return getTypeBound(0).type().erasure();  }

    // Declared in Generics.jrag at line 530
 @SuppressWarnings({"unchecked", "cast"})     public String fullName() {
        if(fullName_computed)
            return fullName_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        fullName_value = fullName_compute();
        if(isFinal && num == boundariesCrossed)
            fullName_computed = true;
        return fullName_value;
    }

    private String fullName_compute() {
    if(getParent().getParent() instanceof TypeDecl) {
      TypeDecl typeDecl = (TypeDecl)getParent().getParent();
      return typeDecl.fullName() + "@" + name();
    }
    return super.fullName();
  }

    // Declared in Generics.jrag at line 543
 @SuppressWarnings({"unchecked", "cast"})     public boolean sameSignature(Access a) {
        boolean sameSignature_Access_value = sameSignature_compute(a);
        return sameSignature_Access_value;
    }

    private boolean sameSignature_compute(Access a) {  return a.type() == this;  }

    protected boolean lubType_computed = false;
    protected TypeDecl lubType_value;
    // Declared in Generics.jrag at line 774
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl lubType() {
        if(lubType_computed)
            return lubType_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        lubType_value = lubType_compute();
        if(isFinal && num == boundariesCrossed)
            lubType_computed = true;
        return lubType_value;
    }

    private TypeDecl lubType_compute() {
    ArrayList list = new ArrayList();
    for(int i = 0; i < getNumTypeBound(); i++)
      list.add(getTypeBound(i).type());
    return lookupLUBType(list);
  }

    protected int usesTypeVariable_visited;
    protected boolean usesTypeVariable_computed = false;
    protected boolean usesTypeVariable_initialized = false;
    protected boolean usesTypeVariable_value;
 @SuppressWarnings({"unchecked", "cast"})     public boolean usesTypeVariable() {
        if(usesTypeVariable_computed)
            return usesTypeVariable_value;
        if (!usesTypeVariable_initialized) {
            usesTypeVariable_initialized = true;
            usesTypeVariable_value = false;
        }
        if (!IN_CIRCLE) {
            IN_CIRCLE = true;
            int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
            CIRCLE_INDEX = 1;
            do {
                usesTypeVariable_visited = CIRCLE_INDEX;
                CHANGE = false;
                boolean new_usesTypeVariable_value = usesTypeVariable_compute();
                if (new_usesTypeVariable_value!=usesTypeVariable_value)
                    CHANGE = true;
                usesTypeVariable_value = new_usesTypeVariable_value; 
                CIRCLE_INDEX++;
            } while (CHANGE);
            if(isFinal && num == boundariesCrossed)
{
            usesTypeVariable_computed = true;
            }
            else {
            RESET_CYCLE = true;
            usesTypeVariable_compute();
            RESET_CYCLE = false;
              usesTypeVariable_computed = false;
              usesTypeVariable_initialized = false;
            }
            IN_CIRCLE = false; 
            return usesTypeVariable_value;
        }
        if(usesTypeVariable_visited != CIRCLE_INDEX) {
            usesTypeVariable_visited = CIRCLE_INDEX;
            if (RESET_CYCLE) {
                usesTypeVariable_computed = false;
                usesTypeVariable_initialized = false;
                return usesTypeVariable_value;
            }
            boolean new_usesTypeVariable_value = usesTypeVariable_compute();
            if (new_usesTypeVariable_value!=usesTypeVariable_value)
                CHANGE = true;
            usesTypeVariable_value = new_usesTypeVariable_value; 
            return usesTypeVariable_value;
        }
        return usesTypeVariable_value;
    }

    private boolean usesTypeVariable_compute() {  return true;  }

    // Declared in Generics.jrag at line 1287
 @SuppressWarnings({"unchecked", "cast"})     public boolean accessibleFrom(TypeDecl type) {
        Object _parameters = type;
if(accessibleFrom_TypeDecl_values == null) accessibleFrom_TypeDecl_values = new java.util.HashMap(4);
        if(accessibleFrom_TypeDecl_values.containsKey(_parameters))
            return ((Boolean)accessibleFrom_TypeDecl_values.get(_parameters)).booleanValue();
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean accessibleFrom_TypeDecl_value = accessibleFrom_compute(type);
        if(isFinal && num == boundariesCrossed)
            accessibleFrom_TypeDecl_values.put(_parameters, Boolean.valueOf(accessibleFrom_TypeDecl_value));
        return accessibleFrom_TypeDecl_value;
    }

    private boolean accessibleFrom_compute(TypeDecl type) {  return true;  }

    // Declared in Generics.jrag at line 1289
 @SuppressWarnings({"unchecked", "cast"})     public String typeName() {
        if(typeName_computed)
            return typeName_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        typeName_value = typeName_compute();
        if(isFinal && num == boundariesCrossed)
            typeName_computed = true;
        return typeName_value;
    }

    private String typeName_compute() {  return name();  }

    // Declared in GenericsParTypeDecl.jrag at line 71
 @SuppressWarnings({"unchecked", "cast"})     public boolean isTypeVariable() {
        boolean isTypeVariable_value = isTypeVariable_compute();
        return isTypeVariable_value;
    }

    private boolean isTypeVariable_compute() {  return true;  }

    // Declared in GenericsSubtype.jrag at line 49
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeWildcard(WildcardType type) {
        boolean supertypeWildcard_WildcardType_value = supertypeWildcard_compute(type);
        return supertypeWildcard_WildcardType_value;
    }

    private boolean supertypeWildcard_compute(WildcardType type) {  return true;  }

    // Declared in GenericsSubtype.jrag at line 60
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeWildcardExtends(WildcardExtendsType type) {
        boolean supertypeWildcardExtends_WildcardExtendsType_value = supertypeWildcardExtends_compute(type);
        return supertypeWildcardExtends_WildcardExtendsType_value;
    }

    private boolean supertypeWildcardExtends_compute(WildcardExtendsType type) {  return type.extendsType().subtype(this);  }

    // Declared in GenericsSubtype.jrag at line 69
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeWildcardSuper(WildcardSuperType type) {
        boolean supertypeWildcardSuper_WildcardSuperType_value = supertypeWildcardSuper_compute(type);
        return supertypeWildcardSuper_WildcardSuperType_value;
    }

    private boolean supertypeWildcardSuper_compute(WildcardSuperType type) {  return type.superType().subtype(this);  }

    protected java.util.Map sameStructure_TypeDecl_visited;
    protected java.util.Set sameStructure_TypeDecl_computed = new java.util.HashSet(4);
    protected java.util.Set sameStructure_TypeDecl_initialized = new java.util.HashSet(4);
    protected java.util.Map sameStructure_TypeDecl_values = new java.util.HashMap(4);
 @SuppressWarnings({"unchecked", "cast"})     public boolean sameStructure(TypeDecl t) {
        Object _parameters = t;
if(sameStructure_TypeDecl_visited == null) sameStructure_TypeDecl_visited = new java.util.HashMap(4);
if(sameStructure_TypeDecl_values == null) sameStructure_TypeDecl_values = new java.util.HashMap(4);
        if(sameStructure_TypeDecl_computed.contains(_parameters))
            return ((Boolean)sameStructure_TypeDecl_values.get(_parameters)).booleanValue();
        if (!sameStructure_TypeDecl_initialized.contains(_parameters)) {
            sameStructure_TypeDecl_initialized.add(_parameters);
            sameStructure_TypeDecl_values.put(_parameters, Boolean.valueOf(true));
        }
        if (!IN_CIRCLE) {
            IN_CIRCLE = true;
            int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
            CIRCLE_INDEX = 1;
            boolean new_sameStructure_TypeDecl_value;
            do {
                sameStructure_TypeDecl_visited.put(_parameters, new Integer(CIRCLE_INDEX));
                CHANGE = false;
                new_sameStructure_TypeDecl_value = sameStructure_compute(t);
                if (new_sameStructure_TypeDecl_value!=((Boolean)sameStructure_TypeDecl_values.get(_parameters)).booleanValue())
                    CHANGE = true;
                sameStructure_TypeDecl_values.put(_parameters, Boolean.valueOf(new_sameStructure_TypeDecl_value));
                CIRCLE_INDEX++;
            } while (CHANGE);
            if(isFinal && num == boundariesCrossed)
{
            sameStructure_TypeDecl_computed.add(_parameters);
            }
            else {
            RESET_CYCLE = true;
            sameStructure_compute(t);
            RESET_CYCLE = false;
            sameStructure_TypeDecl_computed.remove(_parameters);
            sameStructure_TypeDecl_initialized.remove(_parameters);
            }
            IN_CIRCLE = false; 
            return new_sameStructure_TypeDecl_value;
        }
        if(!new Integer(CIRCLE_INDEX).equals(sameStructure_TypeDecl_visited.get(_parameters))) {
            sameStructure_TypeDecl_visited.put(_parameters, new Integer(CIRCLE_INDEX));
            if (RESET_CYCLE) {
                sameStructure_TypeDecl_computed.remove(_parameters);
                sameStructure_TypeDecl_initialized.remove(_parameters);
                return ((Boolean)sameStructure_TypeDecl_values.get(_parameters)).booleanValue();
            }
            boolean new_sameStructure_TypeDecl_value = sameStructure_compute(t);
            if (new_sameStructure_TypeDecl_value!=((Boolean)sameStructure_TypeDecl_values.get(_parameters)).booleanValue())
                CHANGE = true;
            sameStructure_TypeDecl_values.put(_parameters, Boolean.valueOf(new_sameStructure_TypeDecl_value));
            return new_sameStructure_TypeDecl_value;
        }
        return ((Boolean)sameStructure_TypeDecl_values.get(_parameters)).booleanValue();
    }

    private boolean sameStructure_compute(TypeDecl t) {
    if(!(t instanceof TypeVariable))
      return false;
    if(t == this)
      return true;
    TypeVariable type = (TypeVariable)t;
    if(type.getNumTypeBound() != getNumTypeBound())
      return false;
    for(int i = 0; i < getNumTypeBound(); i++) {
      boolean found = false;
      for(int j = i; !found && j < getNumTypeBound(); j++)
        if(getTypeBound(i).type().sameStructure(type.getTypeBound(j).type()))
          found = true;
      if(!found)
        return false;
    }
    return true;
  }

    // Declared in GenericsSubtype.jrag at line 282
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeArrayDecl(ArrayDecl type) {
        boolean supertypeArrayDecl_ArrayDecl_value = supertypeArrayDecl_compute(type);
        return supertypeArrayDecl_ArrayDecl_value;
    }

    private boolean supertypeArrayDecl_compute(ArrayDecl type) {
    for(int i = 0; i < getNumTypeBound(); i++)
      if(type.subtype(getTypeBound(i).type())) {
        return true;
      }
    return false;
  }

    protected java.util.Map subtype_TypeDecl_visited;
    protected java.util.Set subtype_TypeDecl_computed = new java.util.HashSet(4);
    protected java.util.Set subtype_TypeDecl_initialized = new java.util.HashSet(4);
    protected java.util.Map subtype_TypeDecl_values = new java.util.HashMap(4);
 @SuppressWarnings({"unchecked", "cast"})     public boolean subtype(TypeDecl type) {
        Object _parameters = type;
if(subtype_TypeDecl_visited == null) subtype_TypeDecl_visited = new java.util.HashMap(4);
if(subtype_TypeDecl_values == null) subtype_TypeDecl_values = new java.util.HashMap(4);
        if(subtype_TypeDecl_computed.contains(_parameters))
            return ((Boolean)subtype_TypeDecl_values.get(_parameters)).booleanValue();
        if (!subtype_TypeDecl_initialized.contains(_parameters)) {
            subtype_TypeDecl_initialized.add(_parameters);
            subtype_TypeDecl_values.put(_parameters, Boolean.valueOf(true));
        }
        if (!IN_CIRCLE) {
            IN_CIRCLE = true;
            int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
            CIRCLE_INDEX = 1;
            boolean new_subtype_TypeDecl_value;
            do {
                subtype_TypeDecl_visited.put(_parameters, new Integer(CIRCLE_INDEX));
                CHANGE = false;
                new_subtype_TypeDecl_value = subtype_compute(type);
                if (new_subtype_TypeDecl_value!=((Boolean)subtype_TypeDecl_values.get(_parameters)).booleanValue())
                    CHANGE = true;
                subtype_TypeDecl_values.put(_parameters, Boolean.valueOf(new_subtype_TypeDecl_value));
                CIRCLE_INDEX++;
            } while (CHANGE);
            if(isFinal && num == boundariesCrossed)
{
            subtype_TypeDecl_computed.add(_parameters);
            }
            else {
            RESET_CYCLE = true;
            subtype_compute(type);
            RESET_CYCLE = false;
            subtype_TypeDecl_computed.remove(_parameters);
            subtype_TypeDecl_initialized.remove(_parameters);
            }
            IN_CIRCLE = false; 
            return new_subtype_TypeDecl_value;
        }
        if(!new Integer(CIRCLE_INDEX).equals(subtype_TypeDecl_visited.get(_parameters))) {
            subtype_TypeDecl_visited.put(_parameters, new Integer(CIRCLE_INDEX));
            if (RESET_CYCLE) {
                subtype_TypeDecl_computed.remove(_parameters);
                subtype_TypeDecl_initialized.remove(_parameters);
                return ((Boolean)subtype_TypeDecl_values.get(_parameters)).booleanValue();
            }
            boolean new_subtype_TypeDecl_value = subtype_compute(type);
            if (new_subtype_TypeDecl_value!=((Boolean)subtype_TypeDecl_values.get(_parameters)).booleanValue())
                CHANGE = true;
            subtype_TypeDecl_values.put(_parameters, Boolean.valueOf(new_subtype_TypeDecl_value));
            return new_subtype_TypeDecl_value;
        }
        return ((Boolean)subtype_TypeDecl_values.get(_parameters)).booleanValue();
    }

    private boolean subtype_compute(TypeDecl type) {  return type.supertypeTypeVariable(this);  }

    // Declared in GenericsSubtype.jrag at line 299
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeTypeVariable(TypeVariable type) {
        boolean supertypeTypeVariable_TypeVariable_value = supertypeTypeVariable_compute(type);
        return supertypeTypeVariable_TypeVariable_value;
    }

    private boolean supertypeTypeVariable_compute(TypeVariable type) {
    if(type == this)
      return true;
    for(int i = 0; i < getNumTypeBound(); i++) {
      boolean found = false;
      for(int j = 0; !found && j < type.getNumTypeBound(); j++) {
        if(type.getSubstitutedTypeBound(j, this).type().subtype(getTypeBound(i).type()))
          found = true;
      }
      if(!found)
        return false;
    }
    return true;
  }

    protected java.util.Map getSubstitutedTypeBound_int_TypeDecl_values;
    // Declared in GenericsSubtype.jrag at line 314
 @SuppressWarnings({"unchecked", "cast"})     public Access getSubstitutedTypeBound(int i, TypeDecl type) {
        java.util.List _parameters = new java.util.ArrayList(2);
        _parameters.add(new Integer(i));
        _parameters.add(type);
if(getSubstitutedTypeBound_int_TypeDecl_values == null) getSubstitutedTypeBound_int_TypeDecl_values = new java.util.HashMap(4);
        if(getSubstitutedTypeBound_int_TypeDecl_values.containsKey(_parameters))
            return (Access)getSubstitutedTypeBound_int_TypeDecl_values.get(_parameters);
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        Access getSubstitutedTypeBound_int_TypeDecl_value = getSubstitutedTypeBound_compute(i, type);
        if(isFinal && num == boundariesCrossed)
            getSubstitutedTypeBound_int_TypeDecl_values.put(_parameters, getSubstitutedTypeBound_int_TypeDecl_value);
        return getSubstitutedTypeBound_int_TypeDecl_value;
    }

    private Access getSubstitutedTypeBound_compute(int i, TypeDecl type) {
    Access bound = getTypeBound(i);
    if(!bound.type().usesTypeVariable())
      return bound;
    final TypeDecl typeDecl = type;
    Access access = bound.type().substitute(
      new Parameterization() {
    		public boolean isRawType() { 
    			return false; 
    		}
    		public TypeDecl substitute(TypeVariable typeVariable) {
    			return typeVariable == TypeVariable.this ? typeDecl : typeVariable;
    		} 
    	}
    );
    access.setParent(this);
    return access;
  }

    // Declared in GenericsSubtype.jrag at line 333
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeClassDecl(ClassDecl type) {
        boolean supertypeClassDecl_ClassDecl_value = supertypeClassDecl_compute(type);
        return supertypeClassDecl_ClassDecl_value;
    }

    private boolean supertypeClassDecl_compute(ClassDecl type) {
    for(int i = 0; i < getNumTypeBound(); i++)
      if(!type.subtype(getSubstitutedTypeBound(i, type).type()))
        return false;
    return true;
  }

    // Declared in GenericsSubtype.jrag at line 339
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeInterfaceDecl(InterfaceDecl type) {
        boolean supertypeInterfaceDecl_InterfaceDecl_value = supertypeInterfaceDecl_compute(type);
        return supertypeInterfaceDecl_InterfaceDecl_value;
    }

    private boolean supertypeInterfaceDecl_compute(InterfaceDecl type) {
    for(int i = 0; i < getNumTypeBound(); i++)
      if(!type.subtype(getSubstitutedTypeBound(i, type).type()))
        return false;
    return true;
  }

    // Declared in GenericsSubtype.jrag at line 400
 @SuppressWarnings({"unchecked", "cast"})     public boolean instanceOf(TypeDecl type) {
        Object _parameters = type;
if(instanceOf_TypeDecl_values == null) instanceOf_TypeDecl_values = new java.util.HashMap(4);
        if(instanceOf_TypeDecl_values.containsKey(_parameters))
            return ((Boolean)instanceOf_TypeDecl_values.get(_parameters)).booleanValue();
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        boolean instanceOf_TypeDecl_value = instanceOf_compute(type);
        if(isFinal && num == boundariesCrossed)
            instanceOf_TypeDecl_values.put(_parameters, Boolean.valueOf(instanceOf_TypeDecl_value));
        return instanceOf_TypeDecl_value;
    }

    private boolean instanceOf_compute(TypeDecl type) {  return subtype(type);  }

    // Declared in Generics.jrag at line 772
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl typeObject() {
        TypeDecl typeObject_value = getParent().Define_TypeDecl_typeObject(this, null);
        return typeObject_value;
    }

    // Declared in Generics.jrag at line 814
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl typeNull() {
        TypeDecl typeNull_value = getParent().Define_TypeDecl_typeNull(this, null);
        return typeNull_value;
    }

    // Declared in GenericTypeVariables.jrag at line 13
    public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
        if(caller == getTypeBoundListNoTransform()) {
      int childIndex = caller.getIndexOfChild(child);
            return NameType.TYPE_NAME;
        }
        return super.Define_NameType_nameType(caller, child);
    }

public ASTNode rewriteTo() {
    // Declared in GenericTypeVariables.jrag at line 16
    if(getNumTypeBound() == 0) {
        duringGenericTypeVariables++;
        ASTNode result = rewriteRule0();
        duringGenericTypeVariables--;
        return result;
    }

    return super.rewriteTo();
}

    // Declared in GenericTypeVariables.jrag at line 16
    private TypeVariable rewriteRule0() {
{
			addTypeBound(
        new TypeAccess(
          "java.lang",
          "Object"
        )
      );
			return this;
		}    }
}
