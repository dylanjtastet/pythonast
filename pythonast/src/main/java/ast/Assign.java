package ast;

import java.util.List;

public class Assign implements Stmt{

	public Assign() {}
	private List<Expr> targets;
	private Expr value;
	private String type_comment;
	public List<Expr> getTargets() {
		return targets;
	}
	public void setTargets(List<Expr> targets) {
		this.targets = targets;
	}
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public String getType_comment() {
		return type_comment;
	}
	public void setType_comment(String type_comment) {
		this.type_comment = type_comment;
	}

}
