import java.util.Scanner;

class CalculatorTest {
    static int num1;
    static int num2;
    static char operator;
    static boolean doCalculate = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (doCalculate) {
            inputValues(scanner);
            double result = calculator.calculate(operator, num1, num2);
            System.out.println("Результат вычислений = " + result);
            String answer = doContinue(scanner);
            while (answer != "yes" || answer != "no") {
                answer = doContinue(scanner);
                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    doCalculate = false;
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    public static void inputValues(Scanner scanner) {
        System.out.print("Введите первое число: ");
        num1 = scanner.nextInt();
        System.out.print("Введите знак математической операции: ");
        operator = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        num2 = scanner.nextInt();
    }

    public static String doContinue(Scanner scanner) {
        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        String answer = scanner.nextLine();
        return answer;
    }
}