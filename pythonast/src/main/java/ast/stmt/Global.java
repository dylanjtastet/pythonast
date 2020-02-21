package ast.stmt;

import java.util.List;

public class Global implements Stmt{
	private List<String> names;
	public Global() {}
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
}
