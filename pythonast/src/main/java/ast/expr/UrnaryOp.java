package ast.expr;

public class UrnaryOp implements Expr {

	private UrnaryOpp op;
	private Expr operand;
	public UrnaryOp() {}
	public UrnaryOpp getOp() {
		return op;
	}
	public void setOp(UrnaryOpp op) {
		this.op = op;
	}
	public Expr getOperand() {
		return operand;
	}
	public void setOperand(Expr operand) {
		this.operand = operand;
	}
}
