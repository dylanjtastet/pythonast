package ast;

import java.util.List;

public class Dict implements Expr {

	private List<Expr> keys;
	private List<Expr> values;
	public Dict() {}
	public List<Expr> getKeys() {
		return keys;
	}
	public void setKeys(List<Expr> keys) {
		this.keys = keys;
	}
	public List<Expr> getValues() {
		return values;
	}
	public void setValues(List<Expr> values) {
		this.values = values;
	}
}
