class Calculator {

    //  +, -, *, /, ^, %
    public double calculate(char operator, int a, int b) {
        double result = 0;
        switch (operator) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                return (double) a / (double) b;
            case '^' :
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                return result;
            case '%' :
                return a % b;
            default:
                System.out.println("Некорректный оператор");
                return 0;
        }
    }
}