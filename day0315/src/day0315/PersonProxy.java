package day0315;

import org.apache.log4j.Logger;
/**
 * ��̬����̫���ޣ�ֻ�����ĳһָ���ӿڣ�
 * @author Mr.Yang
 *
 */
public class PersonProxy implements IPerson {
	
	private IPerson target;//������Ķ���
	private Logger logger = Logger.getLogger(PersonProxy.class);
	
	public PersonProxy(IPerson target) {
		this.target = target;
	}
	
	//���������
	@Override
	public void sleep() {
		logger.info("sleep������ʼִ��...");
		target.sleep();//��������������Χ����Ҫ����Ŀ������ɽ
		logger.info("sleep����ִ�����...");
	}

	@Override
	public void eat() {
		logger.info("eat����ִ�п�ʼ...");
		target.eat();
		logger.info("eat����ִ�����...");
	}
	
	
}
