package ast.member;

import ast.expr.Expr;

public class Withitem {

	public Withitem() {}
	private Expr context_expr;
	private Expr optional_vars;
	public Expr getContext_expr() {
		return context_expr;
	}
	public void setContext_expr(Expr context_expr) {
		this.context_expr = context_expr;
	}
	public Expr getOptional_vars() {
		return optional_vars;
	}
	public void setOptional_vars(Expr optional_vars) {
		this.optional_vars = optional_vars;
	}
}
