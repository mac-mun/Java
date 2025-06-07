import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {

//        &&=AND
//        ||=OR
//        !=NOT

//        double temp = -10;
//        boolean isSunny = false;
//
//
//        if (temp <= 30 && temp >= 0 && isSunny) {
//            System.out.println("The Weather is GOOD!");
//            System.out.println("It is SUNNY outside");
//        } else if (temp <= 30 && temp >= 0 && !isSunny) {
//            System.out.println("The Weather is GOOD!");
//            System.out.println("It is CLOUDY outside");
//        } else if (temp > 30 || temp < 0) {
//            System.out.println("The weather id BAD");
//
//        }

        Scanner scanner = new Scanner(System.in);

//        username must be between 4-12 Characters
//        username must not contain underscores or spaces;

        String username;
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Try Again: Username must be between 4-12 Characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Try Again: Username must not contain underscores or spaces");
        } else {
            System.out.printf("Welcome to MACMUN CAPITAL MANAGEMENT: %s", username);
        }

    }

}
