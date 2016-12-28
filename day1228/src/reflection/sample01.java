package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class sample01 {
	public static void main(String[] args) throws Exception {
	//加载类，得到类模板
	Class<?> template = Class.forName("com.hwgk.atm.entity.CardInfo");
	//分析类模板的字段
	Field[] fields = template.getDeclaredFields();
	System.out.print("字段有：");
	for (Field field : fields) {
		System.out.print(field.getName()+" ,");
	}
	//分析类模板中的方法
	Method[] methods = template.getDeclaredMethods();
	System.out.print("\n方法有：");
	for (Method method : methods) {
		System.out.print(method.getName()+" ,");
	}
	}
}
