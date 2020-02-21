package ast.expr;

import java.util.List;

public class DictComp implements Expr {

	public DictComp() {}
	private Expr key;
	private Expr value;
	private List<Comprehension> generators;
}
