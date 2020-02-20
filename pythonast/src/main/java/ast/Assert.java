package ast;

public class Assert {
	private Expr test;
	private Expr msg;
	public Expr getTest() {
		return test;
	}
	public void setTest(Expr test) {
		this.test = test;
	}
	public Expr getMsg() {
		return msg;
	}
	public void setMsg(Expr msg) {
		this.msg = msg;
	}
}
