package ast;

public class Arg implements Ast{

	public Arg() {}
	private String arg;
	private Expr annotation;
	private String type_comment;
	public String getArg() {
		return arg;
	}
	public void setArg(String arg) {
		this.arg = arg;
	}
	public Expr getAnnotation() {
		return annotation;
	}
	public void setAnnotation(Expr annotation) {
		this.annotation = annotation;
	}
	public String getType_comment() {
		return type_comment;
	}
	public void setType_comment(String type_comment) {
		this.type_comment = type_comment;
	}
}
