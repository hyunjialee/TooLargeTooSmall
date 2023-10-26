import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    /*Guessing name needed with math generator
     * if/else loop statement for "too long", "too large", and "correct guess"
     * On termination "Number of guesses correct: "
     * A single input should register a single guess
     * INPUT TO EXIT OUT IF iTS 0
     * KEEP TRYING UNTIL CORRECTLY GUESSED
     * numbers out of bounds WARNING -practice-
     * you've already tried this number -practice- */

    public static void main(String[] args) {
        // did not use the Random class below
        /**    Scanner scanner1 = new Scanner(System.in);
         System.out.println("Guess the number between 1-10: ");

         int number = 1 + (int)(10 * Math.random());

         for (int i = 1; i < 11; i++) {
         System.out.print("Guess the number: ");
         int guess = scanner1.nextInt();

         if (number == guess) {
         System.out.println("Correct Number!");
         System.out.println("Numbers of Tries: " + i);
         break;
         } else if (number > guess) {
         System.out.println("The number is greater than guess");
         } else {
         System.out.println("The number is less than guess");
         }
         System.out.println("Number of Guesses: " + i);
         }

         System.out.println("Number:" + number);

         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Guess number between 1-10: ");

        Random ran1 = new Random();
        int number = ran1.nextInt(10) + 1;
        int guess = scanner1.nextInt();

        int counter = 1;

        while (guess != number) {
            if (guess < number) {
                System.out.println("Number is too small");
            } else {
                System.out.println("Number is too large");
            }
            System.out.print("\nPlease guess again: ");
            guess = scanner1.nextInt();
            counter++;
        }
        System.out.println("You have guessed correctly. :)");
        System.out.println("Total number of guesses: " + counter);

        scanner1.close();
    }
}


