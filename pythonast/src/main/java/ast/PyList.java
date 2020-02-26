package ast;
import java.util.List;
public class PyList implements Expr {

	public PyList() {}
	private List<Expr> elts;
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
	private ExprContext ctx;
}
