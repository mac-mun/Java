public class toStringMethod {
    public static void main(String[] args) {
//        """
//        .toString() = A Method inherited from the Object Class
//                      USed to return a string representation of an object.
//                      By default, it returns a hash code as unique identifier
//                      It can be overridden to provide meaningful details.
//        """

        Car car = new Car("Mercedes", "A200 AMG", 2019, "Grey");
        Car car2 = new Car("Toyota", "Crown", 2019, "Black");

        System.out.println(car2);

    }
}
