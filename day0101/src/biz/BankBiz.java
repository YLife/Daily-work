package biz;

/**
 * ҵ���ӿ�
 * @author YangLun
 *
 */
public interface BankBiz {
	
	int TRADETYPE_DEPOSIT = 1;
	int TRADETYPE_WITHDRAW = 2;
	String A = "Accout is not exist !";
	String P = "Password is wrong !";
	String S = "Success !";
	String B = "Balance is not enough !";
	String E = "Error !";
	
	/**
	 * ��ѯ���˻��Ƿ����
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
