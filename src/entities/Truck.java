package entities;

public class Truck extends Vehicle {

    private float maxWeight;
    private float maxHeight;
    private float length;

    public Truck(int kilograms, int maxVelocity, float price, float maxWeight, float maxHeight, float length) {
        super(kilograms, maxVelocity, price);

        this.maxWeight = maxWeight;
        this.maxHeight = maxHeight;
        this.length = length;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public float getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(float maxHeight) {
        this.maxHeight = maxHeight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
