package day0315;

import java.lang.reflect.Method;

public interface Advice {
	
	
	void before(Object target , Method method);
	
	void after(Object target , Method method);
	
}
