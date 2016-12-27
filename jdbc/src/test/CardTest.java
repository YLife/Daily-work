package test;

import java.util.List;

import entity.CardInfo;
import impl.CardInfoImpl;

/**
 * 对cardInfo进行测试
 * @author Administrator
 *
 */
public class CardTest {
	public static void main(String[] args) {
		CardInfoImpl card = new CardInfoImpl();
		//增
		CardInfo ca = new CardInfo("444", "444", 444);
		card.save(ca);
		//改
		ca = new CardInfo("444", "444", 555);
		card.update(ca);
		//删
		card.del("444");
		//查
		List<CardInfo> list = card.queryAll();
		for (CardInfo cardInfo : list) {
			System.out.println(cardInfo.getBalance());
		}
	}
}

