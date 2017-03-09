package com.yl.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("aaa", "aaaa");
		map.put("bbb", "bbbb");
		String st = map.put("ccc", "cccc");
		String str = map.put("bbb", "dddd");  
		Iterator<String> iterator = map.keySet().iterator();
		for (; iterator.hasNext();) {
			String type = (String) iterator.next();
			System.out.println(type + ":" + map.get(type));
		}
		System.out.println(str);
		System.out.println(st);
	}
}
