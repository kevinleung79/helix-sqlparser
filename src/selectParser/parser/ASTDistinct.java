/* Generated By:JJTree: Do not edit this line. ASTDistinct.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTDistinct extends SimpleNode {
  public ASTDistinct(int id) {
    super(id);
  }

  public ASTDistinct(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c85f2ecedb7b1a25b0e25a492053b7af (do not edit this line) */
