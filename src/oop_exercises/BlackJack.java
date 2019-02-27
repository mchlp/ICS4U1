package oop_exercises;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        int numSides = 6;

        System.out.println("Welcome to BlackJack 21!");
        System.out.format("The Game is being played with %d-sided dice.\n", numSides);

        Scanner in = new Scanner(System.in);
        Die die = new Die();
        die.setNumSides(6);

        int playerTotal = 0;
        int rollNum = 0;
        boolean continuePlaying = true;
        while (continuePlaying) {
            rollNum++;
            int roll1 = die.roll();
            int roll2 = die.roll();
            System.out.format("Roll number %d: %d and %d = %d\n", rollNum, roll1, roll2, roll1+roll2);
            playerTotal += roll1 + roll2;
            System.out.format("TOTAL = %d\n", playerTotal);

            if (playerTotal > 21) {
                break;
            }
            System.out.print("Do you want roll again? ");

            while (true) {
                String line = in.nextLine();
                if (line.contains("Y") || line.contains("y")) {
                    break;
                } else if (line.contains("N") || line.contains("n")) {
                    continuePlaying = false;
                    break;
                } else {
                    System.out.print("Do you want roll again? ");
                }
            }
        }

        if (playerTotal <= 21) {
            int computerTotal = 0;
            for (int i = 0; i < rollNum; i++) {
                int roll1 = die.roll();
                int roll2 = die.roll();
                System.out.format("The computer rolls %d: %d and %d = %d\n", rollNum, roll1, roll2, roll1 + roll2);
                computerTotal += roll1 + roll2;
            }

            System.out.format("Computer TOTAL = %d\n", computerTotal);

            if (computerTotal > playerTotal && computerTotal <= 21) {
                System.out.println("The computer wins! Better luck next time.");
            } else if (computerTotal < playerTotal || computerTotal > 21) {
                System.out.println("The computer loses! You win!");
            } else {
                System.out.println("You tie!");
            }
        } else {
            System.out.println("You exceeded 21 points. You lose!");
        }

    }

}
