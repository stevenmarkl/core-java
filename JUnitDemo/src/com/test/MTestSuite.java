package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({
	CalculatorTest.class,
	CalculatorTest1.class,
	FactorialEgTest.class
})
public class MTestSuite {

}
