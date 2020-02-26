package ast;

public class Subscript implements Expr {

	public Subscript() {}
	private Expr value;
	private Slice slice;
	private ExprContext ctx;
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
	public ExprContext getCtx() {
		return ctx;
	}
	public void setCtx(ExprContext ctx) {
		this.ctx = ctx;
	}
}
