/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
public class Vehicle {
    // Properties of Vehicle
    String make;
    String model;

    // Constructor for Vehicle
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display Vehicle information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}
