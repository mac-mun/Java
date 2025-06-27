import java.util.Scanner;

public class RuntimePoly {
    public static void main(String[] args) {

//        Runtime Polymorphism = When the method that executed is decided
//                                at runtime based on the actual type of
//                                the object

        Scanner scanner = new Scanner(System.in);

        Animal2 animal2;

        System.out.print("Would you like a Dog or a Cat? (1 = Dog, 2 = Cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal2 = new Dog2();
            animal2.speak();

        } else if (choice == 2) {
            animal2 = new Cat2();
            animal2.speak();

        } else {
            System.out.println("Invalid Choice! Try Again");
        }


    }
}
