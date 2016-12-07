package list;


public class Dog extends Pet{
	String strain;
	
	/**
	 * Constructor
	 * @param strain
	 */
	public Dog(String strain){
		super();
		this.strain=strain;
	}
	
	/**
	 * Constructor(arguements)
	 * @param name
	 * @param health
	 * @param love
	 * @param strain
	 */
	public Dog(String name,int health,int love,String strain) {
		super(name,health,love);
		this.strain=strain;
	}
	
	/**
	 * getter
	 * @return strain
	 */
	public String getStrain() {
		return strain;
	}
	
	/**
	 * setter
	 * @param strain
	 */
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	@Override
	public void print(){
		System.out.println("¹·µÄ×Ô°×:"+super.getName()+","+super.getHealth()+","+super.getLove()+","+this.strain);
	}
}
