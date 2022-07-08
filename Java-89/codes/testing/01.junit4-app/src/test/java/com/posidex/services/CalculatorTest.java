package com.posidex.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static Calculator calc;
	
	@BeforeClass
	public static void initSetup() {
		System.out.println("###--- initSetup() gets executed before all test cases ---###");
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		//Calculator calc = new Calculator();
		System.out.println("@@@--- inside testAdd() method ---@@@");
		int x = 10;
		int y = 20;
		int expected = 30;
		int actual = calc.add(x, y);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd_1() {
		//Calculator calc = new Calculator();
		System.out.println("@@@--- inside testAdd_1() method ---@@@");
		int x = -10;
		int y = 20;
		int expected = 10;
		int actual = calc.add(x, y);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAdd_2() {
		//Calculator calc = new Calculator();
		System.out.println("@@@--- inside testAdd_2() method ---@@@");
		int x = -10;
		int y = -20;
		int expected = -30;
		//int expected = -10;
		int actual = calc.add(x, y);
		
		//assertEquals(expected, actual);
		assertEquals("just for checking", expected, actual);
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("$$$--- gets executed before each test case ---$$$");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("-----------------------------------------------------\n");
	}	
	
	@AfterClass
	public static void cleanUp() {
		calc = null;
		System.out.println("###--- cleanUp() gets executed after all test cases ---###");
	}
	
	//@Test
	//@Test(timeout = 2100)
	@Test(timeout = 1900)
	public void testSub() {
		int x = 10;
		int y = 20;
		int expected = -10;
		int actual = calc.sub(x, y);
		assertEquals(expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)	
	public void testDiv() {
		int x = 10;
		int y = 0;		
		int actual = calc.div(x, y);
	}	
}
