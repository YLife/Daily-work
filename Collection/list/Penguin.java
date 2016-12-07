package list;

public class Penguin extends Pet {
	String sex;
	public static final String MALE="¹«";
	public static final String FEMILE="Ä¸";
	
	/**
	 * Constructor
	 * @param sex
	 */
	public Penguin(String sex){
		super();
		this.sex=sex;
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param health
	 * @param love
	 * @param sex
	 */
	public Penguin(String name,int health,int love,String sex){
		super(name, health, love);
		this.sex=sex;
	}
	
	/**
	 * getter
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}
	
	/**
	 * setter
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public void print(){
		System.out.println("Æó¶ì×Ô°×:"+super.getName()+","+super.getHealth()+","+super.getLove()+","+this.sex);
	}
}
