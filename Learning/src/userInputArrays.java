import java.util.Scanner;

public class userInputArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("Enter the # of foods you want to input: ");
        size = scanner.nextInt();

        foods = new String[size];

//        foods[0] = "Pizza";
//        foods[1] = "Taco";
//        foods[2] = "Hamburger";

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a Food: ");
            foods[i] = scanner.nextLine();

        }


//        Using an enhanced for loop
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();

    }

}
