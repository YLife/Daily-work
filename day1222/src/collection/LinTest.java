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
		
		//使用peek()获取栈顶元素（链表是先进先出）
		System.out.println(((LinkedList<Car>)cars).peek().toString(((LinkedList<Car>)cars).peek()));
		//移除栈顶元素
		((LinkedList<Car>)cars).remove();
		
		
		Iterator<Car> its = cars.iterator();
		while (its.hasNext()) {
			Car car = its.next();
			System.out.println(car.toString(car));
			
		}
	}
}
