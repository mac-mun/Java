import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};

//        fruits[0] = "Pineapple";

//       Finding the Length of an Array
//        System.out.println(fruits.length);

        for (int i = 0; i < fruits.length; i++) {

            System.out.println(fruits[i]);

        }

        //   Sorting through an Array!
        Arrays.sort(fruits);

        Arrays.fill(fruits, "Pineapple");


//        An Enhanced For Loop!
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


    }
}
