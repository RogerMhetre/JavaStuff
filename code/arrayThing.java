import java.util.Arrays;

public class arrayThing {
    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "banana", "grape"};

        // fruits[0] = "pineapple";
        // int numOfFruits = fruits.length;
        // Arrays.sort(fruits);
        Arrays.fill(fruits, "hb/hg");

        // Enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
