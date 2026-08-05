public class TwoDimensionalArray{
    public static void main(String args[]){

        String[][] groceries = {{"apple", "orange", "banana", "grape"},
                                {"carrot", "potato", "tomato", "cucumber"},
                                {"chicken", "beef", "fish", "lamb"}};

        groceries[0][0] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food+ " ");
            }
            System.out.println();
        }

    }
}
