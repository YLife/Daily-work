package test;

import requestImpl.BankRequestImpl;
import ui.Atm;

public class Test {
	public static void main(String[] args) {
		Atm atm = new Atm();
		atm.setBr(new BankRequestImpl());
		atm.checkAccout();
	}
}
