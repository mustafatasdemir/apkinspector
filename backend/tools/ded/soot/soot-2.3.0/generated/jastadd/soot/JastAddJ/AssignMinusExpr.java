
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;


public class AssignMinusExpr extends AssignAdditiveExpr implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public AssignMinusExpr clone() throws CloneNotSupportedException {
        AssignMinusExpr node = (AssignMinusExpr)super.clone();
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
     @SuppressWarnings({"unchecked", "cast"})  public AssignMinusExpr copy() {
      try {
          AssignMinusExpr node = (AssignMinusExpr)clone();
          if(children != null) node.children = (ASTNode[])children.clone();
          return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
    }
     @SuppressWarnings({"unchecked", "cast"})  public AssignMinusExpr fullCopy() {
        AssignMinusExpr res = (AssignMinusExpr)copy();
        for(int i = 0; i < getNumChildNoTransform(); i++) {
          ASTNode node = getChildNoTransform(i);
          if(node != null) node = node.fullCopy();
          res.setChild(node, i);
        }
        return res;
    }
    // Declared in TypeCheck.jrag at line 86

  public void typeCheck() {
    if(sourceType().isBoolean() || getDest().type().isBoolean())
      error("Operator - does not operate on boolean types");
    super.typeCheck();
  }

    // Declared in Expressions.jrag at line 163

  public soot.Value createAssignOp(Body b, soot.Value fst, soot.Value snd) {
    return Jimple.v().newSubExpr(asImmediate(b, fst), asImmediate(b, snd));
  }

    // Declared in java.ast at line 3
    // Declared in java.ast line 110

    public AssignMinusExpr() {
        super();


    }

    // Declared in java.ast at line 10


    // Declared in java.ast line 110
    public AssignMinusExpr(Expr p0, Expr p1) {
        setChild(p0, 0);
        setChild(p1, 1);
    }

    // Declared in java.ast at line 15


  protected int numChildren() {
    return 2;
  }

    // Declared in java.ast at line 18

  public boolean mayHaveRewrite() { return false; }

    // Declared in java.ast at line 2
    // Declared in java.ast line 99
    public void setDest(Expr node) {
        setChild(node, 0);
    }

    // Declared in java.ast at line 5

    public Expr getDest() {
        return (Expr)getChild(0);
    }

    // Declared in java.ast at line 9


    public Expr getDestNoTransform() {
        return (Expr)getChildNoTransform(0);
    }

    // Declared in java.ast at line 2
    // Declared in java.ast line 99
    public void setSource(Expr node) {
        setChild(node, 1);
    }

    // Declared in java.ast at line 5

    public Expr getSource() {
        return (Expr)getChild(1);
    }

    // Declared in java.ast at line 9


    public Expr getSourceNoTransform() {
        return (Expr)getChildNoTransform(1);
    }

    // Declared in PrettyPrint.jadd at line 271
 @SuppressWarnings({"unchecked", "cast"})     public String printOp() {
        String printOp_value = printOp_compute();
        return printOp_value;
    }

    private String printOp_compute() {  return " -= ";  }

public ASTNode rewriteTo() {
    return super.rewriteTo();
}

}
