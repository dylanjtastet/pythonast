package ast;

public class Starred implements Expr {

	public Starred() {}
	private Expr value;
	private ExprContext ctx;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public ExprContext getCtx() {
		return ctx;
	}
	public void setCtx(ExprContext ctx) {
		this.ctx = ctx;
	}
}
