import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        /*
         * Enums(Enumerations) = A special kind og class that
         *                       represents a fixed set of constants.
         *                       They improve code readability and are easy to maintain
         *                       More efficient with switches when comparing Strings
         * */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Day of the Week: ");
        String response = scanner.nextLine().toUpperCase();


        try {
            Day day = Day.valueOf(response);

//        System.out.println(day);
//        System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a Weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the Weekend!");

            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Entry! Please Try Again!");
        }


        scanner.close();

    }
}
