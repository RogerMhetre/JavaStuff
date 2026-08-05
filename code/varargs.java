public class varargs {
    public static void main(String[] args) {

        //varargs = allow a method to accept a varying # of arguments
        //          makes methods more flexible, no need for overloaded methods
        //          java will pack the arguments into an array for you
        //          ... (ellipsis) is a special character that indicates that
        //              the arguments are to be packed into an array

        System.out.println(average(1,2,3,4,5,6,7,8,9,10));

    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum/numbers.length;
    }
}
