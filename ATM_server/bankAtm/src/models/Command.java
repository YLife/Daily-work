package models;

/**
 * ATM�ն������˷��͵�ָ��
 * @author Administrator
 *
 */
public abstract class Command {
	// ָ������(ָ��ͷ)
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
