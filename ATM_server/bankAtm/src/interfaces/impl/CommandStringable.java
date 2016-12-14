package interfaces.impl;

import models.CheckAccountCommand;
import models.Command;
import models.DepositCommand;
import models.QueryBalanceCommand;
import models.WithDrawCommand;
import interfaces.ICommandStringable;

public class CommandStringable implements ICommandStringable {

	@Override
	public String toString4Network(Command command) {
		String str = null;
		if (command instanceof WithDrawCommand) {
			WithDrawCommand cmd = (WithDrawCommand) command;
			str = cmd.getCommandName() + " " + cmd.getAccountNo() + " "
					+ cmd.getPwd() + " " + cmd.getMoney();
		} else if (command instanceof QueryBalanceCommand) {
			QueryBalanceCommand cmd = (QueryBalanceCommand) command;
			str = cmd.getCommandName() + " " + cmd.getAccountNo();
		} else if (command instanceof DepositCommand) {
			DepositCommand cmd = (DepositCommand) command;
			str = cmd.getCommandName() + " " + cmd.getAccountNo() + " "
					+ cmd.getMoney();
		} else if (command instanceof WithDrawCommand) {
			WithDrawCommand cmd = (WithDrawCommand) command;
			str = cmd.getCommandName() + " " + cmd.getAccountNo() + " "
					+ cmd.getPwd() + " " + cmd.getMoney();
		} else if (command instanceof CheckAccountCommand) {
			CheckAccountCommand cmd = (CheckAccountCommand) command;
			str = cmd.getCommandName() + " " + cmd.getAccountNo() + " "
					+ cmd.getPwd();
		}
		return str;
	}

}
