package exception;

/**
 * �Զ���һ���˻�δ�ҵ��쳣
 * @author Administrator
 *
 */
public class AccNotFound extends Exception{
	/**
	 *����һ�����кţ����ڷ�����ʱ��֤
	 *@param
	 */
	private static final long serialVersionUID = 1L;

	public AccNotFound(){
		super("This account is not be found ��");
	}
}
