package ast;

public class IfExp implements Expr {
	private Expr test;
	private Expr body;
	private	Expr orelse;
	public IfExp() {}
	public Expr getTest() {
		return test;
	}
	public void setTest(Expr test) {
		this.test = test;
	}
	public Expr getBody() {
		return body;
	}
	public void setBody(Expr body) {
		this.body = body;
	}
	public Expr getOrelse() {
		return orelse;
	}
	public void setOrelse(Expr orelse) {
		this.orelse = orelse;
	}
}
