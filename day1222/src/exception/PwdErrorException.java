package exception;

/**
 * 自定义一个密码错误异常
 * @author Administrator
 *
 */
public class PwdErrorException extends Exception {
	/**
	 *定义一个序列号，便于反序列时验证
	 *@param
	 */
	private static final long serialVersionUID = 1L;

	public PwdErrorException(){
		super("This is a wrong password !");
	}
}
