package me.tokaya.exerciseone;

import java.util.Scanner;

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

public class Main {
    public static void main (String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	//Math.random 0.99 al infinito
    	//(int) 0 al infinito
    	//* 100, 0 al 100
    	// + 1, 1 al 100
    	
    	final int randomNum = (int)(Math.random() * 100) + 1;
    	int num;
    	int contador = 0;
    	
    	System.out.println("Adivinar el número \nDime un número entre 1 y 100:");

        do {
            // Que sea un número
        	
            while (!scan.hasNextInt()) {
                System.out.println("Solo se permiten números. Intenta de nuevo:");
                scan.next(); // Limpia la entrada incorrecta
            }

            num = scan.nextInt();

            // Que sea entre 1 y 100
            if (num < 1 || num > 100) {
                System.out.println("Número fuera del rango 1-100. Intenta de nuevo:");
                continue; // Vuelve al inicio del bucle
            }

            contador++; // Solo intentos válidos (no negativos ni letras)

            if (num < randomNum) {
                System.out.println("El número ingresado es más bajo que el que hay que adivinar");
            } else if (num > randomNum) {
                System.out.println("El número ingresado es más alto que el que hay que adivinar");
            }

        } while (num != randomNum);

        System.out.println("¡HAS GANADO! \nMILLÓN DE EUROS A TU CUENTA \nLo has intentado " + contador + " veces");
    }
}