package ast.expr;

public class Yield implements Expr {

	public Yield() {}
	private Expr value;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
}
