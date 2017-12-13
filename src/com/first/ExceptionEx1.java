package com.first;

public class ExceptionEx1 {
	
	static void output(int Sellingprice,int Costprice)throws NotToProfitException {
	
		if(Sellingprice<Costprice) {
			throw new NotToProfitException("Loss");
		}else
			System.out.println("Profit");
		}
	

	
public static void main(String[] args) {
	try {
		output(6000,9000);
		
	}catch(Exception e) {
		System.out.println("The Company"+e);
		
	}
	System.out.println("restofthecode");
	
	
	
}}

