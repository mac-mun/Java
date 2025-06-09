import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {

//        For Loop = execute some code a CERTAIN amount of times

//        for (int i = 1; i <= 10; i += 2) {
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how may times you want to Loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
