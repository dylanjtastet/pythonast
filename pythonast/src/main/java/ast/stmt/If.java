package ast.stmt;

import java.util.List;

public class If implements Stmt{
	private Expr test;
	private List<Stmt> body;
	private List<Stmt> orelse;
}
