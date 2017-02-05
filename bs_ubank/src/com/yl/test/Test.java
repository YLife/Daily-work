package com.yl.test;

import com.yl.impl.biz.BankBizImpl;
import com.yl.interfaces.biz.BankBiz;

public class Test {
	public static void main(String[] args) {
		BankBiz biz = new BankBizImpl();
//		double ban = biz.getBalance("000");
//		String str = biz.deposit("000", 100);
//		String str = biz.withDraw("000", 100);
//		String str = biz.trans("000", "001", 100);
		String str = biz.modifyPwd("000", "0000", "000");
		System.out.println(str);
	}
}
