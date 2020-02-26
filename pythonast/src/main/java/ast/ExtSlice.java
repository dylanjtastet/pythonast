package ast;

import java.util.List;

public class ExtSlice implements Slice{

	public ExtSlice() {}
	private List<Slice> dims;
	public List<Slice> getDims() {
		return dims;
	}
	public void setDims(List<Slice> dims) {
		this.dims = dims;
	}
}
