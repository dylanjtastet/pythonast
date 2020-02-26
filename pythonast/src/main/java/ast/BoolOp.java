package ast;

import java.util.List;

public class BoolOp implements Expr{
	
	private SmallBoolOp op;
	private List<Expr> values;
	public BoolOp() {}
	public SmallBoolOp getOp() {
		return op;
	}
	public void setOp(SmallBoolOp op) {
		this.op = op;
	}
	public List<Expr> getValues() {
		return values;
	}
	public void setValues(List<Expr> values) {
		this.values = values;
	}
}
