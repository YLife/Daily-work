package test;

import org.junit.Assert;

import biz.BankBiz;
import config.ApplicationContext;


public class BizTest {

	BankBiz biz = ApplicationContext.getBankBiz();
	
	/*@Before (the old method)
	public void setUp() throws Exception {
		biz = new BankBizImpl();
		biz.setCardInfoDao(new CardInfoImpl());
		biz.setCardInfoDao(new TradeInfoImpl());
	}
	*/
	
	/**
	 * 测试正确的账号、密码检查账户
	 */
	@org.junit.Test
	public void testCheckAccount() {
		// 调用要测试的方法
		boolean result = biz.checkAccount("000", "000");
		// 检查调用结果是否和预期相符
		// 断言
		Assert.assertTrue(result);
	}
	
	/**
	 * 测试错误的密码检查账户
	 */
	@org.junit.Test
	public void testCheckAccount2() {
		// 调用要测试的方法
		boolean result = biz.checkAccount("000", "error_password");
		// 检查调用结果是否和预期相符
		// 断言
		Assert.assertFalse(result);
	}
	
	/**
	 * 测试获取余额
	 */
	@org.junit.Test
	public void testGetBalance() {
		double balance = biz.getBalance("000");
		Assert.assertTrue(balance==1900);
	}
	
	/**
	 * 测试存款
	 */
	@org.junit.Test
	public void testDeposite() {
		boolean result = biz.deposite("001", 1000);
		Assert.assertTrue(result);
	}
	
	/**
	 * 测试余额足够时取款
	 */
	@org.junit.Test
	public void testWithDraw() {
		boolean result = biz.withDraw("002", 100);
		Assert.assertTrue(result);
	}
	
	/**
	 * 测试余额不足时取款
	 */
	@org.junit.Test
	public void testWithDraw2() {
		boolean result = biz.withDraw("002", Double.MAX_VALUE);
		Assert.assertFalse(result);
		
	}
	
	/**
	 * 测试正常情况时转账
	 */
	@org.junit.Test
	public void testTrans() {
		boolean result = biz.trans("002", "001", 100);
		Assert.assertTrue(result);
		
	}
	
	/**
	 * 测试转账账号不存在时转账
	 */
	@org.junit.Test
	public void testTrans2() {
		boolean result = biz.trans("002", "007", 100);
		Assert.assertFalse(result);
	}
	
	/**
	 * 测试余额不足时转账
	 */
	
	@org.junit.Test
	public void testTrans3(){
		boolean result = biz.trans("002", "001", Double.MAX_VALUE);
		Assert.assertFalse(result);
	}
}
