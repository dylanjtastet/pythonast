package ast.expr;

public class Starred implements Expr {

	public Starred() {}
	private Expr value;
	private Expr_context ctx;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public Expr_context getCtx() {
		return ctx;
	}
	public void setCtx(Expr_context ctx) {
		this.ctx = ctx;
	}
}
