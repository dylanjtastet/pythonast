package ast;

public enum Expr_context implements Ast{
	Load,
	Store,
	Del,
	AugLoad,
	Param
}
