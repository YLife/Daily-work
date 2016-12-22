package exception;

/**
 * 自定义一个账户未找到异常
 * @author Administrator
 *
 */
public class AccNotFound extends Exception{
	/**
	 *定义一个序列号，便于反序列时验证
	 *@param
	 */
	private static final long serialVersionUID = 1L;

	public AccNotFound(){
		super("This account is not be found ！");
	}
}
