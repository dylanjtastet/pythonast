package ast.stmt;

public class While implements Stmt{
	private Expr test;
	private List<Stmt> body;
	private List<Stmt> orelse;
} 
