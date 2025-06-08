import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min;
        int max;

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME! ");

        System.out.print("Enter the minimum number(First No.): ");
        min = scanner.nextInt();

        System.out.print("Enter the maximum number(Last No.): ");
        max = scanner.nextInt();

        int randomNumber = random.nextInt(min, max + 1);


        do {
            System.out.printf("Enter a number between %d and %d : ", min, max);
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too Low!: Try Again");
            } else if (guess > randomNumber) {
                System.out.println("Too High!: Try Again");
            } else {
                System.out.println("You have Won. The Number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        } while (guess != randomNumber);

//        System.out.println("You have Won");
        scanner.close();


    }
}
