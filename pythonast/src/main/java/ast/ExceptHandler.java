package ast;

import java.util.List;

public class ExceptHandler implements Ast{

	public ExceptHandler() {}
	private Expr type;
	private String name;
	private List<Stmt> body;
	public Expr getType() {
		return type;
	}
	public void setType(Expr type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	
}
