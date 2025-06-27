public class Poly {
    public static void main(String[] args) {

//        Polymorphism = "POLY" = "MANY"
//                        "MORPH" = "SHAPE"
//                        Objects can identify as other objects.
//                        Objects can be treated as objects of a common superclass.

        Car2 car2 = new Car2();
        Boat boat = new Boat();
        Bike bike = new Bike();

//        bike.go();
//        boat.go();
//        car2.go();

        Vehicle[] vehicles = {car2, bike, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();

        }


    }
}
