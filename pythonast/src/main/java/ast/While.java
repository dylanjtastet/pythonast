package ast;

import java.util.List;

public class While implements Stmt{
	private Expr test;
	private List<Stmt> body;
	private List<Stmt> orelse;
	public Expr getTest() {
		return test;
	}
	public void setTest(Expr test) {
		this.test = test;
	}
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	public List<Stmt> getOrelse() {
		return orelse;
	}
	public void setOrelse(List<Stmt> orelse) {
		this.orelse = orelse;
	}
} 
