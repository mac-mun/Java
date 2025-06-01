import java.util.Scanner;

public class Statements {

    public static void main(String[] args) {

//        if statement =performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;


        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student?: (true/false)");
        isStudent = scanner.nextBoolean();

//        Group 1

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name! 😞");
        } else {
            System.out.println("Hello " + name + "! 😊");
        }
        // Group 2
        if (age >= 65) {
            System.out.println("You are Elderly");
        } else if (age < 0) {
            System.out.println("You haven't been born yet");
        } else if (age == 0) {
            System.out.println("You are a Baby");
        } else if (age >= 18) {
            System.out.println("You are a Adult");
        } else {
            System.out.println("You are a Child");
        }

//        GROUP 3
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You're not a student");
        }

        scanner.close();
    }
}
