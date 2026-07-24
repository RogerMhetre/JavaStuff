public class logicalOps {
    public static void main(String[] args) {

        // && = AND , both conditions must be true
        // || = OR , either condition must be true
        // ! = NOT , the condition must be false

        double temp = 35;
        boolean isSunny = false;

        if (temp <=30 && temp >=0 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is Sunny outside mannn");
        } else if (temp <=30 && temp >=0 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is cloudy outside mannn");
        } else if (temp >30 || temp < 0) {
            System.out.println("The weather is bad");
        }


    }
}
