package day0315;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

/**
 * Advice��֪ͨ��
 * ��¼ҵ����־�����ʵ����
 * @author Mr.Yang
 *
 */
public class LoggerAdvice implements Advice {

	private Logger logger = Logger.getLogger(LoggerAdvice.class);
	
	/**
	 * Ŀ�����ִ��ҵ��ǰ��¼��־
	 */
	@Override
	public void before(Object target, Method method) {
		logger.info(target.getClass().getName() + "���" + method.getName() + "������ʼ������..." );
	}
	
	/**
	 * Ŀ�����ִ��ҵ����¼��־
	 */
	@Override
	public void after(Object target, Method method) {
		logger.info(target.getClass().getName() + "���" + method.getName() + "�������ý���..." );
	}

}
