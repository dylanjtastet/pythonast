package ast;

import java.util.List;

public class FunctionDef implements Stmt{

	public FunctionDef() {}
	private String name;
	private Arguments args;
	private List<Stmt> body;
	private List<Expr> decorator_list;
	private Expr returns;
	private String type_comment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Arguments getArgs() {
		return args;
	}
	public void setArgs(Arguments args) {
		this.args = args;
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
	public Expr getReturns() {
		return returns;
	}
	public void setReturns(Expr returns) {
		this.returns = returns;
	}
	public String getType_comment() {
		return type_comment;
	}
	public void setType_comment(String type_comment) {
		this.type_comment = type_comment;
	}
	
}
