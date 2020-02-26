package ast;

import java.util.List;

public class Arguments implements Ast{

	public Arguments() {}
	private List<Arg> posonlyargs;
	private List<Arg> args;
	private Arg vararg;
	private List<Arg> kwonlyargs;
	private List<Expr> kw_defaults;
	private Arg kward;
	private List<Expr> defaults;
	public List<Arg> getPosonlyargs() {
		return posonlyargs;
	}
	public void setPosonlyargs(List<Arg> posonlyargs) {
		this.posonlyargs = posonlyargs;
	}
	public List<Arg> getArgs() {
		return args;
	}
	public void setArgs(List<Arg> args) {
		this.args = args;
	}
	public Arg getVararg() {
		return vararg;
	}
	public void setVararg(Arg vararg) {
		this.vararg = vararg;
	}
	public List<Arg> getKwonlyargs() {
		return kwonlyargs;
	}
	public void setKwonlyargs(List<Arg> kwonlyargs) {
		this.kwonlyargs = kwonlyargs;
	}
	public List<Expr> getKw_defaults() {
		return kw_defaults;
	}
	public void setKw_defaults(List<Expr> kw_defaults) {
		this.kw_defaults = kw_defaults;
	}
	public Arg getKward() {
		return kward;
	}
	public void setKward(Arg kward) {
		this.kward = kward;
	}
	public List<Expr> getDefaults() {
		return defaults;
	}
	public void setDefaults(List<Expr> defaults) {
		this.defaults = defaults;
	}
}
