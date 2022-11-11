package com.startjava.lesson_1.final;

class Calculator {
	
	public static void main(String[] args) {
		//  +, -, *, /, ^, %
		int a = 5;
		int b = 2;
		int result = 0;
		double resultDouble;
		char operation = '/';

		if (operation == '+') {
			result = a + b;
		} else if (operation == '-') {
			result = a - b;
		} else if (operation == '*') {
			result = a * b;
		} else if (operation == '/') {
			resultDouble = (double) a / (double) b;
		} else if (operation == '^') {
			result = 1;
			for (int i = 1; i <= b; i++) {
				result *= a;	
			}
		} else if (operation == '%') {
			result = a % b;
		}

		if (operation == '/') {
			System.out.println(a + " " + operation + " " + b + " = " + resultDouble);
		} else {
			System.out.println(a + " " + operation + " " + b + " = " + result);
		}
		
	}
}