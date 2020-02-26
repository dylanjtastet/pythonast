package ast;

public enum ExprContext implements Ast{
	Load,
	Store,
	Del,
	AugLoad,
	AugStore,
	Param
}
