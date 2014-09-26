
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;



public class ParInterfaceDecl extends InterfaceDecl implements Cloneable, ParTypeDecl, MemberSubstitutor {
    public void flushCache() {
        super.flushCache();
        involvesTypeParameters_visited = 0;
        erasure_computed = false;
        erasure_value = null;
        getSuperInterfaceIdList_computed = false;
        getSuperInterfaceIdList_value = null;
        getBodyDeclList_computed = false;
        getBodyDeclList_value = null;
        subtype_TypeDecl_visited = new java.util.HashMap(4);
        sameStructure_TypeDecl_visited = new java.util.HashMap(4);
        instanceOf_TypeDecl_values = null;
        sameSignature_ArrayList_visited = new java.util.HashMap(4);
        sameSignature_ArrayList_values = null;
        sameSignature_ArrayList_computed = new java.util.HashSet(4);
        sameSignature_ArrayList_initialized = new java.util.HashSet(4);
        usesTypeVariable_visited = 0;
        usesTypeVariable_computed = false;
        usesTypeVariable_initialized = false;
        sourceTypeDecl_computed = false;
        sourceTypeDecl_value = null;
        fullName_computed = false;
        fullName_value = null;
        typeName_computed = false;
        typeName_value = null;
        unimplementedMethods_computed = false;
        unimplementedMethods_value = null;
        localMethodsSignatureMap_computed = false;
        localMethodsSignatureMap_value = null;
        localFields_String_values = null;
        localTypeDecls_String_values = null;
        constructors_computed = false;
        constructors_value = null;
        genericDecl_computed = false;
        genericDecl_value = null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ParInterfaceDecl clone() throws CloneNotSupportedException {
        ParInterfaceDecl node = (ParInterfaceDecl)super.clone();
        node.involvesTypeParameters_visited = 0;
        node.erasure_computed = false;
        node.erasure_value = null;
        node.getSuperInterfaceIdList_computed = false;
        node.getSuperInterfaceIdList_value = null;
        node.getBodyDeclList_computed = false;
        node.getBodyDeclList_value = null;
        node.subtype_TypeDecl_visited = new java.util.HashMap(4);
        node.sameStructure_TypeDecl_visited = new java.util.HashMap(4);
        node.instanceOf_TypeDecl_values = null;
        node.sameSignature_ArrayList_visited = new java.util.HashMap(4);
        node.sameSignature_ArrayList_values = null;
        node.sameSignature_ArrayList_computed = new java.util.HashSet(4);
        node.sameSignature_ArrayList_initialized = new java.util.HashSet(4);
        node.usesTypeVariable_visited = 0;
        node.usesTypeVariable_computed = false;
        node.usesTypeVariable_initialized = false;
        node.sourceTypeDecl_computed = false;
        node.sourceTypeDecl_value = null;
        node.fullName_computed = false;
        node.fullName_value = null;
        node.typeName_computed = false;
        node.typeName_value = null;
        node.unimplementedMethods_computed = false;
        node.unimplementedMethods_value = null;
        node.localMethodsSignatureMap_computed = false;
        node.localMethodsSignatureMap_value = null;
        node.localFields_String_values = null;
        node.localTypeDecls_String_values = null;
        node.constructors_computed = false;
        node.constructors_value = null;
        node.genericDecl_computed = false;
        node.genericDecl_value = null;
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ParInterfaceDecl copy() {
      try {
          ParInterfaceDecl node = (ParInterfaceDecl)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public ParInterfaceDecl fullCopy() {
        ParInterfaceDecl res = (ParInterfaceDecl)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in Generics.jrag at line 524

  public void collectErrors() {
    // Disable error check for ParInterfaceDecl which is an instanciated GenericInterfaceDecl
  }

    // Declared in Generics.ast at line 3
    // Declared in Generics.ast line 9

    public ParInterfaceDecl() {
        super();

        setChild(new List(), 1);
        setChild(new List(), 2);
        setChild(new List(), 3);

    }

    // Declared in Generics.ast at line 13


    // Declared in Generics.ast line 9
    public ParInterfaceDecl(Modifiers p0, String p1, List<Access> p2) {
        setChild(p0, 0);
        setID(p1);
        setChild(p2, 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
    }

    // Declared in Generics.ast at line 22


    // Declared in Generics.ast line 9
    public ParInterfaceDecl(Modifiers p0, beaver.Symbol p1, List<Access> p2) {
        setChild(p0, 0);
        setID(p1);
        setChild(p2, 1);
        setChild(new List(), 2);
        setChild(new List(), 3);
    }

    // Declared in Generics.ast at line 30


  protected int numChildren() {
    return 2;
  }

    // Declared in Generics.ast at line 33

  public boolean mayHaveRewrite() { return false; }

    // Declared in java.ast at line 2
    // Declared in java.ast line 64
    public void setModifiers(Modifiers node) {
        setChild(node, 0);
    }

    // Declared in java.ast at line 5

    public Modifiers getModifiers() {
        return (Modifiers)getChild(0);
    }

    // Declared in java.ast at line 9


    public Modifiers getModifiersNoTransform() {
        return (Modifiers)getChildNoTransform(0);
    }

    // Declared in java.ast at line 2
    // Declared in java.ast line 64
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

    // Declared in Generics.ast at line 2
    // Declared in Generics.ast line 9
    public void setArgumentList(List<Access> list) {
        setChild(list, 1);
    }

    // Declared in Generics.ast at line 6


    private int getNumArgument = 0;

    // Declared in Generics.ast at line 7

    public int getNumArgument() {
        return getArgumentList().getNumChild();
    }

    // Declared in Generics.ast at line 11


     @SuppressWarnings({"unchecked", "cast"})  public Access getArgument(int i) {
        return (Access)getArgumentList().getChild(i);
    }

    // Declared in Generics.ast at line 15


    public void addArgument(Access node) {
        List<Access> list = getArgumentList();
        list.addChild(node);
    }

    // Declared in Generics.ast at line 20


    public void setArgument(Access node, int i) {
        List<Access> list = getArgumentList();
        list.setChild(node, i);
    }

    // Declared in Generics.ast at line 24

    public List<Access> getArguments() {
        return getArgumentList();
    }

    // Declared in Generics.ast at line 27

    public List<Access> getArgumentsNoTransform() {
        return getArgumentListNoTransform();
    }

    // Declared in Generics.ast at line 31


     @SuppressWarnings({"unchecked", "cast"})  public List<Access> getArgumentList() {
        return (List<Access>)getChild(1);
    }

    // Declared in Generics.ast at line 35


     @SuppressWarnings({"unchecked", "cast"})  public List<Access> getArgumentListNoTransform() {
        return (List<Access>)getChildNoTransform(1);
    }

    // Declared in Generics.ast at line 2
    // Declared in Generics.ast line 9
    public void setSuperInterfaceIdList(List<Access> list) {
        setChild(list, 2);
    }

    // Declared in Generics.ast at line 6


    private int getNumSuperInterfaceId = 0;

    // Declared in Generics.ast at line 7

    public int getNumSuperInterfaceId() {
        return getSuperInterfaceIdList().getNumChild();
    }

    // Declared in Generics.ast at line 11


     @SuppressWarnings({"unchecked", "cast"})  public Access getSuperInterfaceId(int i) {
        return (Access)getSuperInterfaceIdList().getChild(i);
    }

    // Declared in Generics.ast at line 15


    public void addSuperInterfaceId(Access node) {
        List<Access> list = getSuperInterfaceIdList();
        list.addChild(node);
    }

    // Declared in Generics.ast at line 20


    public void setSuperInterfaceId(Access node, int i) {
        List<Access> list = getSuperInterfaceIdList();
        list.setChild(node, i);
    }

    // Declared in Generics.ast at line 24

    public List<Access> getSuperInterfaceIds() {
        return getSuperInterfaceIdList();
    }

    // Declared in Generics.ast at line 27

    public List<Access> getSuperInterfaceIdsNoTransform() {
        return getSuperInterfaceIdListNoTransform();
    }

    // Declared in Generics.ast at line 31


    public List<Access> getSuperInterfaceIdListNoTransform() {
        return (List<Access>)getChildNoTransform(2);
    }

    // Declared in Generics.ast at line 35


    protected int getSuperInterfaceIdListChildPosition() {
        return 2;
    }

    // Declared in Generics.ast at line 2
    // Declared in Generics.ast line 9
    public void setBodyDeclList(List<BodyDecl> list) {
        setChild(list, 3);
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


    public List<BodyDecl> getBodyDeclListNoTransform() {
        return (List<BodyDecl>)getChildNoTransform(3);
    }

    // Declared in Generics.ast at line 35


    protected int getBodyDeclListChildPosition() {
        return 3;
    }

    // Declared in Generics.jrag at line 693

  public TypeDecl substitute(TypeVariable typeVariable) {
    for(int i = 0; i < numTypeParameter(); i++)
      if(typeParameter(i) == typeVariable)
        return getArgument(i).type();
    return super.substitute(typeVariable);
  }

    // Declared in Generics.jrag at line 706


  public int numTypeParameter() {
    return ((GenericTypeDecl)original()).getNumTypeParameter(); 
  }

    // Declared in Generics.jrag at line 709

  public TypeVariable typeParameter(int index) {
    return ((GenericTypeDecl)original()).getTypeParameter(index);
  }

    // Declared in Generics.jrag at line 741

  public Access substitute(Parameterization parTypeDecl) {
    // TODO: include nesting as well....
    if(parTypeDecl.isRawType())
      return ((GenericTypeDecl)genericDecl()).rawType().createBoundAccess();
    if(!usesTypeVariable())
      return super.substitute(parTypeDecl);
    List list = new List();
    for(int i = 0; i < getNumArgument(); i++)
      list.add(getArgument(i).type().substitute(parTypeDecl));
    return new ParTypeAccess(genericDecl().createQualifiedAccess(), list);
  }

    // Declared in GenericsParTypeDecl.jrag at line 73


  public Access createQualifiedAccess() {
    List typeArgumentList = (List)getArgumentList().fullCopy();
    if(!isTopLevelType()) {
      return enclosingType().createQualifiedAccess().qualifiesAccess(
        new ParTypeAccess(new TypeAccess("", getID()), typeArgumentList)
      );
    }
    else {
      return new ParTypeAccess(new TypeAccess(packageName(), getID()), typeArgumentList);
    }
  }

    // Declared in GenericsCodegen.jrag at line 402


  public void transformation() {
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

    private boolean involvesTypeParameters_compute() {
    for(int i = 0; i < getNumArgument(); i++)
      if(getArgument(i).type().involvesTypeParameters())
        return true;
    return false;
  }

    // Declared in Generics.jrag at line 232
 @SuppressWarnings({"unchecked", "cast"})     public boolean isRawType() {
        boolean isRawType_value = isRawType_compute();
        return isRawType_value;
    }

    private boolean isRawType_compute() {  return isNestedType() && enclosingType().isRawType();  }

    // Declared in Generics.jrag at line 318
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

    private TypeDecl erasure_compute() {  return genericDecl();  }

    protected boolean getSuperInterfaceIdList_computed = false;
    protected List getSuperInterfaceIdList_value;
    // Declared in Generics.jrag at line 888
 @SuppressWarnings({"unchecked", "cast"})     public List getSuperInterfaceIdList() {
        if(getSuperInterfaceIdList_computed)
            return (List)ASTNode.getChild(this, getSuperInterfaceIdListChildPosition());
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        getSuperInterfaceIdList_value = getSuperInterfaceIdList_compute();
        setSuperInterfaceIdList(getSuperInterfaceIdList_value);
        if(isFinal && num == boundariesCrossed)
            getSuperInterfaceIdList_computed = true;
        return (List)ASTNode.getChild(this, getSuperInterfaceIdListChildPosition());
    }

    private List getSuperInterfaceIdList_compute() {
    GenericInterfaceDecl decl = (GenericInterfaceDecl)genericDecl();
    //System.err.println("Begin substituting implements list");
    List list = decl.getSuperInterfaceIdList().substitute(this);
    //System.err.println("End substituting implements list");
    return list;
  }

    protected boolean getBodyDeclList_computed = false;
    protected List getBodyDeclList_value;
    // Declared in Generics.jrag at line 895
 @SuppressWarnings({"unchecked", "cast"})     public List getBodyDeclList() {
        if(getBodyDeclList_computed)
            return (List)ASTNode.getChild(this, getBodyDeclListChildPosition());
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        getBodyDeclList_value = getBodyDeclList_compute();
        setBodyDeclList(getBodyDeclList_value);
        if(isFinal && num == boundariesCrossed)
            getBodyDeclList_computed = true;
        return (List)ASTNode.getChild(this, getBodyDeclListChildPosition());
    }

    private List getBodyDeclList_compute() {  return new List();  }

    // Declared in GenericsSubtype.jrag at line 36
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeGenericClassDecl(GenericClassDecl type) {
        boolean supertypeGenericClassDecl_GenericClassDecl_value = supertypeGenericClassDecl_compute(type);
        return supertypeGenericClassDecl_GenericClassDecl_value;
    }

    private boolean supertypeGenericClassDecl_compute(GenericClassDecl type) {  return type.subtype(genericDecl().original());  }

    // Declared in GenericsSubtype.jrag at line 38
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeGenericInterfaceDecl(GenericInterfaceDecl type) {
        boolean supertypeGenericInterfaceDecl_GenericInterfaceDecl_value = supertypeGenericInterfaceDecl_compute(type);
        return supertypeGenericInterfaceDecl_GenericInterfaceDecl_value;
    }

    private boolean supertypeGenericInterfaceDecl_compute(GenericInterfaceDecl type) {  return type.subtype(genericDecl().original());  }

    // Declared in GenericsSubtype.jrag at line 107
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeClassDecl(ClassDecl type) {
        boolean supertypeClassDecl_ClassDecl_value = supertypeClassDecl_compute(type);
        return supertypeClassDecl_ClassDecl_value;
    }

    private boolean supertypeClassDecl_compute(ClassDecl type) {  return super.supertypeClassDecl(type);  }

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

    private boolean subtype_compute(TypeDecl type) {  return type.supertypeParInterfaceDecl(this);  }

    // Declared in GenericsSubtype.jrag at line 136
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeRawClassDecl(RawClassDecl type) {
        boolean supertypeRawClassDecl_RawClassDecl_value = supertypeRawClassDecl_compute(type);
        return supertypeRawClassDecl_RawClassDecl_value;
    }

    private boolean supertypeRawClassDecl_compute(RawClassDecl type) {  return type.genericDecl().original().subtype(genericDecl().original());  }

    // Declared in GenericsSubtype.jrag at line 138
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeRawInterfaceDecl(RawInterfaceDecl type) {
        boolean supertypeRawInterfaceDecl_RawInterfaceDecl_value = supertypeRawInterfaceDecl_compute(type);
        return supertypeRawInterfaceDecl_RawInterfaceDecl_value;
    }

    private boolean supertypeRawInterfaceDecl_compute(RawInterfaceDecl type) {  return type.genericDecl().original().subtype(genericDecl().original());  }

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
    if(!(t instanceof ParInterfaceDecl))
      return false;
    ParInterfaceDecl type = (ParInterfaceDecl)t;
    if(type.genericDecl().original() == genericDecl().original() &&
       type.getNumArgument() == getNumArgument()) {
      for(int i = 0; i < getNumArgument(); i++)
        if(!type.getArgument(i).type().sameStructure(getArgument(i).type()))
          return false;
      if(isNestedType() && type.isNestedType())
        return type.enclosingType().sameStructure(enclosingType());
      return true;
    }
    return false;
  }

    // Declared in GenericsSubtype.jrag at line 248
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeParClassDecl(ParClassDecl type) {
        boolean supertypeParClassDecl_ParClassDecl_value = supertypeParClassDecl_compute(type);
        return supertypeParClassDecl_ParClassDecl_value;
    }

    private boolean supertypeParClassDecl_compute(ParClassDecl type) {
    if(type.genericDecl().original() == genericDecl().original() &&
       type.getNumArgument() == getNumArgument()) {
      for(int i = 0; i < getNumArgument(); i++)
        if(!type.getArgument(i).type().containedIn(getArgument(i).type()))
          return false;
      if(isNestedType() && type.isNestedType())
        return type.enclosingType().subtype(enclosingType());
      return true;
    }
    return supertypeClassDecl(type);
  }

    // Declared in GenericsSubtype.jrag at line 260
 @SuppressWarnings({"unchecked", "cast"})     public boolean supertypeParInterfaceDecl(ParInterfaceDecl type) {
        boolean supertypeParInterfaceDecl_ParInterfaceDecl_value = supertypeParInterfaceDecl_compute(type);
        return supertypeParInterfaceDecl_ParInterfaceDecl_value;
    }

    private boolean supertypeParInterfaceDecl_compute(ParInterfaceDecl type) {
    if(type.genericDecl().original() == genericDecl().original() &&
       type.getNumArgument() == getNumArgument()) {
      for(int i = 0; i < getNumArgument(); i++)
        if(!type.getArgument(i).type().containedIn(getArgument(i).type()))
          return false;
      if(isNestedType() && type.isNestedType())
        return type.enclosingType().subtype(enclosingType());
      return true;
    }
    return supertypeInterfaceDecl(type);
  }

    // Declared in GenericsSubtype.jrag at line 398
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

    // Declared in Generics.jrag at line 228
 @SuppressWarnings({"unchecked", "cast"})     public boolean isParameterizedType() {
        boolean isParameterizedType_value = isParameterizedType_compute();
        return isParameterizedType_value;
    }

    private boolean isParameterizedType_compute() {  return true;  }

    // Declared in Generics.jrag at line 347
 @SuppressWarnings({"unchecked", "cast"})     public boolean sameArgument(ParTypeDecl decl) {
        boolean sameArgument_ParTypeDecl_value = sameArgument_compute(decl);
        return sameArgument_ParTypeDecl_value;
    }

    private boolean sameArgument_compute(ParTypeDecl decl) {
    if(this == decl) return true;
    if(genericDecl() != decl.genericDecl())
      return false;
    for(int i = 0; i < getNumArgument(); i++) {
      TypeDecl t1 = getArgument(i).type();
      TypeDecl t2 = decl.getArgument(i).type();
      if(t1 instanceof ParTypeDecl && t2 instanceof ParTypeDecl) {
        if(!((ParTypeDecl)t1).sameArgument((ParTypeDecl)t2))
          return false;
      }
      else {
        if(t1 != t2)
          return false;
      }
    }
    return true;
  }

    // Declared in Generics.jrag at line 544
 @SuppressWarnings({"unchecked", "cast"})     public boolean sameSignature(Access a) {
        boolean sameSignature_Access_value = sameSignature_compute(a);
        return sameSignature_Access_value;
    }

    private boolean sameSignature_compute(Access a) {
    if(a instanceof ParTypeAccess) {
      ParTypeAccess ta = (ParTypeAccess)a;
      if(genericDecl() != ta.genericDecl())
        return false;
      if(getNumArgument() != ta.getNumTypeArgument())
        return false;
      for(int i = 0; i < getNumArgument(); i++)
        if(!getArgument(i).type().sameSignature(ta.getTypeArgument(i)))
          return false;
      return true;
    }
    else if(a instanceof TypeAccess && ((TypeAccess)a).isRaw())
      return false;
    return super.sameSignature(a);
  }

    protected java.util.Map sameSignature_ArrayList_visited;
    protected java.util.Set sameSignature_ArrayList_computed = new java.util.HashSet(4);
    protected java.util.Set sameSignature_ArrayList_initialized = new java.util.HashSet(4);
    protected java.util.Map sameSignature_ArrayList_values = new java.util.HashMap(4);
 @SuppressWarnings({"unchecked", "cast"})     public boolean sameSignature(ArrayList list) {
        Object _parameters = list;
if(sameSignature_ArrayList_visited == null) sameSignature_ArrayList_visited = new java.util.HashMap(4);
if(sameSignature_ArrayList_values == null) sameSignature_ArrayList_values = new java.util.HashMap(4);
        if(sameSignature_ArrayList_computed.contains(_parameters))
            return ((Boolean)sameSignature_ArrayList_values.get(_parameters)).booleanValue();
        if (!sameSignature_ArrayList_initialized.contains(_parameters)) {
            sameSignature_ArrayList_initialized.add(_parameters);
            sameSignature_ArrayList_values.put(_parameters, Boolean.valueOf(true));
        }
        if (!IN_CIRCLE) {
            IN_CIRCLE = true;
            int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
            CIRCLE_INDEX = 1;
            boolean new_sameSignature_ArrayList_value;
            do {
                sameSignature_ArrayList_visited.put(_parameters, new Integer(CIRCLE_INDEX));
                CHANGE = false;
                new_sameSignature_ArrayList_value = sameSignature_compute(list);
                if (new_sameSignature_ArrayList_value!=((Boolean)sameSignature_ArrayList_values.get(_parameters)).booleanValue())
                    CHANGE = true;
                sameSignature_ArrayList_values.put(_parameters, Boolean.valueOf(new_sameSignature_ArrayList_value));
                CIRCLE_INDEX++;
            } while (CHANGE);
            if(isFinal && num == boundariesCrossed)
{
            sameSignature_ArrayList_computed.add(_parameters);
            }
            else {
            RESET_CYCLE = true;
            sameSignature_compute(list);
            RESET_CYCLE = false;
            sameSignature_ArrayList_computed.remove(_parameters);
            sameSignature_ArrayList_initialized.remove(_parameters);
            }
            IN_CIRCLE = false; 
            return new_sameSignature_ArrayList_value;
        }
        if(!new Integer(CIRCLE_INDEX).equals(sameSignature_ArrayList_visited.get(_parameters))) {
            sameSignature_ArrayList_visited.put(_parameters, new Integer(CIRCLE_INDEX));
            if (RESET_CYCLE) {
                sameSignature_ArrayList_computed.remove(_parameters);
                sameSignature_ArrayList_initialized.remove(_parameters);
                return ((Boolean)sameSignature_ArrayList_values.get(_parameters)).booleanValue();
            }
            boolean new_sameSignature_ArrayList_value = sameSignature_compute(list);
            if (new_sameSignature_ArrayList_value!=((Boolean)sameSignature_ArrayList_values.get(_parameters)).booleanValue())
                CHANGE = true;
            sameSignature_ArrayList_values.put(_parameters, Boolean.valueOf(new_sameSignature_ArrayList_value));
            return new_sameSignature_ArrayList_value;
        }
        return ((Boolean)sameSignature_ArrayList_values.get(_parameters)).booleanValue();
    }

    private boolean sameSignature_compute(ArrayList list) {
    if(getNumArgument() != list.size())
      return false;
    for(int i = 0; i < list.size(); i++)
      if(getArgument(i).type() != list.get(i))
        return false;
    return true;
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

    private boolean usesTypeVariable_compute() {
    if(super.usesTypeVariable())
      return true;
    for(int i = 0; i < getNumArgument(); i++)
      if(getArgument(i).type().usesTypeVariable())
        return true;
    return false;
  }

    // Declared in Generics.jrag at line 1100
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl original() {
        TypeDecl original_value = original_compute();
        return original_value;
    }

    private TypeDecl original_compute() {  return genericDecl().original();  }

    // Declared in Generics.jrag at line 1293
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl sourceTypeDecl() {
        if(sourceTypeDecl_computed)
            return sourceTypeDecl_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        sourceTypeDecl_value = sourceTypeDecl_compute();
        if(isFinal && num == boundariesCrossed)
            sourceTypeDecl_computed = true;
        return sourceTypeDecl_value;
    }

    private TypeDecl sourceTypeDecl_compute() {  return genericDecl().original().sourceTypeDecl();  }

    // Declared in GenericsParTypeDecl.jrag at line 12
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
    if(isNestedType())
      return enclosingType().fullName() + "." + nameWithArgs();
    String packageName = packageName();
    if(packageName.equals(""))
      return nameWithArgs();
    return packageName + "." + nameWithArgs();
  }

    // Declared in GenericsParTypeDecl.jrag at line 21
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

    private String typeName_compute() {
    if(isNestedType())
      return enclosingType().typeName() + "." + nameWithArgs();
    String packageName = packageName();
    if(packageName.equals("") || packageName.equals(PRIMITIVE_PACKAGE_NAME))
      return nameWithArgs();
    return packageName + "." + nameWithArgs();
  }

    // Declared in GenericsParTypeDecl.jrag at line 30
 @SuppressWarnings({"unchecked", "cast"})     public String nameWithArgs() {
        String nameWithArgs_value = nameWithArgs_compute();
        return nameWithArgs_value;
    }

    private String nameWithArgs_compute() {
    StringBuffer s = new StringBuffer();
    s.append(name());
    s.append("<");
    for(int i = 0; i < getNumArgument(); i++) {
      if(i != 0)
        s.append(", ");
      s.append(getArgument(i).type().fullName());
    }
    s.append(">");
    return s.toString();
  }

    // Declared in MethodSignature.jrag at line 391
 @SuppressWarnings({"unchecked", "cast"})     public Collection unimplementedMethods() {
        if(unimplementedMethods_computed)
            return unimplementedMethods_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        unimplementedMethods_value = unimplementedMethods_compute();
        if(isFinal && num == boundariesCrossed)
            unimplementedMethods_computed = true;
        return unimplementedMethods_value;
    }

    private Collection unimplementedMethods_compute() {
    HashSet set = new HashSet();
    HashSet result = new HashSet();
    for(Iterator iter = genericDecl().unimplementedMethods().iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      set.add(m.sourceMethodDecl());
    }
    for(Iterator iter = super.unimplementedMethods().iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(set.contains(m.sourceMethodDecl()))
        result.add(m);
    }
    return result;
  }

    // Declared in Generics.jrag at line 925
 @SuppressWarnings({"unchecked", "cast"})     public HashMap localMethodsSignatureMap() {
        if(localMethodsSignatureMap_computed)
            return localMethodsSignatureMap_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        localMethodsSignatureMap_value = localMethodsSignatureMap_compute();
        if(true)
            localMethodsSignatureMap_computed = true;
        return localMethodsSignatureMap_value;
    }

    private HashMap localMethodsSignatureMap_compute() {
    HashMap map = new HashMap();
    for(Iterator iter = original().localMethodsIterator(); iter.hasNext(); ) {
      MethodDecl decl = (MethodDecl)iter.next();
      if(!decl.isStatic() && (decl.usesTypeVariable() || isRawType())) {
        BodyDecl b = decl.p(this);
        b.is$Final = true;
        addBodyDecl(b);
        decl = (MethodDecl)b;
      }
      map.put(decl.signature(), decl);
    }
    return map;
  }

    // Declared in Generics.jrag at line 940
 @SuppressWarnings({"unchecked", "cast"})     public SimpleSet localFields(String name) {
        Object _parameters = name;
if(localFields_String_values == null) localFields_String_values = new java.util.HashMap(4);
        if(localFields_String_values.containsKey(_parameters))
            return (SimpleSet)localFields_String_values.get(_parameters);
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        SimpleSet localFields_String_value = localFields_compute(name);
        if(true)
            localFields_String_values.put(_parameters, localFields_String_value);
        return localFields_String_value;
    }

    private SimpleSet localFields_compute(String name) {
    SimpleSet set = SimpleSet.emptySet;
    for(Iterator iter = original().localFields(name).iterator(); iter.hasNext(); ) {
      FieldDeclaration f = (FieldDeclaration)iter.next();
      if(!f.isStatic() && (f.usesTypeVariable() || isRawType())) {
        BodyDecl b = f.p(this);
        b.is$Final = true;
        addBodyDecl(b);
        f = (FieldDeclaration)b;
      }
      set = set.add(f);
    }
    return set;
  }

    // Declared in Generics.jrag at line 955
 @SuppressWarnings({"unchecked", "cast"})     public SimpleSet localTypeDecls(String name) {
        Object _parameters = name;
if(localTypeDecls_String_values == null) localTypeDecls_String_values = new java.util.HashMap(4);
        if(localTypeDecls_String_values.containsKey(_parameters))
            return (SimpleSet)localTypeDecls_String_values.get(_parameters);
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        SimpleSet localTypeDecls_String_value = localTypeDecls_compute(name);
        if(true)
            localTypeDecls_String_values.put(_parameters, localTypeDecls_String_value);
        return localTypeDecls_String_value;
    }

    private SimpleSet localTypeDecls_compute(String name) {
    SimpleSet set = SimpleSet.emptySet;
    for(Iterator iter = original().localTypeDecls(name).iterator(); iter.hasNext(); ) {
      TypeDecl t = (TypeDecl)iter.next();
      if(t.isStatic())
        set = set.add(t);
      else {
        BodyDecl b;
        TypeDecl typeDecl;
        if(t instanceof ClassDecl) {
          ClassDecl classDecl = (ClassDecl)t;
          typeDecl = classDecl.p(this);
          b = new MemberClassDecl((ClassDecl)typeDecl);
          b.is$Final = true;
          addBodyDecl(b);
          set = set.add(typeDecl);
        }
        else if(t instanceof InterfaceDecl) {
          InterfaceDecl interfaceDecl = (InterfaceDecl)t;
          typeDecl = interfaceDecl.p(this);
          b = new MemberInterfaceDecl((InterfaceDecl)typeDecl);
          b.is$Final = true;
          addBodyDecl(b);
          set = set.add(typeDecl);
        }
      }
    }
    return set;
  }

    // Declared in Generics.jrag at line 985
 @SuppressWarnings({"unchecked", "cast"})     public Collection constructors() {
        if(constructors_computed)
            return constructors_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        constructors_value = constructors_compute();
        if(isFinal && num == boundariesCrossed)
            constructors_computed = true;
        return constructors_value;
    }

    private Collection constructors_compute() {
    Collection set = new ArrayList();
    for(Iterator iter = original().constructors().iterator(); iter.hasNext(); ) {
      ConstructorDecl c = (ConstructorDecl)iter.next();
      BodyDecl b = c.p(this);
      b.is$Final = true;
      addBodyDecl(b);
      set.add(b);
    }
    return set;
  }

    protected boolean genericDecl_computed = false;
    protected TypeDecl genericDecl_value;
    // Declared in GenericsParTypeDecl.jrag at line 45
 @SuppressWarnings({"unchecked", "cast"})     public TypeDecl genericDecl() {
        if(genericDecl_computed)
            return genericDecl_value;
        int num = boundariesCrossed;
        boolean isFinal = this.is$Final();
        genericDecl_value = getParent().Define_TypeDecl_genericDecl(this, null);
        if(isFinal && num == boundariesCrossed)
            genericDecl_computed = true;
        return genericDecl_value;
    }

    // Declared in GenericsParTypeDecl.jrag at line 56
    public TypeDecl Define_TypeDecl_genericDecl(ASTNode caller, ASTNode child) {
        if(caller == getBodyDeclListNoTransform()) { 
   int index = caller.getIndexOfChild(child);
{
    if(getBodyDecl(index) instanceof MemberTypeDecl) {
      MemberTypeDecl m = (MemberTypeDecl)getBodyDecl(index);
      return extractSingleType(genericDecl().memberTypes(m.typeDecl().name()));
    }
    return genericDecl();
  }
}
        return getParent().Define_TypeDecl_genericDecl(this, caller);
    }

    // Declared in Generics.jrag at line 444
    public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
        if(caller == getArgumentListNoTransform()) {
      int childIndex = caller.getIndexOfChild(child);
            return NameType.TYPE_NAME;
        }
        return super.Define_NameType_nameType(caller, child);
    }

public ASTNode rewriteTo() {
    return super.rewriteTo();
}

}
