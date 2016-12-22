package exception;

import org.apache.log4j.Logger;

public class LoginControllor {
	private static final String ACCOUNT_NO="123";
	private static final String PWD = "123";
	private String Err01 = "This account is not be found !";
	private String Err02 = "This is a wrong password !";
	
	Logger logger = Logger.getLogger(LoginControllor.class);
	
	public void login(String accoutNo,String pwd) throws AccNotFound, PwdErrorException{
		if (!ACCOUNT_NO.equals(accoutNo)) {
			logger.error(Err01);
			throw new AccNotFound();
		}
		if (!PWD.equals(pwd)) {
			logger.error(Err02);
			throw new PwdErrorException();
		}
	}
}
