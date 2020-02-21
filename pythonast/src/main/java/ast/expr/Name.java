package ast.expr;

public class Name implements Expr {

	public Name() {}
	private String id;
	private Expr_context ctx;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Expr_context getCtx() {
		return ctx;
	}
	public void setCtx(Expr_context ctx) {
		this.ctx = ctx;
	}
}
