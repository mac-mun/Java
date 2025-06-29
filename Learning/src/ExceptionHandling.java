import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

//        Exception = An event that interrupts the normal flow of a program
//                    (Dividing by zero, file not found, mismatch input type)
//                    Surround any dangerous code with a try{} block
//                    try{}, catch{}, finally{}
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("You Can't Divide by Zero!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input: Enter a Number (1,2,3)");
        } catch (Exception e) {
//            Safety Net
            System.out.println("Something Went Wrong");
        } finally {
            System.out.println("This always executes");
        }


    }
}
