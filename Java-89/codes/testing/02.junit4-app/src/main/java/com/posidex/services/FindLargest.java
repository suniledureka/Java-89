package com.posidex.services;

public class FindLargest {
	public int findLargest(int[] data) {
		int lar = data[0];
		for(int x : data) {
			if(x > lar)
				lar = x;
		}
		return lar;
	}
}