package me.tokaya.exercisetwo;

/*
 * DICE BETTING GAME (Java Exercise)
 * ---------------------------------
 * Create a simple dice betting game where the player starts with a certain
 * amount of coins and can bet them each round.
 *
 * Concepts you will practice:
 * - User input with Scanner
 * - Random number generation (Random)
 * - Loops
 * - Conditionals (if / else)
 * - Variables that change during the game
 *
 * Steps:
 * - The player starts the game with 50 coins
 *
 * - Each round:
 *   - Display the amount of coins the player currently has
 *   - Ask the player how many coins they want to bet
 *
 * - Validate the bet:
 *   - The bet cannot be negative
 *   - The bet cannot be greater than the coins the player currently has
 *
 * - After the bet is placed, roll a 6-sided die (1–6)
 * - If the dice result is:
 *   - 4, 5, or 6 → the player wins the bet and gains that amount of coins
 *   - 1, 2, or 3 → the player loses the bet and loses that amount of coins
 *
 * - Show the dice result and whether the player won or lost the round
 * - The game continues in a loop while the player still has coins
 * - If the player reaches 0 coins, the game ends
 *
 * Considerations:
 * - Use a loop so the game keeps running until the player runs out of coins
 * - Be careful validating the bet amount
 * - Think about where variables should be declared
 * - Try separating parts of the game into methods if you want extra practice
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String playerName;
    static int coins = 50;
    static int bet;
    static int wins = 0;
    static int loses = 0;
    static Scanner scan = new Scanner(System.in);

    static void main() throws Exception {

        gameInitialization();

        while ( coins > 0 ) {

            placeBet();

            rollAndCheckDice();

            keepPlaying();

        }

    }

    static void gameInitialization() {
        System.out.println("Welcome to the dice betting game!\nInsert your name: ");
        playerName = scan.nextLine();
    }

    static void placeBet() {

        System.out.println(
                "Go on " + playerName + "! Choose how many coins to bet\n" +
                        "Currently you have " + coins + " coins"
        );

        while (true) {

            try {
                bet = Integer.parseInt(scan.nextLine());
            } catch ( Exception e ) {
                System.out.println("Please provide a number");
                continue;
            }

            if ( bet > coins || bet <= 0 ) {
                System.out.println(
                    "Please provide a valid bet, according to your current coins: " + coins
                );
            } else {
                return;
            }
        }

    }

    static void rollAndCheckDice() throws Exception {

        int wait = 0;

        System.out.print("Throwing die");

        while ( wait < 3 ) {
            wait += 1;
            System.out.print(" .");
            Thread.sleep(800);
        }


        int diceResult = new Random().nextInt(1,6);

        if ( diceResult >= 4 ) {
            coins += bet;
            wins += 1;
            System.out.println(
                "\nYou die was " + diceResult + " You won!! \n"+
                "You now have " + coins + " coins"
            );
        }

        if ( diceResult <= 3 ) {
            coins -= bet;
            loses += 1;
            System.out.println(
                "\nYou die was " + diceResult + " You lost : ( \n"+
                "You now have " + coins + " coins"
            );
        }

    }

    static void keepPlaying() {

        if ( coins <= 0 ) {
            triggerGameEnd();
        }

        System.out.println("You want to keep playing? [yY/nN]");

        while (true) {

            String answer;

            try {
                answer = scan.nextLine().toLowerCase();
            } catch ( Exception e ) {
                System.out.println("Please provide [yY/nN] as an answer");
                continue;
            }

            if (answer.equals("y") || answer.isEmpty()) {
                return;
            }

            if (answer.equals("n")) {
                triggerGameEnd();
            }

            System.out.println("Please provide [yY/nN] as an answer");

        }
    }

    static void triggerGameEnd(){

        System.out.println(
            "You ended the game with " + coins + "coins\n" +
            "You won " + wins + " times and lost " + loses + " times"
        );

        if ( wins > loses && coins > 0 ) {
            System.out.println("You did amazing!!");
        } else {
            System.out.println("Better luck next time pal!");
        }

        System.exit(0);
    }
}
