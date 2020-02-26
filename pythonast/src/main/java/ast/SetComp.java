package ast;

import java.util.List;

public class SetComp implements Expr {

	public SetComp() {}
	private Expr elt;
	private List<Comprehension> generators;
	public Expr getElt() {
		return elt;
	}
	public void setElt(Expr elt) {
		this.elt = elt;
	}
	public List<Comprehension> getGenerators() {
		return generators;
	}
	public void setGenerators(List<Comprehension> generators) {
		this.generators = generators;
	}
}
