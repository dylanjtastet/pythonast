package ast;

public class If {
	private Expr test;
	private List<Stmt> body;
	private List<Stmt> orelse;
}
