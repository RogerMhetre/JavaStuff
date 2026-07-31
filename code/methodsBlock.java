public class methodsBlock {
    public static void main(String[] args) {

        System.out.println(square(5));
        System.out.println(cube(5));
        String fullName = getFullName("Juice", "Wrld");
        System.out.println(fullName);

        int age = 17;

        if (ageCheck(age)){
            System.out.println("You may sign up ");
        } else {
            System.out.println("You are too young to sign up");
        }

    }

    static double square(double number){return number * number;}

    static double cube(double number) {return number * number * number;}

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        } else {
            return false;
        }
    }
}
