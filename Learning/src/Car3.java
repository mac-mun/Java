public class Car3 {
    private String model;
    private String colour;
    private int price;

    // Constructor
    public Car3(String model, String colour, int price) {
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    // Getter methods
    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public int getPrice() {
        return this.price;
    }

    // Method to get formatted price
    public String getFormattedPrice() {
        return "£" + this.price;
    }

    // Setter methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Optional: toString method for easy printing
    @Override
    public String toString() {
        return "Car{model='" + model + "', colour='" + colour + "', price=£" + price + "}";
    }
}