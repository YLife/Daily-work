package interfaces;
/**
 * 网络通讯接口
 * @author Administrator
 *
 */
public interface Inetwork {
	
	/**
	 * 向服务器发送指令(字符串格式)
	 * @param commandStr
	 */
	void send(String commandStr);
	
	/**
	 * 接收服务器返回的字符串消息
	 * @return
	 */
	String receive();
	
}
