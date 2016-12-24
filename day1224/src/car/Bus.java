package car;

public class Bus extends MotoVehicle{

	@Override
	public double getDailyRent() {
		return getSeatCount()>=16?1500:900;
		
	}
	
	private int seatCount;

	public Bus() {
		super();
	}

	public Bus(String no ,int seatCount) {
		super(no);
		this.seatCount=seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
}
