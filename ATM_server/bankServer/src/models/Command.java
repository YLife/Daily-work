package models;

/**
 * ATM终端向服务端发送的指令
 * @author Administrator
 *
 */
public abstract class Command {
	// 指令名称(指令头)
	private String commandName;
		
	public Command() {
	}
	
	public Command(String commandName) {
		this.commandName = commandName;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}
	
}
