package list;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<Pet> list=new ArrayList<Pet>();
		
		Pet penguin01=new Penguin("Å·Å·", 100, 100,Penguin.MALE);
		Pet penguin02=new Penguin("ÑÇÑÇ", 100, 100,Penguin.FEMILE);
		Pet penguin03=new Penguin("·É·É", 100, 100,Penguin.MALE);
		
		
		list.add(penguin01);
		list.add(penguin02);
		list.add(0,penguin03);
		
		for (int i = 0; i < list.size(); i++) {
			Penguin penguin=(Penguin)list.get(i);
			System.out.println(penguin.getName());
		}
		
		list.remove("Å·Å·");
		list.remove(2);
		System.out.println("ÒÆ³ı¡°Å·Å·¡±ºÍ¡°ÑÇÑÇ¡±£º");
		for (int i = 0; i < list.size(); i++) {
			Penguin penguin=(Penguin)list.get(i);
			System.out.println(penguin.getName());
		}
	}
}
