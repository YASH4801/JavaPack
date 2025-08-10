package org.practice.java.com.Vehicles;

public class Bajaj {
    public static void main(String[] args){
        Vehicles test = getVehicle("Car");
        test.show();
        test = getVehicle("Bike");
        test.show();
    }

    private static Vehicles getVehicle(String vehicle){
        return switch (vehicle){
            case "Car":
                yield new Car();
            case "Bike":
                yield new Bike();
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        };
    }
}
