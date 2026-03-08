package me.tokaya.exerciseone;

/*
 * NUMBER GUESSING GAME (Java Exercise)
 * ------------------------------------
 * Create a simple number guessing game.
 * The computer will generate a random number and the player must guess it.
 *
 * Concepts you will practice:
 * - User input with Scanner
 * - Random number generation (Random or Math.random)
 * - Loops
 * - Conditionals (if / else)
 * - Basic variables
 *
 * Steps:
 * - Generate a random number between 1 and 100
 * - Ask the player to guess the number
 *
 * - If the guessed number is:
 *   - Lower than the secret number → tell the player "Too low"
 *   - Higher than the secret number → tell the player "Too high"
 *   - Equal to the secret number → the player wins
 *
 * - After each incorrect guess, the player should be able to try again
 * - Count how many attempts the player makes
 *
 * - When the player guesses the number correctly:
 *   - Display a winning message
 *   - Show the number of attempts it took
 *
 * Considerations:
 * - Use a loop so the game continues until the correct number is guessed
 * - Think about where variables should be declared
 * - Make sure the program does not crash if the user inputs something unexpected
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static void main(String[] args) {

        final int victoryNumber = new Random().nextInt(0,101);
        int attempts = 0;

        gameInitialization();

        while ( true ) {

            int number;

            try {
                number = Integer.parseInt(scan.nextLine());
                attempts += 1;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Provide one within range 1-100");
                continue;
            }

            if (checkNumber(number, victoryNumber)){
                System.out.println(
                    "You won!! The winning number was " + victoryNumber +
                    "\nIt took you " + attempts + " attempts"
                );
                break;
            }

        }

    }

    public static void gameInitialization() {

        System.out.println("Welcome to the number guessing game!\n Please enter your name: ");
        final String name = scan.nextLine();

        System.out.println(
                "Welcome " + name +
                "!\nPlease enter a number between 1 and 100 to start playing"
        );
    }

    public static boolean checkNumber(int playerNumber, int gameNumber) {

        if ( playerNumber < 1 || playerNumber > 100) {
            System.out.println("The provided number wasn't between 1 and 100");
            return false;
        }

        if ( playerNumber < gameNumber ) {
            System.out.println("Your selected number is too low! Please try again");
            return false;
        }

        if ( playerNumber > gameNumber ) {
            System.out.println("Your selected number is too high! Please try again");
            return false;
        }

        return true;

    }

}
