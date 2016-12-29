package request;

/**
 * �ͻ�������
 * @author Administrator
 *
 */
public interface BankRequest {
	
	/**
	 * �����˻��Ƿ����
	 * @param cardId
	 * @return
	 */
	boolean findAccount(String cardId);
	
	/**
	 * У���˻���Ϣ�Ƿ���ȷ
	 * @param cardId
	 * @param pwd
	 * @return
	 */
	boolean checkAccount(String cardId , String pwd);
	
	/**
	 * ��ѯ���
	 * @param card
	 * @return
	 */
	double getBalance(String cardId);
	
	/**
	 * ���
	 * @param cardId
	 * @param money
	 * @return
	 */
	boolean deposit(String cardId , double money);
	
	/**
	 * ȡ��
	 * @param cardId
	 * @param money
	 * @return
	 */
	boolean withDraw(String cardId , double money);
	
	/**
	 * ת��
	 * @param aCardId
	 * @param bCardId
	 * @param money
	 * @return
	 */
	boolean trans(String outCardId , String inCardId , double money);
}
