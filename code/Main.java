public class Main {
    public static void main(String[] args) {

        // printf() = is a method used to format the output
        //
        // %[flags][width[.precision][specifier-character]

        String name = "Juicewrld";
        char firstLetter = name.charAt(0);
        int age = 21;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s", name);
        System.out.printf("\nYour name starts with a %c" , firstLetter);
        System.out.printf("\nYou are %d years old", age);
        System.out.printf("\nYour are %.2f inches tall", height);
        System.out.printf("\nEmployed: %b", isEmployed);

        System.out.printf("\n%s is %d years old", name, age);

    }
}
