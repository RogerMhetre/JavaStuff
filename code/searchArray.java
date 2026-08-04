import java.util.Scanner;
public class searchArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 7, 4, 6, 5};

        System.out.print("Enter the target number to search: ");
        int target = scanner.nextInt();
        boolean isfound = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Found at index " + i);
                isfound = true;
                break;
            }
        }

        if(!isfound){
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}
