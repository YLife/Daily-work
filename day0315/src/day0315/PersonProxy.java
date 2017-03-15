package day0315;

import org.apache.log4j.Logger;
/**
 * 静态代理（太局限，只能针对某一指定接口）
 * @author Mr.Yang
 *
 */
public class PersonProxy implements IPerson {
	
	private IPerson target;//被代理的对象
	private Logger logger = Logger.getLogger(PersonProxy.class);
	
	public PersonProxy(IPerson target) {
		this.target = target;
	}
	
	//代理的事物
	@Override
	public void sleep() {
		logger.info("sleep方法开始执行...");
		target.sleep();//超出代理能力范围，需要请求目标对象出山
		logger.info("sleep方法执行完毕...");
	}

	@Override
	public void eat() {
		logger.info("eat方法执行开始...");
		target.eat();
		logger.info("eat方法执行完毕...");
	}
	
	
}
