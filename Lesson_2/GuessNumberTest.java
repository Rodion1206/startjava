import java.util.Scanner;

// GuessNumberTest — отвечает за создание объектов, их инициализацию,
// запуск игры, ввод и обработку ответа игрока о продолжении/завершении. Содержит метод main
public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        System.out.print("Введите имя первого игрока: ");
        String playerOneName = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String playerTwoName = scanner.nextLine();

        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        do {
            if (userAnswer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            userAnswer = scanner.nextLine();
        } while (!userAnswer.equals("no"));
    }
}