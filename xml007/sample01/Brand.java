package sample01;

import java.util.ArrayList;
import java.util.List;

public class Brand {
	private String name;
	private List<Type> types;

	public Brand() {
		types = new ArrayList<>();
	}

	public Brand(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

}
