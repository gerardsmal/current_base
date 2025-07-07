package com.betacom.process;

public class ProcessFact {

	public boolean execute() {
		System.out.println("Begin ProcessFact");
		
		int number = 5, result = 0;
		
		result = factorial(number);
		System.out.println("Fattorial di " + number + " = " + result);
		
		return true;
	}
	
	public int factorial (int n) {
		if (n != 0)
			return n = n * factorial(n - 1);
		else
			return 1;
	}
}
