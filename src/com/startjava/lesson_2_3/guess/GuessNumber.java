package com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

// GuessNumber — отвечает за игровой процесс
public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загаданное положительное целое число от 1 до 100");
        int hiddenNum = new Random().nextInt(100) + 1;
        Player currentPlayer = playerTwo;
        do {
            currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            int playerNum = scanner.nextInt();
            currentPlayer.setNumber(playerNum);
            if (hiddenNum > currentPlayer.getNumber()) {
                System.out.printf("число %d меньше того, что загадал компьютер.\n",
                        currentPlayer.getNumber());
            } else if (hiddenNum < currentPlayer.getNumber()) {
                System.out.printf("число %d больше того, что загадал компьютер.\n",
                        currentPlayer.getNumber());
            }
        } while (currentPlayer.getNumber() != hiddenNum);
        System.out.println("Победил " + currentPlayer.getName());
    }
}