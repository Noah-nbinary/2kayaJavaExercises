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
    public static void main(String[] args) {

        System.out.println("*** JUEGO DE NUMERO SECRETO ***\nIntroduce numeros hasta adivinar el numero secreto");

        //Creamos la constatne de numero secreto
        Random random = new Random();
        final int NUMERO_SECRETO = random.nextInt(1, 100);

        //creamos scanner y condicion de victoria
        Scanner consola = new Scanner(System.in);
        var ganador = false;

        do{
            int numeroUsuario = 0;
            System.out.print("Introduce un numero: ");
            try{
            numeroUsuario = Integer.parseInt(consola.nextLine());

            }catch(Exception e){ System.out.println("El valor no es correcto"); }

            if(NUMERO_SECRETO == numeroUsuario) {
                ganador = true;
            }else if(numeroUsuario < NUMERO_SECRETO){
                    System.out.println("El numero secreto es mayor que " + numeroUsuario + " vuelva a intentarlo");
                } else {
                    System.out.println("El numero secreto es menor que " + numeroUsuario + " vuelva a intentarlo");
                }
        }while(ganador == false);

        System.out.println("FELICIDADES! HAS GANADO! El número secreto era: " +NUMERO_SECRETO);
    }
}
