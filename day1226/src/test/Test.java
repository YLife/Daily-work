package test;

public class Test {
	public static void main(String[] args) {
		//�Զ�װ���Integer����
		Integer a = 100,b=100,e=128,f=128;
		int h=100;
		System.out.println((a==b)+","+(e==f));
		//�Զ�����Ϊint�����ڱȽ�
		System.out.println(a==h);
		Integer c = new Integer(100);
		Integer d = new Integer(100);
		Integer g=c;
		System.out.println((c==d)+" ,"+(g==c));
		//a,cû������ͬһ������
		System.out.println(a==c);
	}
}
