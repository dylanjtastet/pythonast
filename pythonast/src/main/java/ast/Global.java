package ast;

import java.util.List;

public class Global {
	private List<String> names;
	public Global() {}
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
}
