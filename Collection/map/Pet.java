package map;

public class Pet {
	/**
	 * private fields
	 */
	private String name;
	private  int health;
	private int love;
	
	/**
	 * Constructor
	 */
	public Pet(){
		
	}
	
	/**
	 * Constructor(arguements)
	 * @param n name
	 * @param h health
	 * @param l love
	 */
	public Pet(String n,int h,int l){
		name=n;
		health=h;
		love=l;
	}
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getLove() {
		return love;
	}
	
	public void setLove(int love) {
		this.love = love;
	}
	
	
	public void print(){
		System.out.println("ÄãºÃ£¡");
	}
	
}
