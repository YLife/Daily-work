package day0315;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬������
 * @author Mr.Yang
 *
 */
public class DynaProxy implements InvocationHandler {
	
	private Object target;//������Ķ���
	private Advice advice;//����־��¼�����������
	
	/**
	 * 
	 * @param target Ŀ�����
	 * @return �������:������ͨ������������Ŀ�������ʵ�ֵĽӿ���
	 * �ķ���ʱ���ͻ�תΪ�Դ�������invoke�����ĵ��ã���ʵ��InvocationHandle�ӿڵ�Ե�ɣ�
	 */
	public Object bind(Object target){
		this.target = target;
		//ͨ�����似�����target��һ���������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] params)
			throws Throwable {
		System.out.println("�÷�����ִ��...");
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
