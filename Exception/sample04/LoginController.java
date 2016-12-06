package sample04;

public class LoginController {

	// 正确的
	static final String USER = "admin";
	static final String PWD = "okay";

	/**
	 * 登录检查
	 * @param user 用户名
	 * @param pwd 密码
	 * @throws UserErrorException 用户名不正确
	 * @throws PwdErrorException 密码不正确
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
