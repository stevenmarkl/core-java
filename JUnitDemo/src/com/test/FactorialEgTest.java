package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day13.FactorialEg;

public class FactorialEgTest {

	@Test
	public void testGetFactorial() {
		FactorialEg fact = new FactorialEg();
		int actual = fact.getFactorial(5);
		int expected = 120;
		assertEquals(expected, actual);
	}

}
