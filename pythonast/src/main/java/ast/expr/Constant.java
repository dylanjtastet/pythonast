package ast.expr;

public class Constant implements Expr {

	public Constant() {}
	private Constantt value;
	private String kind;
	public Constantt getValue() {
		return value;
	}
	public void setValue(Constantt value) {
		this.value = value;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
}
