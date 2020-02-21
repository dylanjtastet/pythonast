package ast.mod;
import java.util.List;

import ast.stmt.Stmt;
public class Module implements Mod{

	public Module() {}
	private List<Stmt> body;
	private List<Type_ignore> type_ignores;
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	public List<Type_ignore> getType_ignores() {
		return type_ignores;
	}
	public void setType_ignores(List<Type_ignore> type_ignores) {
		this.type_ignores = type_ignores;
	}
}
