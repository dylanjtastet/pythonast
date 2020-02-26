package ast;

import java.util.List;

public class FunctionType implements Mod{

	private List<Expr> argtypes;
	private Expr returns;
	public FunctionType() {}
	public List<Expr> getArgtypes() {
		return argtypes;
	}
	public void setArgtypes(List<Expr> argtypes) {
		this.argtypes = argtypes;
	}
	public Expr getReturns() {
		return returns;
	}
	public void setReturns(Expr returns) {
		this.returns = returns;
	}
}
