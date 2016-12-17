package day1217;


import java.util.*;

public class Sets {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("sv", 12));
		list.add(new Student("fsd", 14));
		list.add(new Student("sv", 12));
		
		Set<Student> set = new HashSet<>();
		set.addAll(list);
		
		for (Student student : set) {
			System.out.println(student.getAge());
		}
		
		/*for (Student student : list) {
			System.out.println(student);
		}*/
		
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student.getName());
		}
		
		
		
	}
}
