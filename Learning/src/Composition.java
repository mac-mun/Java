public class Composition {
    public static void main(String[] args) {


//        Composition = Represents a 'part-of' relationship between objects.
//                      For example, an engine is 'part-of' a car.
//                      Allows complex objects to be constructed from smaller objects.

        Gari gari = new Gari("Mercedes", 2024, "V8");

//        System.out.println(gari.model);
//        System.out.println(gari.year);
//        System.out.println(gari.engine.type);

        gari.start();


    }
}
