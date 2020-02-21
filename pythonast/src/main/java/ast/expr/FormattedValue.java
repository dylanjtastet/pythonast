package ast.expr;

public class FormattedValue implements Expr {

	public FormattedValue() {}
	private Expr value;
	private int conversion;
	private Expr format_spec;
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public int getConversion() {
		return conversion;
	}
	public void setConversion(int conversion) {
		this.conversion = conversion;
	}
	public Expr getFormat_spec() {
		return format_spec;
	}
	public void setFormat_spec(Expr format_spec) {
		this.format_spec = format_spec;
	}
}
