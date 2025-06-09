import java.util.Scanner;

public class methodsJava {

    public static void main(String[] args) {

//        method = a block of reusable code that is executed when called()
        Scanner scanner = new Scanner(System.in);

//        int age;
//        String name;
//
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        System.out.println();
//
//        happyBirthday(name, age);

//        System.out.println(square(3));
//
//        System.out.println(cube(6));
//
//        System.out.println(name("Macharia", "Munene"));

        int age = 12;

        if (ageCheck(age)) {

            System.out.println("You may sign up");
        } else {
            System.out.println("YOu must be 18+ to sign up");
        }
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you! ");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number) {
        return Math.pow(number, 2);
    }

    static double cube(double number) {
        return Math.pow(number, 3);
    }

    static String name(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    static boolean ageCheck(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }
}
