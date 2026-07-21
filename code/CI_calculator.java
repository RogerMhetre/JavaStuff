// Compound Interest Calculator

import java.util.Scanner;

public class CI_calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal, rate, amount;
        int timesCompounded, years;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest(%): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is %.2f\n", years, amount );

        scanner.close();

    }
}
