package ast.expr;

import java.util.List;

public class JoinedStr implements Expr {

	public JoinedStr() {}
	private List<Expr> values;
	public List<Expr> getValues() {
		return values;
	}
	public void setValues(List<Expr> values) {
		this.values = values;
	}
}
