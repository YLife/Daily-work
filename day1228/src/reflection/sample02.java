package reflection;

import java.lang.reflect.Field;

public class sample02 {
	public static void main(String[] args) throws Exception {
		//�����࣬�õ���ģ��
		Class<?> temp = Class.forName("com.hwgk.atm.entity.TradeInfo");
		//������ģ���е��ֶ�
		Field[] fields = temp.getDeclaredFields();
		System.out.print("�ֶ��У�");
		for (Field field : fields) {
			System.out.print(field.getName()+" ,");
		}
	}
}
