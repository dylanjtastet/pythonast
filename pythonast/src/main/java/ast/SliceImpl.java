package ast;

public class SliceImpl implements Slice{

	public SliceImpl() {}
	private Expr lower;
	private Expr upper;
	private Expr step;
	public Expr getLower() {
		return lower;
	}
	public void setLower(Expr lower) {
		this.lower = lower;
	}
	public Expr getUpper() {
		return upper;
	}
	public void setUpper(Expr upper) {
		this.upper = upper;
	}
	public Expr getStep() {
		return step;
	}
	public void setStep(Expr step) {
		this.step = step;
	}
}
