package ast.expr;
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
	public Expr_context getCtx() {
		return ctx;
	}
	public void setCtx(Expr_context ctx) {
		this.ctx = ctx;
	}
	private Expr_context ctx;
}
