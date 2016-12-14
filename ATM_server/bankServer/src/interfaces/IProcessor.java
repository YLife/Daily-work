package interfaces;

public interface IProcessor {
	/**
	 * 接收来自于ATM的字符串消息(command的String形式)
	 * @return
	 */
	String receive();
	
	/**
	 * 发送消息给ATM
	 * @param message
	 */
	void send(String message);
}
