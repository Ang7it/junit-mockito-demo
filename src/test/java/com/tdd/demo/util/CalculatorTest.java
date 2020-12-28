package com.tdd.demo.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calculator=null;
	
	@BeforeEach
	public void setUp() {
		calculator=new Calculator();
	}
	
	@Test
	@DisplayName("Test for add two numbers")
	public void testIfMethodAddsTwoNUmbers() {
		assertEquals(calculator.add(4,5), 9);
	}
	
	@Test
	@DisplayName("Check if number is integer")
	public void testIfNumberIsInteger() {
		
		assertTrue(calculator.isNumber("5"));
	}
	
}
