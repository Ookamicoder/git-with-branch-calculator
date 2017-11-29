package com.example.maven.git_with_branch_calculator;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();
	static final Logger LOG = Logger.getLogger(Calculator.class.getName());

	@Test
	public void testAdd() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
		firstNumber = random.nextInt(100);
		secondNumber = random.nextInt(100);
		result = firstNumber + secondNumber;
		LOG.info("Testing the method add with: "+firstNumber+" and "+secondNumber);
		assertEquals(calc.add(firstNumber,secondNumber),result);
		}
	}
	
	@Test
	public void testSubtract() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
		firstNumber = random.nextInt(100);
		secondNumber = random.nextInt(100);
		result = firstNumber - secondNumber;
		LOG.info("Testing the method subtract with: "+firstNumber+" and "+secondNumber);
		assertEquals(calc.subtract(firstNumber,secondNumber),result);
		}
	}
	
	@Test
	public void testMultiply() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
		firstNumber = random.nextInt(100);
		secondNumber = random.nextInt(100);
		result = firstNumber * secondNumber;
		LOG.info("Testing the method multiply with: "+firstNumber+" and "+secondNumber);
		assertEquals(calc.multiply(firstNumber,secondNumber),result);
		}
	}
	
	@Test
	public void testDivide() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
		firstNumber = random.nextInt(100);
		secondNumber = random.nextInt(100);
		result = firstNumber / secondNumber;
		LOG.info("Testing the method divide with: "+firstNumber+" and "+secondNumber);
		assertEquals(calc.divide(firstNumber,secondNumber),result);
		}
	}
	


}
