package com.collection;

import java.util.ArrayList;
//ArrayList not thread safe
//ArrayList is fast
public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<String> arr1=new ArrayList<String>();
		ArrayList<Double> arr2=new ArrayList<Double>();
		
		arr.add(12);
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		
		arr1.add("GH");
		arr1.add("KG");
		arr1.add("KS");
		arr1.add("DK");
		
		arr2.add(12.50);
		arr2.add(10.00);
		arr2.add(6.50);
		arr2.add(7.50);
		arr2.add(45.50);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(3));
		
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(3));
		
		System.out.println(arr2.get(0));
		System.out.println(arr2.get(3));
		
for(int i=0;i<arr.size();i++) {
			
			System.out.println(arr.get(i));
			
		}
	}

}
