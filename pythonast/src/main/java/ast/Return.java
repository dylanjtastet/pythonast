package ast;

public class Return implements Stmt{

	public Return() {}
	private Expr value;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
}
