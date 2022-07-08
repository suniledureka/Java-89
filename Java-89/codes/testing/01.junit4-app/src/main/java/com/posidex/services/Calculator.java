package com.posidex.services;

public class Calculator {
	public int add(int x , int y) {
		return x + y;
	}
	
	public int sub(int x , int y) {
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {}
		return x - y;
	}	
	
	public int div(int x , int y) {	  	
		return x / y;
	}	
}
