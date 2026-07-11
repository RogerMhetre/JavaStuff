import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total = 0;

        System.out.print("What item would you like to buy?: ");
        item = scanner.next();

        System.out.print("How much is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nItem: " + item);
        System.out.println("Price: " + currency + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("\nTotal: " + currency + total);

        scanner.close();
    }
}
