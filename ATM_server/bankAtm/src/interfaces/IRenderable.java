package interfaces;

/**
 * ������ֽӿ�
 * @author Administrator
 *
 */
public interface IRenderable {
	
	/**
	 * ���뿨
	 */
	void insertCard();
	
	/**
	 * ��ʾ�˵�
	 */
	void menu();
	
	/**
	 * ȡ����˻�����
	 */
	void withDraw();
	
	/**
	 * �����˻�����
	 */
	void deposit();
	
	/**
	 * ��ѯ�����˻�����
	 */
	void queryBalance();
	
	/**
	 * �˳�
	 */
	void exit();
	
}
