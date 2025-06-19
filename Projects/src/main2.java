public class main2 {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

    }
}
