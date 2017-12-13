package com.collection;

import java.util.Hashtable;

public class HashTablePractice {
	public static void main(String[] args) {
		Hashtable<Integer,String> h1=new Hashtable<Integer,String>();
		Hashtable<Double,String> h2=new Hashtable<Double,String>();
		
		h1.put(11,"Hello");
		h1.put(12,"Sumit");	 
		
		h2.put(21.1, "hello");
		h2.put(22.22,"world");
		System.out.println(h1);
		System.out.println(h2.get(22.22));
		System.out.println(h1.get(12));
		
		
	}
}
