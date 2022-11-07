class Calculator {

    //  +, -, *, /, ^, %
    public void calculate(char operator, double a, double b) {
        switch (operator) {
            case '+' :
                System.out.println(a + b);
                break;
            case '-' :
                System.out.println(a - b);
                break;
            case '*' :
                System.out.println(a * b);
                break;
            case '/' :
                System.out.println(a / b);
                break;
            case '^' :
                double result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println(result);
                break;
            case '%' :
                System.out.println(a % b);
                break;
            default:
                System.out.println("Некорректный оператор");
        }
    }
}