package ast;
import java.util.List;
public class Module implements Mod{

	public Module() {}
	private List<Stmt> body;
	private List<TypeIgnore> type_ignores;
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	public List<TypeIgnore> getType_ignores() {
		return type_ignores;
	}
	public void setType_ignores(List<TypeIgnore> type_ignores) {
		this.type_ignores = type_ignores;
	}
}
