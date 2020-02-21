package ast.stmt;

public class For implements Stmt{
	private Expr target;
	private Expr iter;
	private List<Stmt> body;
	private List<Stmt> orelse;
	private String type_comment;
}
