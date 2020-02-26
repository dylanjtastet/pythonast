package ast;

import java.util.List;

public class Compare implements Expr {

	public Compare() {}
	private Expr left;
	private List<CmpOp> ops;
	private List<Expr> comparators;
	public Expr getLeft() {
		return left;
	}
	public void setLeft(Expr left) {
		this.left = left;
	}
	public List<CmpOp> getOps() {
		return ops;
	}
	public void setOps(List<CmpOp> ops) {
		this.ops = ops;
	}
	public List<Expr> getComparators() {
		return comparators;
	}
	public void setComparators(List<Expr> comparators) {
		this.comparators = comparators;
	}
}
