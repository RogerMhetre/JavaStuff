import java.util.Random;
import java.util.Scanner;

public class numGuessingGame {
	public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int secretNumber = rand.nextInt(1, 101);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        System.out.println();


        do{
            System.out.print("Guess: ");
            guess  = scanner.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("CORRECT!!! The number was " + secretNumber);
                System.out.println("You guessed " + attempts + " times.");
            }

        } while (guess != secretNumber);


        scanner.close();
	}
}
