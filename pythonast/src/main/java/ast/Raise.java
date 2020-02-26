package ast;

public class Raise implements Stmt{
	private Expr exc;
	private Expr cause;
	public Expr getExc() {
		return exc;
	}
	public void setExc(Expr exc) {
		this.exc = exc;
	}
	public Expr getCause() {
		return cause;
	}
	public void setCause(Expr cause) {
		this.cause = cause;
	}
}
