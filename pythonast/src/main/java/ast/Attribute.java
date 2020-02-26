package ast;

public class Attribute implements Expr {

	public Attribute() {}
	private Expr value;
	private String attr;
	private Expr_context ctx;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public String getAttr() {
		return attr;
	}
	public void setAttr(String attr) {
		this.attr = attr;
	}
	public Expr_context getCtx() {
		return ctx;
	}
	public void setCtx(Expr_context ctx) {
		this.ctx = ctx;
	}
}
