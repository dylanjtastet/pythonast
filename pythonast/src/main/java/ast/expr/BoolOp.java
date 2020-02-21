package ast.expr;

import java.util.List;

public class BoolOp implements Expr{
	
	private BoolOpp op;
	private List<Expr> values;
	public BoolOp() {}
	public BoolOpp getOp() {
		return op;
	}
	public void setOp(BoolOpp op) {
		this.op = op;
	}
	public List<Expr> getValues() {
		return values;
	}
	public void setValues(List<Expr> values) {
		this.values = values;
	}
}
