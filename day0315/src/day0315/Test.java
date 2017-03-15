package day0315;

public class Test {
	public static void main(String[] args) {
		IPerson target = new Chinese();
		PersonProxy proxy = new PersonProxy(target);
		proxy.sleep();
	}
}
