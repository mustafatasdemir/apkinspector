
package soot.JastAddJ;
import java.util.HashSet;import java.util.LinkedHashSet;import java.io.File;import java.util.*;import beaver.*;import java.util.ArrayList;import java.util.zip.*;import java.io.*;import java.io.FileNotFoundException;import java.util.Collection;import soot.*;import soot.util.*;import soot.jimple.*;import soot.coffi.ClassFile;import soot.coffi.method_info;import soot.coffi.CONSTANT_Utf8_info;import soot.coffi.CoffiMethodSource;



public abstract class AbstractWildcard extends Access implements Cloneable {
    public void flushCache() {
        super.flushCache();
    }
     @SuppressWarnings({"unchecked", "cast"})  public AbstractWildcard clone() throws CloneNotSupportedException {
        AbstractWildcard node = (AbstractWildcard)super.clone();
        node.in$Circle(false);
        node.is$Final(false);
    return node;
    }
    // Declared in Generics.ast at line 3
    // Declared in Generics.ast line 17

    public AbstractWildcard() {
        super();


    }

    // Declared in Generics.ast at line 9


  protected int numChildren() {
    return 0;
  }

    // Declared in Generics.ast at line 12

  public boolean mayHaveRewrite() { return false; }

public ASTNode rewriteTo() {
    return super.rewriteTo();
}

}
