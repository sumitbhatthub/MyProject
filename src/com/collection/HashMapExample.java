package com.collection;

import java.util.HashMap;

public class HashMapExample {
	//HashMap depend key value pair
	//HashMap not thread safe and fast
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(11, "KK");
		map.put(2, "HJ");
		map.put(7, "LM");
		map.put(4, "KL");
		
		System.out.println(map);
		System.out.println(map.get(11));
		
		HashMap<String,String> map2=new HashMap<String,String>();
		map2.put("K", "KK");
		map2.put("H", "HJ");
		map2.put("L", "GH");
		map2.put("M", "MB");
		
		System.out.println(map2);
		System.out.println(map2.get("M"));
		System.out.println(map2.get("H"));
		
	}

}
