public class Car {
    String make;
    String model;
    String colour;
    int year;

    Car(String make, String model, int year, String colour) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    void drive() {
        System.out.println("You are driving the " + this.colour + " " + this.model);
    }

    @Override
    public String toString() {
        return this.colour + " " + this.year + " " + this.make + " " + this.model;
    }
}
