package ast;

public class Expression implements Mod{
	private Expr body;
	public Expression() {}
	public Expr getBody() {
		return body;
	}
	public void setBody(Expr body) {
		this.body = body;
	}
}
