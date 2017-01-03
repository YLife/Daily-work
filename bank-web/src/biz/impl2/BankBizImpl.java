package biz.impl2;

import biz.BankBiz;

public class BankBizImpl implements BankBiz {

	@Override
	public boolean checkAccount(String cardId, String pwd) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double getBalance(String cardId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deposit(String cardId, double money) {
		// TODO Auto-generated method stub
		System.out.println("biz.impl2.BankBizImpl.deposit");
		return true;
	}

	@Override
	public boolean withDraw(String cardId, double money) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean trans(String aCardId, String bCardId, double money) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean findAccount(String cardId) {
		// TODO Auto-generated method stub
		return false;
	}

}
