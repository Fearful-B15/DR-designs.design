/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
public class Books {
     private String title;
    private String author;
    private double price;

    // Constructor to initialize properties
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Method to apply a discount
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double discountAmount = price * (discountPercentage / 100);
            price -= discountAmount;
            System.out.println("Discount of " + discountPercentage + "% applied.");
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Create a Book object
        Books book = new Books("The Great Gatsby", "F. Scott Fitzgerald", 15.99);

        // Display book details
        System.out.println("Book Details:");
        book.displayDetails();

        // Apply a discount
        book.applyDiscount(10);

        // Display book details after discount
        System.out.println("\nBook Details After Discount:");
        book.displayDetails();
    }
}
