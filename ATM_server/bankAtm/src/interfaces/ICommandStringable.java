package interfaces;

import models.Command;


public interface ICommandStringable {
	
	/**
	 * ��������ʽ��ָ��ת��ΪString��ʽ, ��������ͨѶ
	 * @param command
	 * @return
	 */
	String toString4Network(Command command);
	
}
