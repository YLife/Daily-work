package sample01;

import java.util.ArrayList;
import java.util.List;

public class Brand {
	private String name;
	private List<Type> type;
	
	private Brand() {
		type = new ArrayList<>();

	}
	
	public Brand(String name){
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Type> getType() {
		return type;
	}

	public void setType(List<Type> type) {
		this.type = type;
	}
	
	
}
