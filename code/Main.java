import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int age = 0;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        if(input.hasNextInt()){
            age = input.nextInt();
        }
        else{
            System.out.println("U didn't enter a number");
        }

        if(name.isEmpty()){
            System.out.println("U didn't enter ur name");
        }
        else{
            System.out.println("Hello " + name);
        }


        if(age >= 65){
            System.out.println("You are a senior");
        }
        else if(age >= 18){
            System.out.println("You are an adult");
        }
        else if(age < 0){
            System.out.println("woah u aint even born");
        }
        else if(age == 0){
            System.out.println("You are a baby");
        }
        else{
            System.out.println("You are a kid");
        }

        input.close();
    }
}

