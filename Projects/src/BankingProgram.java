import java.sql.SQLOutput;
import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        DECLARE VARIABLES

        double balance = 0;
        boolean isRunning = true;
        int choice;


        while (isRunning) {
//            DISPLAY A MENU
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");

//        GET AND PROCESS USER'S CHOICE
            System.out.print("Enter your Choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice: Try Again!!");

            }

        }
        System.out.println("***************************");
        System.out.println("Thank you have a nice day!");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("*****************");
        System.out.printf("£%.2f\n", balance);

    }

    static double deposit() {

        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextInt();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }


    }

    static double withdraw(double balance) {

        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
}
