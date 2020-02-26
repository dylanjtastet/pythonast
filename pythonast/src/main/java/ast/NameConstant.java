package ast;

public class NameConstant implements Expr {

	public NameConstant() {
		// TODO Auto-generated constructor stub
	}
	private Object value;
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
