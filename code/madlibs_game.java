// mad libs game

import java.util.Scanner;

public class madlibs_game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.next();

        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.next();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.next();

        System.out.print("Enter a verb end with -ing: ");
        verb1 = scanner.next();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.next();

        System.out.println();

        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " !.");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}

