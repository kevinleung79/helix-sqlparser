/* Generated By:JJTree: Do not edit this line. ASTSelectItemsList.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package selectParser.parser;

public class ASTSelectItemsList extends SimpleNode {
  public ASTSelectItemsList(int id) {
    super(id);
  }

  public ASTSelectItemsList(SelectParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SelectParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f69c66e2c7a67b423f4044b32185dc30 (do not edit this line) */
