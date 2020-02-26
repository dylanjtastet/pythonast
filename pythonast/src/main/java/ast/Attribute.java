package ast;

public class Attribute implements Expr {

	public Attribute() {}
	private Expr value;
	private String attr;
	private ExprContext ctx;
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
	public ExprContext getCtx() {
		return ctx;
	}
	public void setCtx(ExprContext ctx) {
		this.ctx = ctx;
	}
}
