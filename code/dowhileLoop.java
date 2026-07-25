import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
            if ( number < 1 || number > 10) {
                System.out.println("Please enter a number between 1 and 10: ");
            }
        }while (number < 1 || number > 10);

        System.out.println("You entered: " + number);

        scanner.close();
    }
}
