package interfaces;

import models.Command;


public interface ICommandStringable {
	
	/**
	 * 将对象形式的指令转化为String形式, 便于网络通讯
	 * @param command
	 * @return
	 */
	String toString4Network(Command command);
	
}
