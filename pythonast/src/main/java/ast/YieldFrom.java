package ast;

public class YieldFrom implements Expr {

	public YieldFrom() {}
	private Expr value;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
}
