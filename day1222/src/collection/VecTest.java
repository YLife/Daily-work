package collection;

import java.util.Iterator;
import java.util.Vector;

public class VecTest {
	public static void main(String[] args) {
		Vector<Car> cars = new Vector<>();
		cars.add(new Car("Benz", "110"));
		cars.add(new Car("BMW", "111"));
		cars.add(new Car("Lexus", "112"));
		
		Iterator<Car> it = cars.iterator();
		while (it.hasNext()) {
			Car car = (Car) it.next();
			System.out.println(car.toString(car));
		}
	}
}
