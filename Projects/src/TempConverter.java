import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        if (unit.equals("C")) {
            newTemp = (temp - 32) * 5 / 9;
            System.out.printf("%.2f °C is %.2f in °F", temp, newTemp);
        } else if (unit.equals("F")) {
            newTemp = (temp * 5 / 9) + 32;
            System.out.printf("%.2f °F is %.2f in °C", temp, newTemp);
        } else {
            System.out.println("You have entered an invalid choice");
        }


        scanner.close();

    }
}
