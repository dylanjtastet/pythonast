package ast;

import java.util.List;

public class Tuple implements Expr {

	public Tuple() {}
	private List<Expr> elts;
	private Expr_context ctx;
	public List<Expr> getElts() {
		return elts;
	}
	public void setElts(List<Expr> elts) {
		this.elts = elts;
	}
	public Expr_context getCtx() {
		return ctx;
	}
	public void setCtx(Expr_context ctx) {
		this.ctx = ctx;
	}
}
