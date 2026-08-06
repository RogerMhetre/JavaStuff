import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("-------------------------------");
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("-------------------------------");
        System.out.println();

        System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice");
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                playerChoice.equals("paper") && computerChoice.equals("rock") ||
                playerChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You win!");
        }


        scanner.close();
    }
}
