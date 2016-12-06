package sample04;

public class LoginController {

	// ��ȷ��
	static final String USER = "admin";
	static final String PWD = "okay";

	/**
	 * ��¼���
	 * @param user �û���
	 * @param pwd ����
	 * @throws UserErrorException �û�������ȷ
	 * @throws PwdErrorException ���벻��ȷ
	 */
	public void login(String user, String pwd) throws UserErrorException,
			PwdErrorException {
		if (!USER.equals(user)) {
			throw new UserErrorException();
		}
		if (!PWD.equals(pwd)) {
			throw new PwdErrorException();
		}
	}

}
