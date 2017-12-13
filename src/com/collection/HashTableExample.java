package com.collection;


import java.util.Hashtable;

public class HashTableExample {
	//HashTable thread safe safe and slow
public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		map.put(11, "KK");
		map.put(2, "HJ");
		map.put(7, "LM");
		map.put(4, "KL");
		
		System.out.println(map);
		System.out.println(map.get(11));
		
		Hashtable<Double,String> map2=new Hashtable<Double,String>();
		map2.put(1.1, "KK");
		map2.put(2.3, "HJ");
		map2.put(4.4, "GH");
		map2.put(5.5, "MB");
		
		System.out.println(map2);
		System.out.println(map2.get(1.1));
		
	}


}
