/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
import java.util.Scanner;
public class Maths{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        // ask users to enter numbers
        System.out.println("Enter first number:");
        double num1 = input.nextDouble(); // Use double for more precision
        System.out.println("Enter second number:");
        double num2 = input.nextDouble(); // Use double for more precision

        
        // Perform different mathematical operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
         // Handle division by zero
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        // Print the results of the operations
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        // Calculate the average of the results
        double average = (addition + subtraction + multiplication + division) / 4;

        // Print the average
        System.out.println("Average: " + average);

        // Print a message based on the average value
        if (average > 100) {
            System.out.println("The average is higher than 100.");
        } else {
            System.out.println("The average is lower than or equal to 100.");
        }
    }
    }