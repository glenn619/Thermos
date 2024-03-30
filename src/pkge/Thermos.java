package pkge;

public class Thermos {
    private double availableVolume; // Available volume in litres
    private String brand;
    private String liquid;

    // Constructor to initialize the thermos
    public Thermos(String brand, String liquid) {
        this.availableVolume = 1.0; // Capacity of 1 litre
        this.brand = brand;
        this.liquid = liquid;
    }

    // Method to add liquid into thermos
    public void addLiquid(double volume) {
        if (availableVolume >= volume) {
            availableVolume -= volume;
            System.out.println("Added " + volume + " litres of " + liquid + " into the thermos.");
        } else {
            System.out.println("Thermos doesn't have enough space to add this much liquid.");
        }
    }

    // Method to display thermos details
    public void displayDetails() {
        System.out.println("Thermos Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Available Volume: " + availableVolume + " litres");
        System.out.println("Liquid: " + liquid);
    }

    // Main method for testing
    public static void main(String[] args) {
        Thermos myThermos = new Thermos("Godrej", "orange juice");
        myThermos.displayDetails(); // Display initial details
        myThermos.addLiquid(0.5);   // Add 0.5 litres of liquid
        myThermos.displayDetails(); // Display updated details
    }
}




