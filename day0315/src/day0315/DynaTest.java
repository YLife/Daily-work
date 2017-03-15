package day0315;

public class DynaTest {
	
	public static void main(String[] args) {
		IPerson target = new Chinese();
		DynaProxy proxy = new DynaProxy();
		Advice advice = new LoggerAdvice();
		proxy.setAdvice(advice);
		IPerson person  = (IPerson) proxy.bind(target);
		person.eat();
		person.sleep();
	}
}
