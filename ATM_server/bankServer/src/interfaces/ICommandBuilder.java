package interfaces;

import models.Command;

public interface ICommandBuilder {
	
	/**
	 * ��ATM�ն˷��͹�����string��ʽ��ָ�����Ϊcommand
	 * @param str
	 * @return
	 */
	Command parse(String str);
	
}
