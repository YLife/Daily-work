package day0315;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * @author Mr.Yang
 *
 */
public class DynaProxy implements InvocationHandler {
	
	private Object target;//被代理的对象
	private Advice advice;//将日志记录方法抽离出来
	
	/**
	 * 
	 * @param target 目标对象
	 * @return 代理对象:当我们通过代理对象调用目标对象所实现的接口中
	 * 的方法时，就会转为对代理类中invoke方法的调用（即实现InvocationHandle接口的缘由）
	 */
	public Object bind(Object target){
		this.target = target;
		//通过反射技术获得target的一个代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] params)
			throws Throwable {
		System.out.println("该方法被执行...");
		advice.before(proxy, method);
		Object result =  method.invoke(target, params);
		advice.after(proxy, method);
		return result;
	}

	public Advice getAdvice() {
		return advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

}
