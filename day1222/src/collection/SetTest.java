package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Car> cars = new HashSet<>();
		cars.add(new Car("1", "110"));
		cars.add(new Car("2", "111"));
		cars.add(new Car("3", "112"));
		
		
		Iterator<Car> it = cars.iterator();
		
		while (it.hasNext()) {
			Car car = (Car) it.next();
			System.out.println(car.toString(car));
		}
	}
}
