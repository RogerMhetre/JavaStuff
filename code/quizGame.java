import java.util.Scanner;

public class quizGame {
    public static void main(String[] args){

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computer?",
                              "What was teh firsrt computer language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Memory", "3. Hard drive", "4. Network"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2009"},
                              {"1. Charles Babbage", "2. Steve Jobs", "3. Linus Torvalds", "4. Alan Turing"},
                              {"1. C", "2. COBOL", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 1, 3};
        int score = 0;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("==============================");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.println();
            System.out.println();
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if(guess == answers[i]){
                System.out.println("CORRECT!!!!");
                score++;
            }
            else{
                System.out.println("WRONG!!!");
            }


        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
