package exception;

/**
 * �Զ���һ����������쳣
 * @author Administrator
 *
 */
public class PwdErrorException extends Exception {
	/**
	 *����һ�����кţ����ڷ�����ʱ��֤
	 *@param
	 */
	private static final long serialVersionUID = 1L;

	public PwdErrorException(){
		super("This is a wrong password !");
	}
}
