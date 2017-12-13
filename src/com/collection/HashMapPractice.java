package com.collection;

import java.util.HashMap;

public class HashMapPractice {
	
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		HashMap<Double,String> h2=new HashMap<Double,String>();
		
		h1.put(11,"Hello");
		h1.put(12,"Sumit");	 
		
		h2.put(21.1, "hello");
		h2.put(22.22,"world");
		
		System.out.println(h2);
		System.out.println(h2.get(22.22));
		System.out.println(h1.get(12));
		
		
	}}