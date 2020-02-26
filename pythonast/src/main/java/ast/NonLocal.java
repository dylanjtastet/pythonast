package ast;

import java.util.List;

public class NonLocal implements Stmt{
	private List<String> names;
	public NonLocal() {}
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
}
