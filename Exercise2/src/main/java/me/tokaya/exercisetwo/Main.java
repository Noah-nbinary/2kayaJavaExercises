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
    public static void main(String[] args) {
        System.out.println("*** APUESTA CON DADOS ***");
        Scanner consola = new Scanner(System.in);
        Random random = new Random();
        int monedas = 50;

        do{
            System.out.print("Tienes " + monedas + " monedas. Introduce la cantidad a apostar: ");
            int apuesta = 0;
            try {
                apuesta = Integer.parseInt(consola.nextLine());
            }catch(Exception e){}
            if(monedas >= apuesta && apuesta > 0 ){
                var dado = random.nextInt(1,6);
                System.out.println("El dado muestra la cara con el número "+dado);
                if(dado > 3){
                    System.out.println("Felicidades has ganado " + apuesta + " monedas");
                    monedas += apuesta;
                }else{
                    System.out.println("Has perdido "+apuesta+" monedas");
                    monedas -= apuesta;
                }
            } else if(apuesta <= 0){
                System.out.println("Valor no válido escoja un valor entre 1 y " + monedas);
            } else {
                System.out.println("No puedes apostar cantidades superiores a tu cantidad de monedas");
            }

        }while (monedas > 0);

        System.out.println("Te has quedado sin monedas, GAME OVER");
    }
}
