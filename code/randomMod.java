import java.util.Random;
public class randomMod {
    public static void main(String[] args) {

        Random rand = new Random();

        int num;
        boolean isHeads;

        num = rand.nextInt(100);
        isHeads = rand.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS!!!");
        } else {
            System.out.println("TAILS!!!");
        }

        System.out.println(num);

    }
}
