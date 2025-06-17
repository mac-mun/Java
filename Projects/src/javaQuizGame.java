import java.util.Scanner;

public class javaQuizGame {
    public static void main(String[] args) {
//        JAVA QUIZ GAME

//        QUESTIONS array[]
        String[] questions = {"WHat is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "WHo si known as the fathers of computers?",
                "What was the first programming language?"};

//        Options array [][]

        String[][] options = {{"1. Storing files", "2. Encrypting Data", "3. Routing Internet Traffic", "4. Managing Passwords"},
                {"1. CPU ", "2. Hard-Drive ", "3. RAM", "4. GPU "},
                {"1. 2000 ", "2. 2004 ", "3. 2006", "4. 2008 "},
                {"1. Steve Jobs ", "2. Bill Gates ", "3. Alan Turing", "4. Charles Babbage "},
                {"1. COBOL ", "2. C ", "3. Fortran", "4. Assembly"}};

//        Declare Variables

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

//        Welcome Message
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("******************************");

//        Question (loop)

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

//              Option
            for (String option : options[i]) {
                System.out.println(option);
            }

//              Get Guess from User
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

//              Check our Guess
            if (guess == answers[i]) {
                System.out.println("*******");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("*******");
                System.out.println("WRONG!");
                System.out.println("********");
            }
//
        }
        ;
        System.out.println("Your Final Score is: " + score);

        scanner.close();

    }
}
