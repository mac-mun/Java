import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
//        WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        double choice;


        System.out.println("Weight Conversion Program (Choose 1 or 2 ) ");
        System.out.println("1: Convert lbs to kgs: ");
        System.out.println("2: Convert kgs to kgs: ");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();


        if (choice == 1) {
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("%.2f lbs is %.2f in kgs", weight, newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;
            System.out.printf("%.2f kgs is %.2f in lbs", weight, newWeight);
        } else {
            System.out.println("Invalid Choice: Try Again");
        }
        scanner.close();

    }
}
