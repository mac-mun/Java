import java.awt.*;
import java.sql.SQLOutput;
import java.time.LocalTime;

public class Clock implements Runnable {

    private final LocalTime alarmTime;

    Clock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;

    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
//                System.out.println(LocalTime.now());
            } catch (InterruptedException e) {
                System.out.println("Thread was Interrupted");
            }
        }

        System.out.println("\n***Alarm Noises***");
        Toolkit.getDefaultToolkit().beep();
    }
}
