package ast.expr;

import java.util.List;

public class Call implements Expr {

	public Call() {}
	private Expr func;
	private List<Expr> args;
	private List<Keyword> keywords;
	public Expr getFunc() {
		return func;
	}
	public void setFunc(Expr func) {
		this.func = func;
	}
	public List<Expr> getArgs() {
		return args;
	}
	public void setArgs(List<Expr> args) {
		this.args = args;
	}
	public List<Keyword> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}
}
