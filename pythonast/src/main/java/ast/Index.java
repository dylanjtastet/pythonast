package ast;

public class Index implements Slice{

	public Index() {}
	private Expr value;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
}
