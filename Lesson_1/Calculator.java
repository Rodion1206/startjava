class Calculator{
	
	public static void main(String[] args){
		//  +, -, *, /, ^, %
		int a = 5;
		int b = 2;
		int result = 0;
		double y, z, resultDouble;
		char operation = '/';

		if (operation == '+') {
			result = a + b;
			System.out.println(a + " " + operation + " " + b + " = " + result);
		} else if (operation == '-') {
			result = a - b;
			System.out.println(a + " " + operation + " " + b + " = " + result);
		} else if (operation == '*') {
			result = a * b;
			System.out.println(a + " " + operation + " " + b + " = " + result);
		} else if (operation == '/') {
			y = (double) a;
			z = (double) b;
			resultDouble = y / z;
			System.out.println(a + " " + operation + " " + b + " = " + resultDouble);
		} else if (operation == '^') {
			result++;
			for (int i = 1; i <= b; i++) {
				result = result * a;	
			} 
			System.out.println(a + " " + operation + " " + b + " = " + result);
		} else if (operation == '%') {
			result = a % b;
			System.out.println(a + " " + operation + " " + b + " = " + result);
		}
		
	}
}