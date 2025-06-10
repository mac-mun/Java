public class overloadedMethods {

    public static void main(String[] main) {
//        overloaded methods = methods can share the same name,
//                             but different parameters
//                             signature = name + parameters
//                             no two methods can share the same signature

        System.out.println(add(1, 2));

    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
