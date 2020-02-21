package ast.stmt;

import java.util.List;

public class Try implements Stmt{
	private List<Stmt> body;
	private List<ExceptHandler> handlers;
	private List<Stmt> orelse;
	private List<Stmt> finalbody;
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	public List<ExceptHandler> getHandlers() {
		return handlers;
	}
	public void setHandlers(List<ExceptHandler> handlers) {
		this.handlers = handlers;
	}
	public List<Stmt> getOrelse() {
		return orelse;
	}
	public void setOrelse(List<Stmt> orelse) {
		this.orelse = orelse;
	}
	public List<Stmt> getFinalbody() {
		return finalbody;
	}
	public void setFinalbody(List<Stmt> finalbody) {
		this.finalbody = finalbody;
	}
}
