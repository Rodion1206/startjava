import java.util.Random;
import java.util.Scanner;
// GuessNumber — отвечает за игровой процесс
public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private Player nextPlayer;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        currentPlayer = playerOne;
        nextPlayer = playerTwo;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загаданное положительное целое число от 1 до 100");
        int hiddenNum = new Random().nextInt(100) + 1;
        do {
            int playerNum = scanner.nextInt();
            currentPlayer.setNumber(playerNum);
            if (hiddenNum > currentPlayer.getNumber()) {
                System.out.printf("число %d меньше того, что загадал компьютер. Попытка %s\n",
                        currentPlayer.getNumber(), nextPlayer.getName());
            } else if (hiddenNum < currentPlayer.getNumber()) {
                System.out.printf("число %d больше того, что загадал компьютер. Попытка %s\n",
                        currentPlayer.getNumber(), nextPlayer.getName());
            }
            if (currentPlayer.getNumber() != hiddenNum) {
                currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
                nextPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            }
        } while (currentPlayer.getNumber() != hiddenNum);
        System.out.println("Победил " + currentPlayer.getName());
    }
}