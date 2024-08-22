/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
// Subclass Car that inherits from Vehicle
public class Car extends Vehicle {
    // Property specific to Car
    int numberOfDoors;

    // Constructor for Car
    public Car(String make, String model, int numberOfDoors) {
        // Call the constructor of the superclass Vehicle
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    // Override the displayInfo() method to include numberOfDoors
    @Override
    public void displayInfo() {
        // Call the superclass's displayInfo() method
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
