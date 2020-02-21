package ast.member;

public class TypeIgnore {

	public TypeIgnore() {}
	public int getLineno() {
		return lineno;
	}
	public void setLineno(int lineno) {
		this.lineno = lineno;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	private int lineno;
	private String tag;
}
