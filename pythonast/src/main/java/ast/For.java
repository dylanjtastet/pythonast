package ast;

import java.util.List;

public class For implements Stmt{
	private Expr target;
	private Expr iter;
	private List<Stmt> body;
	private List<Stmt> orelse;
	private String type_comment;
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
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	public List<Stmt> getOrelse() {
		return orelse;
	}
	public void setOrelse(List<Stmt> orelse) {
		this.orelse = orelse;
	}
	public String getType_comment() {
		return type_comment;
	}
	public void setType_comment(String type_comment) {
		this.type_comment = type_comment;
	}
}
