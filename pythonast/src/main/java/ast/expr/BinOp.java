package ast.expr;

public class BinOp implements Expr {

	private Expr left;
	private Operator op;
	private Expr right;
	public BinOp() {}
	public Expr getLeft() {
		return left;
	}
	public void setLeft(Expr left) {
		this.left = left;
	}
	public Operator getOp() {
		return op;
	}
	public void setOp(Operator op) {
		this.op = op;
	}
	public Expr getRight() {
		return right;
	}
	public void setRight(Expr right) {
		this.right = right;
	}
}
