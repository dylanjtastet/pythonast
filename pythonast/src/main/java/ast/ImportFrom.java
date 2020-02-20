package ast;

public class ImportFrom extends Import{
	private String module;
	private int level;
	
	public ImportFrom() {}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
