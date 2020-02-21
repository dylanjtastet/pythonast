package ast.stmt;

public class AugAssign implements Stmt{

	public AugAssign() {}
	private Expr target;
	private Operator op;
	private Expr value;
	public Expr getTarget() {
		return target;
	}
	public void setTarget(Expr target) {
		this.target = target;
	}
	public Operator getOp() {
		return op;
	}
	public void setOp(Operator op) {
		this.op = op;
	}
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
}
