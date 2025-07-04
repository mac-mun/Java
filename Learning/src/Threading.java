import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
        /*
         * Threading = Allows a program to run on multiple tasks simultaneously
         *             Helps improve performance with time-consuming operations
         *             (File I/O, Network Communications, or any background tasks)
         * How to create a Thread
         * Option 1: Extend the Thread Class(Simpler)
         * Option 2: Implement the Runnable Interface(Better)
         * */

        Scanner scanner = new Scanner(System.in);
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 Seconds to enter your name!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}
