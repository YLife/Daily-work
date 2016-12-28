package reflection;

import java.lang.reflect.Field;

public class sample02 {
	public static void main(String[] args) throws Exception {
		//加载类，得到类模板
		Class<?> temp = Class.forName("com.hwgk.atm.entity.TradeInfo");
		//分析类模板中的字段
		Field[] fields = temp.getDeclaredFields();
		System.out.print("字段有：");
		for (Field field : fields) {
			System.out.print(field.getName()+" ,");
		}
	}
}
