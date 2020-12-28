package com.tdd.demo.util;

public class Calculator {

	public Calculator() {

	}

	public Integer add(int i, int j) {
		return i+j;
	}

	public boolean isNumber(String input) {
		
		boolean flag=false;
		try {
			Integer x=Integer.parseInt(input);
			flag=true;
		}catch(NumberFormatException e) {
			throw new NumberFormatException("Please provide valid number");
		}
		return flag;
	}

}
