public class overloadedConst{
    public static void main(String[] args){
        //User.java file's User class is being imported

        User user1 = new User("Juice wlrd");
        User user2 = new User("Drake", "Ovo6@gmail.com");
        User user3 = new User("Chaitanya", "chaitanya@gmail.com", 18);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println();

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
        System.out.println();
    }
}
