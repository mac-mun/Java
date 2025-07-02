import java.util.Timer;
import java.util.TimerTask;

public class TimerTImerTask {
    public static void main(String[] args) {
        /*
         * Timer = Class that schedules tasks at specific times or periodically
         *         Useful for: Sending notifications, Scheduled Updates, Repetitive Actions
         *
         * TimeTask = Represents the task that will be executed by the Timer
         *            You will extend the TimeTask class to define your task
         *             Create a subclass of TimerTask and @Override run()
         * */

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("This is awesome!");
                count--;
                if (count <= 0) {
                    System.out.println("Task Complete!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);

    }
}
