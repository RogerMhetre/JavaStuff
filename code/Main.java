import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Integer> v = new Vector<Integer>();

        v.add(10);
        v.add(25);
        v.add(35);
        v.add(50);
        v.add(75);

        System.out.print("Enter a number to search: ");
        int n = scanner.nextInt();

        for(int i = 0; i < v.size(); i++){
            if(v.get(i).equals(n)){
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if(!v.contains(n)){
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
