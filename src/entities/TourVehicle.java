package entities;

public class TourVehicle extends Vehicle {
    private String color;
    private String model;

    public TourVehicle(int kilograms, int maxVelocity, float price, String color, String model) {
        super(kilograms, maxVelocity, price);
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
