package ast.member;

import java.util.List;

import ast.expr.Expr;

public class Comprehension {

	public Comprehension() {}
	private Expr target;
	private Expr iter;
	private List<Expr> ifs;
	int is_async;
	public Expr getTarget() {
		return target;
	}
	public void setTarget(Expr target) {
		this.target = target;
	}
	public Expr getIter() {
		return iter;
	}
	public void setIter(Expr iter) {
		this.iter = iter;
	}
	public List<Expr> getIfs() {
		return ifs;
	}
	public void setIfs(List<Expr> ifs) {
		this.ifs = ifs;
	}
	public int getIs_async() {
		return is_async;
	}
	public void setIs_async(int is_async) {
		this.is_async = is_async;
	}
}
