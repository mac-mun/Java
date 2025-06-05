import java.util.Scanner;

public class ternaryOperator {

    public static void main(String[] args) {
//        ternary operator ? = Return 1 of 2 values if a condition is true

//          variable = (condition) ? ifTrue : ifFalse

        int score;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        score = scanner.nextInt();

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

//        Checking if the number is an odd number

        int number;
        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "EVEN NUMBER" : "ODD NUMBER";

        System.out.println(evenOrOdd);
    }

}
