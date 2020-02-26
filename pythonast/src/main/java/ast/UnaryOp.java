package ast;

public class UnaryOp implements Expr {

	private SmallUnaryOp op;
	private Expr operand;
	public UnaryOp() {}
	public SmallUnaryOp getOp() {
		return op;
	}
	public void setOp(SmallUnaryOp op) {
		this.op = op;
	}
	public Expr getOperand() {
		return operand;
	}
	public void setOperand(Expr operand) {
		this.operand = operand;
	}
}
