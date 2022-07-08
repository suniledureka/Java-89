package com.posidex;

import com.posidex.services.FindLargest;

public class Main {

	public static void main(String[] args) {
		FindLargest larObj = new FindLargest();
		
		int[] data = {25,78,63,41,2,14};
		int expected = 78;
		int actual = larObj.findLargest(data);
		System.out.println("Expected = " + expected + " | Actual = " + actual);
		System.out.println();
		
		int[] data1 = {87,-85,71,100,25,-100};
		expected = 100;
		actual = larObj.findLargest(data1);
		System.out.println("Expected = " + expected + " | Actual = " + actual);
		System.out.println();
		
		int[] data2 = {};
		expected = -25;
		actual = larObj.findLargest(data2);
		System.out.println("Expected = " + expected + " | Actual = " + actual);
		System.out.println();		
	}

}
