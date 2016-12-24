package car;

public class Car extends MotoVehicle{

	@Override
	public double getDailyRent() {
		int rent=0;
		switch (type) {
		case "BUICK":
			rent=900;
			break;
		case "BMW":
			rent=800;
			break;
		case "BENZ":
			rent=600;
			break;
		}
		return rent;
	}
	
	private String type;
	
	public static final int BUICK=1;
	public static final int BMW=2;
	public static final int BENZ=3;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String no,String type) {
		super(no);
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	
	
}
