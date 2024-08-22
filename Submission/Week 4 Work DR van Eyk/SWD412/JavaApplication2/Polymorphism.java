/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
public class Polymorphism {
    
    // Base class Shape
    static class Shape {
        // Method to calculate area (to be overridden by subclasses)
        public double area() {
            return 0; // Default implementation (could also be abstract)
        }
    }

    // Subclass Rectangle that extends Shape
    static class Rectangle extends Shape {
        private double length;
        private double width;

        // Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Override the area() method to calculate the area of a rectangle
        @Override
        public double area() {
            return length * width;
        }
    }

    // Subclass Circle that extends Shape
    static class Circle extends Shape {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Override the area() method to calculate the area of a circle
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    // Main method to demonstrate polymorphism
    public static void main(String[] args) {
        // Creates an array of Shape references
        Shape[] shapes = new Shape[2];

        // Initialize the array with Rectangle and Circle objects
        shapes[0] = new Rectangle(5, 7);
        shapes[1] = new Circle(3);

        // Loop through the array and call the area() method on each shape in the program 
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}
