import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    // GuessNumber — отвечает за игровой процесс
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        currentPlayer = playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загаданное положительное целое число от 1 до 100");
        int hiddenNum = new Random().nextInt(99) + 1;
        do {
            int playerNum = scanner.nextInt();
            currentPlayer.setNumber(playerNum);
            if (hiddenNum > currentPlayer.getNumber()) {
                System.out.printf("число %d меньше того, что загадал компьютер. Попытка %s\n",
                        currentPlayer.getNumber(), currentPlayer.getName());
                currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            } else if (hiddenNum < currentPlayer.getNumber()) {
                System.out.printf("число %d больше того, что загадал компьютер. Попытка %s\n",
                        currentPlayer.getNumber(), currentPlayer.getName());
                currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            }
        } while (currentPlayer.getNumber() != hiddenNum);
        System.out.println("Победил " + currentPlayer.getName());
    }
}
