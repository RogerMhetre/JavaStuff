public class methodsBlock {
    public static void main(String[] args) {
        String name = "Juice wrld";
        int age = 26;

        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);
    }
    static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday juice wrld");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy birthday dear juice wrld");
        System.out.println();
    }

}
