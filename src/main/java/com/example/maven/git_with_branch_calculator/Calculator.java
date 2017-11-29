package com.example.maven.git_with_branch_calculator;

public class Calculator {
	public int add(int firstNumber,int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	//jag la till det här själv
	public int subtract(int firstNumber,int secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public int multiply(int firstNumber,int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public int divide(int firstNumber,int secondNumber) {
		int result = 0;
		try {
			result =  firstNumber / secondNumber;
		}catch(ArithmeticException e) {
			e.getMessage();
		}
		
		return result;
		
	}
	
	public int square(int number) {
		return number*number;
	}
	
	public int cube(int number) {
		return number*number*number;
	}

}
