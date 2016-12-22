package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import collection.Car;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Car> cars =new HashMap<>();
		cars.put("1", new Car("Benz", "110"));
		cars.put("2", new Car("BMW", "111"));
		cars.put("3", new Car("Lexus", "112"));
		
		//map集合的iterator由其键集值获得
		Iterator<String> it = cars.keySet().iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(cars.get(string).toString(cars.get(string)));
		}
	}
}
