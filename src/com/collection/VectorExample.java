package com.collection;


import java.util.Vector;
//vector is thread safe
//vector slow
public class VectorExample {
	
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		Vector<String> v1=new Vector<String>();
		Vector<Double> v2=new Vector<Double>();
		
		v.add(12);
		v.add(2);
		v.add(4);
		v.add(6);
		v.add(7);
		
		v1.add("GH");
		v1.add("KG");
		v1.add("KS");
		v1.add("DK");
		
		v2.add(12.50);
		v2.add(10.00);
		v2.add(6.50);
		v2.add(7.50);
		v2.add(45.50);
		
		System.out.println(v.get(0));
		System.out.println(v.get(3));
		
		System.out.println(v1.get(0));
		System.out.println(v1.get(3));
		
		System.out.println(v2.get(0));
		System.out.println(v2.get(3));
		
		for(int i=0;i<v1.size();i++) {
			
			System.out.println(v1.get(i));
			
		}
	}

}
