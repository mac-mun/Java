import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {

////        while loop = repeat some code forever;
////                      while some condition remains true
//
        Scanner scanner = new Scanner(System.in);
//
//        String name = "";
//        while (name.isEmpty()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.print("Hello " + name);


//        WHILE LOOP-standard

//        CHECKING THE CONDITION AT BEGINNING
//        int number = 0;
//        while (number < 1 || number > 10) {
//            System.out.print("Enter a number between 1-10: ");
//            number = scanner.nextInt();
//        }
//        System.out.println("You picked " + number);

//        CHECKING THE CONDITION AT THE END
        int number1 = 0;
        do {
            System.out.print("Enter a number between 1-10: ");
            number1 = scanner.nextInt();
        } while ((number1 < 1 || number1 > 10));
        System.out.println("You picked " + number1);


        scanner.close();
    }
}
