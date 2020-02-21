package ast.expr;

public class Subscript implements Expr {

	public Subscript() {}
	private Expr value;
	private Slice slice;
	private Expr_context ctx;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public Slice getSlice() {
		return slice;
	}
	public void setSlice(Slice slice) {
		this.slice = slice;
	}
	public Expr_context getCtx() {
		return ctx;
	}
	public void setCtx(Expr_context ctx) {
		this.ctx = ctx;
	}
}
