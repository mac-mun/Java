import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

//        ArrayList = A resizable array that stores objects(autoboxing).
//                    Arrays are fixed in size, but Arraylists can change.

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Mango");
//        fruits.add("Coconut");

//        fruits.remove(2);
//        fruits.set(1, "Mango");

//        System.out.println(fruits.get(2));
//        System.out.println(fruits.size());

//        Collections.sort(fruits);
//        System.out.println(fruits);
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//
//        }

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of foods to store: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }
        System.out.println(foods);

        scanner.close();
    }
}
