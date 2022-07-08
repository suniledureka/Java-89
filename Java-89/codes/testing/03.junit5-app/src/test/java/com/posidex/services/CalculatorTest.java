package com.posidex.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	static Calculator calc;
	
	@BeforeAll
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
		assertEquals(expected, actual,"just for checking");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("$$$--- gets executed before each test case ---$$$");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("-----------------------------------------------------\n");
	}	
	
	@AfterAll
	public static void cleanUp() {
		calc = null;
		System.out.println("###--- cleanUp() gets executed after all test cases ---###");
	}
	
	//@Test
	//@Test(timeout = 2100)
	@Test()
	public void testSub() {
		int x = 10;
		int y = 20;
		int expected = -10;
		int actual = calc.sub(x, y);
		assertEquals(expected, actual);
	}
	
	@Test	
	public void testDiv() {
		int x = 10;
		int y = 0;		
		int actual = calc.div(x, y);
	}	
}
