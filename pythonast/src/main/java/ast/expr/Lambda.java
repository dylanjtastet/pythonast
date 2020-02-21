package ast.expr;

public class Lambda implements Expr {
	private Arguments args;
	private Expr body;
	public Lambda() {}
	public Arguments getArgs() {
		return args;
	}
	public void setArgs(Arguments args) {
		this.args = args;
	}
	public Expr getBody() {
		return body;
	}
	public void setBody(Expr body) {
		this.body = body;
	}
}
