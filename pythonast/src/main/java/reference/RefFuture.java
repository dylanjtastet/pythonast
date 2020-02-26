package reference;

import java.util.Map;

public abstract class RefFuture {
	protected Map<Long, Object> refMap;
	public RefFuture(Map<Long, Object> refMap) {
		this.refMap = refMap;
	}
	public abstract void complete();
}
