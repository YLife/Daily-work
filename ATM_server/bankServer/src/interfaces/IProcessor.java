package interfaces;

public interface IProcessor {
	/**
	 * ����������ATM���ַ�����Ϣ(command��String��ʽ)
	 * @return
	 */
	String receive();
	
	/**
	 * ������Ϣ��ATM
	 * @param message
	 */
	void send(String message);
}
