package serializables;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 *序列化版本号，用于判断反序列时版本是否一致
	 *@param
	 */
	private static final long serialVersionUID = 1L;
	private String name ;
	private int age;
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
