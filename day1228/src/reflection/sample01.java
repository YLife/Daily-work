package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class sample01 {
	public static void main(String[] args) throws Exception {
	//�����࣬�õ���ģ��
	Class<?> template = Class.forName("com.hwgk.atm.entity.CardInfo");
	//������ģ����ֶ�
	Field[] fields = template.getDeclaredFields();
	System.out.print("�ֶ��У�");
	for (Field field : fields) {
		System.out.print(field.getName()+" ,");
	}
	//������ģ���еķ���
	Method[] methods = template.getDeclaredMethods();
	System.out.print("\n�����У�");
	for (Method method : methods) {
		System.out.print(method.getName()+" ,");
	}
	}
}
