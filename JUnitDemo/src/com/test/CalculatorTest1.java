package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.day13.Calculator;

@RunWith(Parameterized.class)
public class CalculatorTest1 {
	static Calculator calc;
	private int input1;
	private int input2;
	private int expected1;
	private int expected2;

	public CalculatorTest1(int input1, int input2, int expected1, int expected2) {
		super();
		this.input1 = input1;
		this.input2 = input1;
		this.expected1 = expected1;
		this.expected2 = expected2;
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		calc = new Calculator();

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		calc = null;
	}

	@Test
	public void testAddition() {
		int actual = calc.addition(input1, input2);
		assertEquals(expected1, actual);
	}

	@Test
	public void testSubtraction() {
		int actual = calc.subtraction(input1, input2);
		assertEquals(expected2, actual);

	}

	@Parameters
	public static Collection calculatorNumbers() {
		return Arrays.asList(new Object[][] { { 2, 3, 4, 5 }, { 5, 4, 3, 1 }, { 22, 8, 30, 6 }, { 23, 1, 37, 0 },
				{ 19, 89, 56, 12, } });

	}
}
