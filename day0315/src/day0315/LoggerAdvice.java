package day0315;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

/**
 * Advice（通知）
 * 记录业务日志切面的实现类
 * @author Mr.Yang
 *
 */
public class LoggerAdvice implements Advice {

	private Logger logger = Logger.getLogger(LoggerAdvice.class);
	
	/**
	 * 目标对象执行业务前记录日志
	 */
	@Override
	public void before(Object target, Method method) {
		logger.info(target.getClass().getName() + "类的" + method.getName() + "方法开始被调用..." );
	}
	
	/**
	 * 目标对象执行业务后记录日志
	 */
	@Override
	public void after(Object target, Method method) {
		logger.info(target.getClass().getName() + "类的" + method.getName() + "方法调用结束..." );
	}

}
