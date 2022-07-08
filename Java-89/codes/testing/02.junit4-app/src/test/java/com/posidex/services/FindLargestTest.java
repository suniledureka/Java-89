package com.posidex.services;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FindLargestTest {
	static FindLargest obj;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new FindLargest();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		obj = null;
	}

	@Test
	public void testFindLargest() {
		int[] data = {25,8,74,63,12,4};
		int expected = 74;
		int actual = obj.findLargest(data);
		assertEquals(expected, actual);
	}

	@Test
	@Ignore
	public void testFindLargest1() {
		int[] data = {-25,-8,-74,-63,-12,-4};
		int expected = -4;
		int actual = obj.findLargest(data);
		assertEquals(expected, actual);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testFindLargest2() {
		int[] data = {};
		obj.findLargest(data);		
	}	
}
