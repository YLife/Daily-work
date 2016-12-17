package day1217;

import java.util.*;

public class Maps {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		map.put("a", new Student("afas", 14));
		map.put("2", new Student("gadg", 16));
		map.put("c", new Student("sfsafdsf", 765));
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.println(map.get(string).getName());
		}
	}
}
