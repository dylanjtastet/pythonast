package reference;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RefFutureResolver {
	private Map<Long, Object> refMap;
	private List<RefFuture> futures;
	public RefFutureResolver() {
		refMap = new HashMap<Long,Object>();
		futures = new ArrayList<RefFuture>();
	}
	
	public void addPropFuture(Field toSet, Object target, Long ref) {
		futures.add(new PropFuture(toSet, target, ref, refMap));
	}
	
	public void addListFuture(List<Object> target, Long ref) {
		futures.add(new ListFuture(target, ref, refMap));
	}
	
	public void addRef(Long ref, Object obj) {
		refMap.put(ref, obj);
	}
	
	//Assigns all ref fields to their corresponding object.
	//Should only be called when all RefFuture references have been
	//Deserialized and added to the resolver.
	public void resolve() {
		for(RefFuture future : futures) {
			future.complete();
		}
	}
}
