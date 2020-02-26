package reference;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class ListFuture extends RefFuture{

	private List<Object> target;
	private Long ref;
	
	public ListFuture(List<Object> target, Long ref, Map<Long, Object> refMap) {
		super(refMap);
		this.target = target;
		this.ref = ref;
	}

	@Override
	public void complete() {
		target.add(refMap.get(ref));
	}

}
