import java.util.Scanner;

public class KlassMath {
    public static void main(String[] args) {

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//        double result2;
//        double result3;
//        double result4;
//        double result5;
//        double result6;
//        double result7;
//        double result8;
//
//        result = Math.pow(2, 3);
//        result2 = Math.abs(-8);
//        result3 = Math.sqrt(2025);
//        result4 = Math.round(3.14);
//        result5 = Math.ceil(3.14);
//        result6 = Math.floor(3.99);
//        result7 = Math.max(10, 20);
//        result8 = Math.min(10, 20);

//        Calculating the Hypotenuse of a Right-angled Triangle c =Math.sqrt(a^2 + b^2)

//        double a;
//        double b;
//        double c;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input a: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Input b: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//
//        System.out.println("The Hypotenuse is: " + c + 'cm');
//


//        Exercise 2
//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);
//        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);


        scanner.close();
    }
}
