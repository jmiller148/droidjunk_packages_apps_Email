/* Generated By:JJTree: Do not edit this line. ASTangle_addr.java */

package org.apache.james.mime4j.field.address.parser;

public class ASTangle_addr extends SimpleNode {
  public ASTangle_addr(int id) {
    super(id);
  }

  public ASTangle_addr(AddressListParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AddressListParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}