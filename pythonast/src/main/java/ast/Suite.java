package ast;

import java.util.List;

public class Suite implements Mod {

	private List<Stmt> body;
	public Suite() {}
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
}
