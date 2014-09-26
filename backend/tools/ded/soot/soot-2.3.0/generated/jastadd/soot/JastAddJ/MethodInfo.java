
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;

public class MethodInfo extends java.lang.Object {
    // Declared in BytecodeDescriptor.jrag at line 131

    private BytecodeParser p;

    // Declared in BytecodeDescriptor.jrag at line 132

    String name;

    // Declared in BytecodeDescriptor.jrag at line 133

    int flags;

    // Declared in BytecodeDescriptor.jrag at line 134

    private MethodDescriptor methodDescriptor;

    // Declared in BytecodeDescriptor.jrag at line 135

    private Attributes.MethodAttributes attributes;

    // Declared in BytecodeDescriptor.jrag at line 137


    public MethodInfo(BytecodeParser parser) {
      p = parser;
      flags = p.u2();
      if(BytecodeParser.VERBOSE)
        p.print("  Flags: " + Integer.toBinaryString(flags));
      int name_index = p.u2();
      CONSTANT_Info info = p.constantPool[name_index];
      if(info == null || !(info instanceof CONSTANT_Utf8_Info)) {
        System.err.println("Expected CONSTANT_Utf8_Info but found: " + info.getClass().getName());
        //if(info instanceof CONSTANT_Class_Info) {
        //  System.err.println(" found CONSTANT_Class_Info: " + ((CONSTANT_Class_Info)info).name());
        //  name = ((CONSTANT_Class_Info)info).name();
        //}
      } 
      name = ((CONSTANT_Utf8_Info)info).string();
      methodDescriptor = new MethodDescriptor(p, name);
      attributes = new Attributes.MethodAttributes(p);
    }

    // Declared in BytecodeDescriptor.jrag at line 155

    public BodyDecl bodyDecl() {
      Signatures.MethodSignature s = attributes.methodSignature;
      Access returnType = (s != null && s.hasReturnType()) ? s.returnType() : methodDescriptor.type();
      List parameterList;
      if(isConstructor() && p.isInnerClass) {
        parameterList = methodDescriptor.parameterListSkipFirst();
        if(s != null) {
          Iterator iter = s.parameterTypes().iterator();
          if(iter.hasNext()) iter.next();
          for(int i = 0; iter.hasNext(); i++) {
            Access a = (Access)iter.next();
            ((ParameterDeclaration)parameterList.getChildNoTransform(i)).setTypeAccess(a);
          }
        }
      }
      else {
        parameterList = methodDescriptor.parameterList();
        if(s != null) {
          int i = 0;
          for(Iterator iter = s.parameterTypes().iterator(); iter.hasNext(); i++) {
            Access a = (Access)iter.next();
            ((ParameterDeclaration)parameterList.getChildNoTransform(i)).setTypeAccess(a);
          }
        }
      }
      if((flags & Flags.ACC_VARARGS) != 0) {
        int lastIndex = parameterList.getNumChildNoTransform() - 1;
        ParameterDeclaration p = (ParameterDeclaration)parameterList.getChildNoTransform(lastIndex);
        parameterList.setChild(
            new VariableArityParameterDeclaration(
              p.getModifiersNoTransform(),
              ((ArrayTypeAccess)p.getTypeAccessNoTransform()).getAccessNoTransform(),
              p.getID()
            ),
          lastIndex
        );
      }
      List exceptionList = (s != null && s.hasExceptionList()) ? s.exceptionList() : attributes.exceptionList();
  
      if(attributes.parameterAnnotations != null) {
        for(int i = 0; i < attributes.parameterAnnotations.length; i++) {
          ParameterDeclaration p = (ParameterDeclaration)parameterList.getChildNoTransform(i);
          for(Iterator iter = attributes.parameterAnnotations[i].iterator(); iter.hasNext(); ) {
            Modifier m = (Modifier)iter.next();
            p.getModifiersNoTransform().addModifier(m);
          }
        }
      }

      BodyDecl b;
      if(isConstructor()) {
        b = new ConstructorDecl(p.modifiers(flags), name, parameterList, 
            exceptionList, new Opt(), new Block());
      }
      else if(attributes.elementValue() != null) {
        b = new AnnotationMethodDecl(p.modifiers(flags), returnType, name, 
            parameterList, exceptionList, 
            new Opt(new Block()), new Opt(attributes.elementValue()));
      }
      else if(s != null && s.hasFormalTypeParameters()) {
        b = new GenericMethodDecl(p.modifiers(flags), returnType, name, parameterList, 
            exceptionList, new Opt(new Block()), s.typeParameters());
      }
      else {
        b = new MethodDecl(p.modifiers(flags), returnType, name, parameterList, 
            exceptionList, new Opt(new Block()));
      }
      if(attributes.annotations != null) {
        for(Iterator iter = attributes.annotations.iterator(); iter.hasNext(); ) {
          if(b instanceof MethodDecl) 
            ((MethodDecl)b).getModifiers().addModifier((Modifier)iter.next());
          else if(b instanceof ConstructorDecl)
            ((ConstructorDecl)b).getModifiers().addModifier((Modifier)iter.next());
        }
      }
      return b;
    }

    // Declared in BytecodeDescriptor.jrag at line 233


    private boolean isConstructor() {
      return name.equals("<init>");
    }

    // Declared in BytecodeDescriptor.jrag at line 237


    public boolean isSynthetic() {
      return attributes.isSynthetic() || (flags & 0x1000) != 0;
    }


}
