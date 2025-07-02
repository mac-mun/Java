import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
//        HOw to Work with Dates and Times using Java
//        (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

              /*
                LocalDate date = LocalDate.now();
                LocalTime time = LocalTime.now();
                LocalDateTime dateTime = LocalDateTime.now();
                Instant instant = Instant.now();
                
                System.out.println(date);
                System.out.println(time);
                System.out.println(dateTime);
                System.out.println(instant);
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String newDateTime = dateTime.format(formatter);
                System.out.println(newDateTime);
              */

//        Custom DateTime Object
        LocalDate date = LocalDate.of(2024, 9, 20);
        LocalDate date2 = LocalDate.of(2024, 9, 20);
        LocalDateTime dateTime = LocalDateTime.of(2024, 8, 7, 12, 0, 21);

        System.out.println(dateTime);
        System.out.println(date);

        if (date.isBefore(date2)) {
            System.out.print(date + " is earlier than " + date2);

        } else if (date.isAfter(date2)) {
            System.out.print(date + " is later than " + date2);

        } else if (date.isEqual(date2)) {
            System.out.print(date + " is equal to " + date2);

        }


    }
}
