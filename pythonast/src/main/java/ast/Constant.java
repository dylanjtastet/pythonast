package ast;

public class Constant implements Expr {

	public Constant() {}
	private Object value;
	private String kind;
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
}
