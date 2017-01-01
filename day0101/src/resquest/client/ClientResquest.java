package resquest.client;

/**
 * ���ͻ����������Ϊ�ӿ�
 * @author YangLun
 *
 */
public interface ClientResquest {
	
	/**
	 * �鿴�˻��Ƿ����
	 * @param cardId
	 * @return
	 */
	String findAccount(String cardId);
	
	/**
	 * У���˻���Ϣ�Ƿ���ȷ
	 * @param cardId
	 * @param pwd
	 * @return
	 */
	String checkAccount(String cardId , String pwd);
	
	/**
	 * ��ѯ���
	 * @param cardId
	 * @return
	 */
	double getBalance(String cardId);
	
	/**
	 * ���
	 * @param cardId
	 * @param money
	 * @return
	 */
	String deposit(String cardId , double money);
	
	/**
	 * ȡ��
	 * @param cardId
	 * @param money
	 * @return
	 */
	String withDraw(String cardId , double money);
	
	/**
	 * ת��
	 * @param outCardId
	 * @param inCardId
	 * @param money
	 * @return
	 */
	String trans(String outCardId , String inCardId , double money);
	
	/**
	 * �޸�����
	 * @param cardId
	 * @param oldPwd
	 * @param newPwd
	 * @return
	 */
	String modifyPwd(String cardId , String oldPwd , String newPwd);
}
