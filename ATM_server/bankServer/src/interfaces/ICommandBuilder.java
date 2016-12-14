package interfaces;

import models.Command;

public interface ICommandBuilder {
	
	/**
	 * 将ATM终端发送过来的string形式的指令解析为command
	 * @param str
	 * @return
	 */
	Command parse(String str);
	
}
