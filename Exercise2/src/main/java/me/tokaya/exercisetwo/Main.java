package me.tokaya.exercisetwo;

import java.util.Scanner;

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
 * - After the bet is placed, roll a 6-sided dice (1–6)
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

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int monedas = 50;

        System.out.println("¡Bienvenido a Farkle II! \nEsperemos que tu dado sea de la suerte");

        do {
            int apuesta = 0;
            boolean apuestaValida = false;

            // Validación de la apuesta (para que no sea un número negativo o que no sea una letra)
            while (!apuestaValida) {
                System.out.println("\nTienes " + monedas + " monedas");
                System.out.print("¿Cuántas monedas deseas apostar? ");

                if (scan.hasNextInt()) {
                    apuesta = scan.nextInt();
                    if (apuesta > 0 && apuesta <= monedas) {
                        apuestaValida = true;
                    } else {
                        System.out.println("Esa cantidad no se puede. Inserta una apuesta entre 1 y " + monedas);
                    }
                } else {
                    System.out.println("Solo se permiten números. Intenta de nuevo:");
                    scan.next();
                }
            }

            // Tirar el dado
            int dado = (int) (Math.random() * 6) + 1;
            System.out.println("El dado salió: " + dado);

            // Resultado de la tirada
            if (dado == 4 || dado == 5 || dado == 6) {
                System.out.println("¡HAS GANADO! La apuesta de " + apuesta + " se suma a tus monedas");
                monedas += apuesta * 2;
            } else {
                System.out.println("¡Qué lástima! Has perdido tu apuesta.");
                monedas -= apuesta;
            }

        } while (monedas > 0);

        System.out.println("\n¡Te has quedado pobre! Fin del juego");
    }
}
