import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
//        ROCK PAPER SCISSORS GAME

//        DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
//        GET CHOICE FROM THE USER
            System.out.print("Enter your move(Rock, Paper, Scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice: Try Again");
                continue;
            }

//        GET RANDOM CHOICE FROM THE COMPUTER

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

//        CHECK WIN CONDITIONS

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It is a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }

//        ASK TO PLAY AGAIN
            System.out.print("Play Again(Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

//        GOODBYE MESSAGE

        System.out.println("Thanks for playing");
        scanner.close();
    }
}