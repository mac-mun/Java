public class ArrayofObjects {
    public static void main(String[] args) {

        Car[] cars = {new Car("Mercedes G63 AMG", "Black"), new Car("Range Rover Auto-Biography", "Navy-Blue"), new Car("Lexus LX700", "Grey")};
        for (Car car : cars) {
            car.drive();
        }
    }
}
