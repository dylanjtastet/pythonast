package reference;

import java.lang.reflect.Field;
import java.util.Map;

public class PropFuture extends RefFuture{
	private Field toSet;
	private Object target;
	private Long ref;
	public PropFuture(Field toSet, Object target, Long ref, Map<Long, Object> refMap) {
		super(refMap);
		this.toSet = toSet;
		this.ref = ref;
		this.target = target;
	}
	//Call when refMap has been completed and field is ready to be set on the object
	public void complete() {
		if(!refMap.containsKey(ref)) {
			throw new FutureReferenceException("Reference map is not yet completed"
					+ "or does not contain the target reference.");
		}
		Object prop = refMap.get(ref);
		try {
			toSet.setAccessible(true);
			toSet.set(target, prop);
			toSet.setAccessible(false);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
