package biz;

/**
 * ҵ���ӿ�
 * @author Administrator
 *
 */
public interface BankBiz {
	
	//����������
	int TRADETYPE_DEPOSITE = 1;
	int TRADETYPE_WITHDRAW = 2;
	
	/**
	 * ����˻��Ƿ����
	 * @param cardId
	 * @param pwd
	 * @return 
	 */
	boolean checkAccount(String cardId , String pwd);
	
	/**
	 * ��ѯ���
	 * @param cardId
	 * @return 
	 */
	double getBalance(String cardId);
	
	/**
	 * ��Ǯ
	 * @param cardId
	 * @param money
	 * @return
	 */
	boolean deposite(String cardId , double money);
	
	/**
	 * ȡǮ
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
	boolean trans(String aCardId , String bCardId , double money);
}
