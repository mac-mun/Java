public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        /* Multithreading =  Enables a program to run ,multiple threads concurrently
                             (Thread = A st Instructions that run independently)
                             Useful for background tasks or time-consuming operations
         */


        Thread thread = new Thread(new MyRunnable2("PING"));
        Thread thread1 = new Thread(new MyRunnable2("PONG"));

        System.out.println("GAME START!!");


        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("GAME OVER!!");

    }
}
