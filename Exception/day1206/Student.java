package day1206;

import org.apache.log4j.Logger;

public class Student {
	private int age;
	
	static Logger logger=Logger.getLogger(Student.class);
	public void setAge(int age)throws Exception{
		if (age>100||age<1) {
			String message = "年龄值应该在0-100之间!错误值:" + age;
			logger.error(message);
			throw new Exception(message);
		}
		this.age=age;
	}
}
