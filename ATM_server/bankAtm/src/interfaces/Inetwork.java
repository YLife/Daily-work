package interfaces;
/**
 * ����ͨѶ�ӿ�
 * @author Administrator
 *
 */
public interface Inetwork {
	
	/**
	 * �����������ָ��(�ַ�����ʽ)
	 * @param commandStr
	 */
	void send(String commandStr);
	
	/**
	 * ���շ��������ص��ַ�����Ϣ
	 * @return
	 */
	String receive();
	
}
