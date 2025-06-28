public class GettersSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE

        Car3 car3 = new Car3("Porsche", "Grey", 300000);

        car3.setColour("Blue");     // Fixed: using instance method, correct method name
        car3.setPrice(20000);       // Fixed: using instance method, correct method name

        System.out.println(car3.getColour());  // Fixed: correct method name
        System.out.println(car3.getModel());   // Fixed: correct method name
        System.out.println(car3.getPrice());   // Fixed: correct method name
    }
}
