import java.util.Scanner;

public class logicalOps {
    public static void main(String[] args) {

        // && = AND , both conditions must be true
        // || = OR , either condition must be true
        // ! = NOT , the condition must be false

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter ur username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username cannot contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
