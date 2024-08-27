/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
// Main class to demonstrate inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle("Toyota", "Camry");
        System.out.println("Vehicle Information:");
        vehicle.displayInfo();

        // Create an instance of Car
        Car car = new Car("Honda", "Civic", 4);
        System.out.println("\nCar Information:");
        car.displayInfo();
    }
}
