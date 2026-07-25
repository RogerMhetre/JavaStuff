import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while (number < 1 || number > 10) {
            System.out.println("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
            if ( number < 1 || number > 10) {
                System.out.println("Please enter a number between 1 and 10: ");
            }
        }

        System.out.println("You entered: " + number);

        scanner.close();
    }
}
