package interfaces;

/**
 * 界面呈现接口
 * @author Administrator
 *
 */
public interface IRenderable {
	
	/**
	 * 插入卡
	 */
	void insertCard();
	
	/**
	 * 显示菜单
	 */
	void menu();
	
	/**
	 * 取款的人机交互
	 */
	void withDraw();
	
	/**
	 * 存款的人机交互
	 */
	void deposit();
	
	/**
	 * 查询余额的人机交互
	 */
	void queryBalance();
	
	/**
	 * 退出
	 */
	void exit();
	
}
