import entities.TourVehicle;
import entities.Truck;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(2000, 160, 20000, 1000, 20, 50);
        TourVehicle tourVehicle = new TourVehicle(1200, 260, 500000, "blue", "Maserati");
    }
}