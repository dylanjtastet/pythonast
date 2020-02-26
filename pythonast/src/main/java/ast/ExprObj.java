package ast;

public class ExprObj implements Stmt {

	public ExprObj(){
	}
	private Expr value;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}

}
