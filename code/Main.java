import java.util.Vector;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.print("Enter element to search: ");
        int n = sc.nextInt();

        if (v.contains(n)) {
            System.out.println("Element found at index: " + v.indexOf(n));
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
