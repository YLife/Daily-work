package com.yl.collection;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestList {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		set.add("eee");
		
		for (String str : set) {
			System.out.println(str);
		}
	}
}
