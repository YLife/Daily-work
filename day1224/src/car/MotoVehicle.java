package car;

public abstract class MotoVehicle {
	private String no;
	
	public abstract double getDailyRent();
	
	
	
	public MotoVehicle() {
		
	}
	
	public MotoVehicle(String no){
		this.no=no;
	}

	public double calcRent(int day){
		return day*getDailyRent();
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
}
