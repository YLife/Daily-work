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
	 * ������ȷ���˺š��������˻�
	 */
	@org.junit.Test
	public void testCheckAccount() {
		// ����Ҫ���Եķ���
		boolean result = biz.checkAccount("000", "000");
		// �����ý���Ƿ��Ԥ�����
		// ����
		Assert.assertTrue(result);
	}
	
	/**
	 * ���Դ�����������˻�
	 */
	@org.junit.Test
	public void testCheckAccount2() {
		// ����Ҫ���Եķ���
		boolean result = biz.checkAccount("000", "error_password");
		// �����ý���Ƿ��Ԥ�����
		// ����
		Assert.assertFalse(result);
	}
	
	/**
	 * ���Ի�ȡ���
	 */
	@org.junit.Test
	public void testGetBalance() {
		double balance = biz.getBalance("000");
		Assert.assertTrue(balance==1900);
	}
	
	/**
	 * ���Դ��
	 */
	@org.junit.Test
	public void testDeposite() {
		boolean result = biz.deposite("001", 1000);
		Assert.assertTrue(result);
	}
	
	/**
	 * ��������㹻ʱȡ��
	 */
	@org.junit.Test
	public void testWithDraw() {
		boolean result = biz.withDraw("002", 100);
		Assert.assertTrue(result);
	}
	
	/**
	 * ��������ʱȡ��
	 */
	@org.junit.Test
	public void testWithDraw2() {
		boolean result = biz.withDraw("002", Double.MAX_VALUE);
		Assert.assertFalse(result);
		
	}
	
	/**
	 * �����������ʱת��
	 */
	@org.junit.Test
	public void testTrans() {
		boolean result = biz.trans("002", "001", 100);
		Assert.assertTrue(result);
		
	}
	
	/**
	 * ����ת���˺Ų�����ʱת��
	 */
	@org.junit.Test
	public void testTrans2() {
		boolean result = biz.trans("002", "007", 100);
		Assert.assertFalse(result);
	}
	
	/**
	 * ��������ʱת��
	 */
	
	@org.junit.Test
	public void testTrans3(){
		boolean result = biz.trans("002", "001", Double.MAX_VALUE);
		Assert.assertFalse(result);
	}
}
