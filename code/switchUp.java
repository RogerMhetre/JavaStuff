import java.util.Scanner;
public class switchUp {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();
        day = day.isEmpty() ? day : day.substring(0, 1).toUpperCase() + day.substring(1);

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"  -> System.out.println("It's a Weekday");
            case "Saturday", "Sunday" -> System.out.println("It's The Weekend");
            default -> System.out.println(day + " is not a day i guess");
        }
        scanner.close();
    }
}
