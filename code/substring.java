import java.util.Scanner;
public class substring {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        System.out.print("Enter your email address: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }
        else {
            System.out.println("email must contain '@'");
        }


        scanner.close();
        scanner.close();
    }
}
