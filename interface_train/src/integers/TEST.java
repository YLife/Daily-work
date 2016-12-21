package integers;

import java.io.OutputStream;

public class TEST {
	public static void main(String[] args) {
		Integer a = 127;
		Integer b = 127;
		Integer c = 128;
		Integer d = 128;
		//范围在-128-127，缓存对应的整型对象
		System.out.println(a==b);
		//超出范围，缓存其他值
		System.out.println(c==d);
	}
}
