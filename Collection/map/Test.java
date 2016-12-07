package map;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		Map<String, Penguin> map=new HashMap<String, Penguin>();
		
		Penguin penguin01=new Penguin("欧欧", 100, 100,Penguin.MALE);
		Penguin penguin02=new Penguin("亚亚", 100, 100,Penguin.FEMILE);
		Penguin penguin03=new Penguin("飞飞", 100, 100,Penguin.MALE);
		
		
		map.put("a",penguin01);
		map.put("b",penguin02);
		map.put("c",penguin03);
		
		Set<String> keys=map.keySet();
		
		//用for-each遍历数组
		
		for (String key : keys) {
			System.out.println(map.get(key).getName());
		}
		
		//使用Iterator遍历数组
		Iterator<String> it=keys.iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.println((map.get(string)).getName());
			
		}
 	}
}
