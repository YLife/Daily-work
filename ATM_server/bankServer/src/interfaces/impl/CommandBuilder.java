package interfaces.impl;

import models.CheckAccountCommand;
import models.Command;
import models.DepositCommand;
import models.QueryBalanceCommand;
import models.WithDrawCommand;
import interfaces.ICommandBuilder;

public class CommandBuilder implements ICommandBuilder {

	@Override
	public Command parse(String str) {
		String[] parse = str.split(" ");
		if ("CheckAccoutCommond".equalsIgnoreCase(parse[0])) {
			CheckAccountCommand command= new CheckAccountCommand(parse[0], parse[1], parse[2]);
			return command;
		}else if ("QueryBalance".equalsIgnoreCase(parse[0])) {
			QueryBalanceCommand command = new QueryBalanceCommand(parse[0], parse[1]);
			return command;
		}else if ("DepositCommand".equalsIgnoreCase(parse[0])) {
			DepositCommand command = new DepositCommand(parse[0], parse[1],Double.parseDouble(parse[2]) );
			return command;
		}else if ("WithDrawCommand".equalsIgnoreCase(parse[0])) {
			WithDrawCommand command = new WithDrawCommand(parse[0], parse[1], parse[2], Double.parseDouble(parse[3]));
			return command;
		}
		return null;
	}

}
