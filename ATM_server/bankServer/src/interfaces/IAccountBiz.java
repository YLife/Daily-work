package interfaces;

import models.Account;

public interface IAccountBiz {
	// һЩ״̬��
	int SUCCESS = 0;
	int PWD_ERROR = 1;
	int BALANCE_WARN = 2;
	int ACCOUNT_NOT_EXISTS = 3;
	
	/**
	 * ����ָ���˻� 
	 * @param accountNo �˺�
	 * @return if accountNo not exists, return null
	 */
	Account findAccount(String accountNo);
	
	/**
	 * ����˺ź��������ȷ��
	 * @param accountNo �˺� 
	 * @param pwd ����
	 * @return ״̬��
	 */
	int checkAccount(String accountNo, String pwd);
	
	/**
	 * ��ָ���˻������
	 * @param accountNo �˺�
	 * @return ���
	 */
	double queryBalance(String accountNo);
	
	/**
	 * ָ�����˻�ȡ��
	 * @param accountNo �˺�
	 * @param pwd ����
	 * @param money ȡ����
	 * @return ״̬��
	 */
	int withDraw(String accountNo, String pwd, double money);
	
	/**
	 * ָ�����˻����
	 * @param accountNo �˺�
	 * @param money ����
	 * @return ״̬��
	 */
	int deposit(String accountNo, double money);
}
