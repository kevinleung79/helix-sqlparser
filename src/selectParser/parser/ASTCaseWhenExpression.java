/* Generated By:JJTree: Do not edit this line. ASTCaseWhenExpression.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTCaseWhenExpression extends SimpleNode {
  public ASTCaseWhenExpression(int id) {
    super(id);
  }

  public ASTCaseWhenExpression(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bbc02c84cf7ed084d92ccaacaf4e2366 (do not edit this line) */
