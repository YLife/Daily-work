package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinTest {
	public static void main(String[] args) {
		List<Car> cars = new LinkedList<Car>();
		cars.add(new Car("Benz", "110"));
		cars.add(new Car("BMW", "111"));
		cars.add(new Car("Lexus", "112"));
		
		Iterator<Car> it = cars.iterator();
		while (it.hasNext()) {
			Car car = it.next();
			System.out.println(car.toString(car));
		}
		
		//ʹ��peek()��ȡջ��Ԫ�أ��������Ƚ��ȳ���
		System.out.println(((LinkedList<Car>)cars).peek().toString(((LinkedList<Car>)cars).peek()));
		//�Ƴ�ջ��Ԫ��
		((LinkedList<Car>)cars).remove();
		
		
		Iterator<Car> its = cars.iterator();
		while (its.hasNext()) {
			Car car = its.next();
			System.out.println(car.toString(car));
			
		}
	}
}
