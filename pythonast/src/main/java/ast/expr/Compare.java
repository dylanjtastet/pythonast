package ast.expr;

import java.util.List;

public class Compare implements Expr {

	public Compare() {}
	private Expr left;
	private List<Cmpop> ops;
	private List<Expr> comparators;
	public Expr getLeft() {
		return left;
	}
	public void setLeft(Expr left) {
		this.left = left;
	}
	public List<Cmpop> getOps() {
		return ops;
	}
	public void setOps(List<Cmpop> ops) {
		this.ops = ops;
	}
	public List<Expr> getComparators() {
		return comparators;
	}
	public void setComparators(List<Expr> comparators) {
		this.comparators = comparators;
	}
}
