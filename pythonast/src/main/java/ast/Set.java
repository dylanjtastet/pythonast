package ast;

import java.util.List;

public class Set implements Expr {
	public List<Expr> getElts() {
		return elts;
	}
	public void setElts(List<Expr> elts) {
		this.elts = elts;
	}
	private List<Expr> elts;
	public Set() {}
}
