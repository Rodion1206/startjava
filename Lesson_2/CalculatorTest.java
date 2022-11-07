import java.util.Scanner;

class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer = "yes";
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            if (userAnswer.equals("yes")) {
                System.out.print("Введите первое число: ");
                double num1 = scanner.nextInt();
                System.out.print("Введите знак математической операции: ");
                char operator = scanner.next().charAt(0);
                System.out.print("Введите второе число: ");
                double num2 = scanner.nextInt();
                calculator.calculate(operator, num1, num2);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            userAnswer = scanner.nextLine();

        } while (!userAnswer.equals("no"));
    }
}