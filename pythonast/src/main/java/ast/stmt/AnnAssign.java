package ast.stmt;

public class AnnAssign implements Stmt {

	public AnnAssign() {}
	private Expr target;
	private Expr annotation;
	private Expr value;
	private int simple;
	public Expr getTarget() {
		return target;
	}
	public void setTarget(Expr target) {
		this.target = target;
	}
	public Expr getAnnotation() {
		return annotation;
	}
	public void setAnnotation(Expr annotation) {
		this.annotation = annotation;
	}
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public int getSimple() {
		return simple;
	}
	public void setSimple(int simple) {
		this.simple = simple;
	}

}
