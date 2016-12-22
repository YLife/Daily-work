package collection;

public class Car {
	private String CarName;
	private String CarNo;
	
	public Car() {
		super();
	}
	
	public Car(String carName, String carNo) {
		super();
		CarName = carName;
		CarNo = carNo;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarNo() {
		return CarNo;
	}

	public void setCarNo(String carNo) {
		CarNo = carNo;
	}
	
	public String toString(Car car) {
		return car.getCarName()+" , "+car.getCarNo();
	}
}
