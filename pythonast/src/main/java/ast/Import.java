package ast;

import java.util.List;

public class Import implements Stmt{
	private List<Alias> names;
	public Import() {}
	public List<Alias> getNames(){
		return names;
	}
	public void setNames(List<Alias> names){
		this.names = names;
	}
}
