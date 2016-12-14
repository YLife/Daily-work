package interfaces;

import models.Command;

/**
 * 服务端执行指令
 * @author Administrator
 *
 */
public interface ICommandExecuteable {
	
	/**
	 * 执行指令
	 * @param command
	 */
	void execute(Command command);
	
}
