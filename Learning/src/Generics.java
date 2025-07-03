import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        /*
         * Generic = A concept where you can write a class, interface or method
         *           that is compatible with different data types.
         *           <T> type parameter(placeholder that gets replaced with a real type)
         *           <String> type argument (specifies the type)
         * */

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Melon");

        System.out.println(fruits);

        Box<String> box = new Box<>();

        box.setItem("Terminal");
        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("Dunks", 9.99);
        Product<String, Integer> product2 = new Product<>("Slippers", 15);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
