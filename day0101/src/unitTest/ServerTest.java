package unitTest;

import org.junit.Assert;
import org.junit.Test;

import config.ApplicationConfig;
import biz.BankBiz;

public class ServerTest {
	BankBiz biz = ApplicationConfig.getBankBiz();
	
	@Test
	public void testCheckAccount() {
		String res = biz.checkAccount("000", "000");
		Assert.assertTrue(res.equals(BankBiz.S));
	}
	
	@Test
	public void testCheckAccount1() {
		String res = biz.checkAccount("011", "000");
		Assert.assertTrue(res.equals(BankBiz.A));
	}
	
	@Test
	public void testCheckAccount2() {
		String res = biz.checkAccount("000", "001");
		Assert.assertTrue(res.equals(BankBiz.P));
	}
	
	@Test
	public void testGetBalance() {
		double res = biz.getBalance("000");
		Assert.assertTrue(res == 1800);
	}
	
	@Test
	public void testDeposit() {
		String res = biz.deposit("001", 1000);
		Assert.assertTrue(res.equals(BankBiz.S));
	}
	
	@Test
	public void testWithDraw() {
		String res = biz.withDraw("001", 1000);
		Assert.assertTrue(res.equals(BankBiz.S));
	}
	
	@Test
	public void testTrans() {
		String res = biz.trans("001","002", 1000);
		Assert.assertTrue(res.equals(BankBiz.S));
	}
	
	@Test
	public void testModifyPwd() {
		String res = biz.modifyPwd("333", "333" , "33333");
		Assert.assertTrue(res.equals(BankBiz.S));
	}
	

}
