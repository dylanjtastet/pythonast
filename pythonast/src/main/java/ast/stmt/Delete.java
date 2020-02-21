package ast.stmt;

public class Delete implements Stmt{

	public Delete() {}
	private List<Expr> targets;
	public List<Expr> getTargets() {
		return targets;
	}
	public void setTargets(List<Expr> targets) {
		this.targets = targets;
	}
}
