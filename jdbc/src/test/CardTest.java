package test;

import java.util.List;

import entity.CardInfo;
import impl.CardInfoImpl;

/**
 * ��cardInfo���в���
 * @author Administrator
 *
 */
public class CardTest {
	public static void main(String[] args) {
		CardInfoImpl card = new CardInfoImpl();
		//��
		CardInfo ca = new CardInfo("444", "444", 444);
		card.save(ca);
		//��
		ca = new CardInfo("444", "444", 555);
		card.update(ca);
		//ɾ
		card.del("444");
		//��
		List<CardInfo> list = card.queryAll();
		for (CardInfo cardInfo : list) {
			System.out.println(cardInfo.getBalance());
		}
	}
}

