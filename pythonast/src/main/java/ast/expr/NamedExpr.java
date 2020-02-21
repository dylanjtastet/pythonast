package ast.expr;

public class NamedExpr implements Expr {

	private Expr target;
	private Expr value;
	public NamedExpr() {}
	public Expr getTarget() {
		return target;
	}
	public void setTarget(Expr target) {
		this.target = target;
	}
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
}
