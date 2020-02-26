package ast;

import java.util.List;

public class AsyncWith implements Stmt{
	private List<Withitem> items;
	private List<Stmt> body;
	private String type_comment;
	public List<Withitem> getItems() {
		return items;
	}
	public void setItems(List<Withitem> items) {
		this.items = items;
	}
	public List<Stmt> getBody() {
		return body;
	}
	public void setBody(List<Stmt> body) {
		this.body = body;
	}
	public String getType_comment() {
		return type_comment;
	}
	public void setType_comment(String type_comment) {
		this.type_comment = type_comment;
	}
}
