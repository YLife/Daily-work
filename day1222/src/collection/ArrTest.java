package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrTest {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Benz", "110"));
		cars.add(new Car("BMW", "111"));
		cars.add(new Car("Lexus", "112"));
		
		Iterator<Car> it = cars.iterator();
		for (;it.hasNext();) {
			Car car =  it.next();
			System.out.println(car.toString(car));
		}
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString(cars.get(i)));
		}
	}
}
