package test;

public class Test {
	public static void main(String[] args) {
		//自动装箱成Integer类型
		Integer a = 100,b=100,e=128,f=128;
		int h=100;
		System.out.println((a==b)+","+(e==f));
		//自动拆箱为int类型在比较
		System.out.println(a==h);
		Integer c = new Integer(100);
		Integer d = new Integer(100);
		Integer g=c;
		System.out.println((c==d)+" ,"+(g==c));
		//a,c没有引用同一个对象
		System.out.println(a==c);
	}
}
