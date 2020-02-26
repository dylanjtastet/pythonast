package ast;

import java.util.List;

public class DictComp implements Expr {

	public DictComp() {}
	private Expr key;
	private Expr value;
	private List<Comprehension> generators;
	public Expr getKey() {
		return key;
	}
	public void setKey(Expr key) {
		this.key = key;
	}
	public Expr getValue() {
		return value;
	}
	public void setValue(Expr value) {
		this.value = value;
	}
	public List<Comprehension> getGenerators() {
		return generators;
	}
	public void setGenerators(List<Comprehension> generators) {
		this.generators = generators;
	}
}
