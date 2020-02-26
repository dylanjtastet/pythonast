package ast;

public class Name implements Expr {

	public Name() {}
	private String id;
	private ExprContext ctx;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ExprContext getCtx() {
		return ctx;
	}
	public void setCtx(ExprContext ctx) {
		this.ctx = ctx;
	}
}
