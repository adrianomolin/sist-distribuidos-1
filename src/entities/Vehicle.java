package entities;

public class Vehicle {
    private int kilograms;
    private int maxVelocity;
    private float price;

    public Vehicle(int kilograms, int maxVelocity, float price) {
        this.kilograms = kilograms;
        this.maxVelocity = maxVelocity;
        this.price = price;
    }

    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
