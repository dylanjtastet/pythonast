package ast;

public class For {
	private Expr target;
	private Expr iter;
	private List<Stmt> body;
	private List<Stmt> orelse;
	private String type_comment;
}
