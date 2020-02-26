package ast;

import java.util.List;

public class ClassDef implements Stmt{

	public ClassDef() {}
	private String name;
	private List<Expr> bases;
	private List<Keyword> keywords;
	private List<Stmt> body;
	private List<Expr> decorator_list;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Expr> getBases() {
		return bases;
	}
	public void setBases(List<Expr> bases) {
		this.bases = bases;
	}
	public List<Keyword> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	public List<Expr> getDecorator_list() {
		return decorator_list;
	}
	public void setDecorator_list(List<Expr> decorator_list) {
		this.decorator_list = decorator_list;
	}
}
