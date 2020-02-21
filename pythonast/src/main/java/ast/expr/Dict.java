package ast.expr;

import java.util.List;

public class Dict implements Expr {

	private List<Expr> keys;
	private List<Expr> values;
	public Dict() {}
}
