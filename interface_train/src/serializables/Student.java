package serializables;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 *���л��汾�ţ������жϷ�����ʱ�汾�Ƿ�һ��
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
