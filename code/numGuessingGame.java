public class numGuessingGame {
	public static void main(String[] args) {
		int secretNumber = 0;
		int guess = 0;
		boolean guessed = false;

		System.out.println("Welcome to the number guessing game!");
		System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("Can you guess what it is?");

		while (guessed == false) {
			System.out.print("Guess: ");
			guess = input.nextInt();

			if (guess == secretNumber) {
				System.out.println("You guessed right!");
				guessed = true;
			} else if (guess < secretNumber) {
				System.out.println("Your guess is too low.");
			} else if (guess > secretNumber) {
				System.out.println("Your guess is too high.");
			}
		}
		if (guess == secretNumber) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose.");
		}
	}
}
