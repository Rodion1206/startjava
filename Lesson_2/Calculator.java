class Calculator {

    //  +, -, *, /, ^, %
    public void calculate(char operator, double a, double b) {
        double result = 0;
        switch (operator) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            case '^' :
                double result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                break;
            case '%' :
                result = a % b;
                break;
            default:
                System.out.println("Некорректный оператор");
        }
        System.out.println(result);
    }
}