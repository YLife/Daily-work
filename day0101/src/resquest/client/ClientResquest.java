package resquest.client;

/**
 * 将客户端请求抽象为接口
 * @author YangLun
 *
 */
public interface ClientResquest {
	
	/**
	 * 查看账户是否存在
	 * @param cardId
	 * @return
	 */
	String findAccount(String cardId);
	
	/**
	 * 校验账户信息是否正确
	 * @param cardId
	 * @param pwd
	 * @return
	 */
	String checkAccount(String cardId , String pwd);
	
	/**
	 * 查询余额
	 * @param cardId
	 * @return
	 */
	double getBalance(String cardId);
	
	/**
	 * 存款
	 * @param cardId
	 * @param money
	 * @return
	 */
	String deposit(String cardId , double money);
	
	/**
	 * 取款
	 * @param cardId
	 * @param money
	 * @return
	 */
	String withDraw(String cardId , double money);
	
	/**
	 * 转账
	 * @param outCardId
	 * @param inCardId
	 * @param money
	 * @return
	 */
	String trans(String outCardId , String inCardId , double money);
	
	/**
	 * 修改密码
	 * @param cardId
	 * @param oldPwd
	 * @param newPwd
	 * @return
	 */
	String modifyPwd(String cardId , String oldPwd , String newPwd);
}
