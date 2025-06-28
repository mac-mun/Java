public class Gari {

    String model;
    int year;
    Engine engine;

    Gari(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);

    }

    void start() {
        engine.start();
        System.out.println("The " + this.model + " is running");
    }

}
