import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Pounds to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.println("3. Quit");

        System.out.print("Tell the choice: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter the weight in pounds: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;

        scanner.close();
    }
}
