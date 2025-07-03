import java.util.HashMap;

public class MapHash {
    public static void main(String[] args) {
        /*
         * HashMap = A data structure that stores key-value pairs
         *           Keys are unique,but Values can be duplicated
         *           Does not maintain any order, but is memory efficient
         *           HashMap <Key,Value>
         * */

        HashMap<String, Double> map = new HashMap<>();

        map.put("Pineapple", 6.33);
        map.put("Apple", 5.55);
        map.put("Orange", 4.55);
        map.put("Kiwi", 3.55);

        map.remove("Apple");

        System.out.println(map);
        System.out.println(map.get("Orange"));

        if (map.containsKey("Kiwi")) {
            System.out.println(map.get("Kiwi"));

        } else {
            System.out.println("Key Not Found!");
        }

        System.out.println(map.containsValue(3.55));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.println(key + " : £" + map.get(key));

        }

    }
}
