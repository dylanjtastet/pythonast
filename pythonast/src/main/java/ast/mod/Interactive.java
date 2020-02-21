package ast.mod;

import java.util.List;

import ast.stmt.Stmt;

public class Interactive implements Mod{
	private List<Stmt> body;
	public Interactive() {}
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
}
