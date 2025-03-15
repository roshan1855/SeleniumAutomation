package TestJava2;

// Interface representing a generic vehicle
interface Vehicle {
    void start();  // Abstract method (must be implemented)

    // Default method (provides a common implementation)
    default void fuelType() {
        System.out.println("Most vehicles use petrol or diesel.");
    }
}

// Interface representing an Electric feature
interface Electric {
    void chargeBattery();  // Abstract method (must be implemented)

    // Static method (can be called using the interface name)
    static void ecoFriendly() {
        System.out.println("Electric vehicles are eco-friendly.");
    }
}

// Tesla class implementing both Vehicle and Electric interfaces
class Tesla implements Vehicle, Electric {
    private int batteryLevel = 100;  // Instance variable

    @Override
    public void start() {
        System.out.println("Tesla starts silently with a push button.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging Tesla battery... Battery level: " + batteryLevel + "%");
    }

    // Overriding the default method from Vehicle interface
    @Override
    public void fuelType() {
        System.out.println("Tesla is an electric vehicle. No fuel required!");
    }

    // Additional Tesla-specific method
    public void autoPilot() {
        System.out.println("Tesla is driving in autopilot mode.");
    }
}

// Main class to test the functionality
public class TestInterface{
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();

        myTesla.start();          // Output: Tesla starts silently with a push button.
        myTesla.fuelType();       // Output: Tesla is an electric vehicle. No fuel required!
        myTesla.chargeBattery();  // Output: Charging Tesla battery... Battery level: 100%
        myTesla.autoPilot();      // Output: Tesla is driving in autopilot mode.

        // Calling a static method from the Electric interface
        Electric.ecoFriendly();   // Output: Electric vehicles are eco-friendly.
    }
}