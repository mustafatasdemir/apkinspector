
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;


public class BitNotExpr extends Unary implements Cloneable {
    public void flushCache() {
        super.flushCache();
        type_computed = false;
        type_value = null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public BitNotExpr clone() throws CloneNotSupportedException {
        BitNotExpr node = (BitNotExpr)super.clone();
        node.type_computed = false;
        node.type_value = null;
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public BitNotExpr copy() {
      try {
          BitNotExpr node = (BitNotExpr)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public BitNotExpr fullCopy() {
        BitNotExpr res = (BitNotExpr)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in TypeCheck.jrag at line 281


  // 15.15.5
  public void typeCheck() {
    if(!getOperand().type().isIntegralType())
      error("unary ~ only operates on integral types");
  }

    // Declared in Expressions.jrag at line 677

  public soot.Value eval(Body b) {
    soot.Value v = IntType.emitConstant(-1);
    soot.Local result = asLocal(b,
      soot.jimple.Jimple.v().newXorExpr(
        asImmediate(b, typeInt().emitCastTo(b, v, type())),
        asImmediate(b, getOperand().eval(b))
      )
    );
    return result;
  }

    // Declared in java.ast at line 3
    // Declared in java.ast line 144

    public BitNotExpr() {
        super();


    }

    // Declared in java.ast at line 10


    // Declared in java.ast line 144
    public BitNotExpr(Expr p0) {
        setChild(p0, 0);
    }

    // Declared in java.ast at line 14


  protected int numChildren() {
    return 1;
  }

    // Declared in java.ast at line 17

  public boolean mayHaveRewrite() { return false; }

    // Declared in java.ast at line 2
    // Declared in java.ast line 139
    public void setOperand(Expr node) {
        setChild(node, 0);
    }

    // Declared in java.ast at line 5

    public Expr getOperand() {
        return (Expr)getChild(0);
    }

    // Declared in java.ast at line 9


    public Expr getOperandNoTransform() {
        return (Expr)getChildNoTransform(0);
    }

    // Declared in ConstantExpression.jrag at line 115
 @SuppressWarnings({"unchecked", "cast"})     public Constant constant() {
        Constant constant_value = constant_compute();
        return constant_value;
    }

    private Constant constant_compute() {  return type().bitNot(getOperand().constant());  }

    // Declared in ConstantExpression.jrag at line 489
 @SuppressWarnings({"unchecked", "cast"})     public boolean isConstant() {
        boolean isConstant_value = isConstant_compute();
        return isConstant_value;
    }

    private boolean isConstant_compute() {  return getOperand().isConstant();  }

    // Declared in PrettyPrint.jadd at line 397
 @SuppressWarnings({"unchecked", "cast"})     public String printPreOp() {
        String printPreOp_value = printPreOp_compute();
        return printPreOp_value;
    }

    private String printPreOp_compute() {  return "~";  }

    // Declared in TypeAnalysis.jrag at line 317
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

    private TypeDecl type_compute() {  return getOperand().type().unaryNumericPromotion();  }

public ASTNode rewriteTo() {
    return super.rewriteTo();
}

}
