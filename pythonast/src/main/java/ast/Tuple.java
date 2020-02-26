package ast;

import java.util.List;

public class Tuple implements Expr {

	public Tuple() {}
	private List<Expr> elts;
	private ExprContext ctx;
	public List<Expr> getElts() {
		return elts;
	}
	public void setElts(List<Expr> elts) {
		this.elts = elts;
	}
	public ExprContext getCtx() {
		return ctx;
	}
	public void setCtx(ExprContext ctx) {
		this.ctx = ctx;
	}
}
