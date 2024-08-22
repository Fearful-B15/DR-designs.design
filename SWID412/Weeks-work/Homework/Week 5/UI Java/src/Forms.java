/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forms {
    // Constructor to set up the form
    public Forms() {
        // Create a new JFrame container
        JFrame frame = new JFrame("Registration Form");

        // Set the layout to null for absolute positioning
        frame.setLayout(null);
        frame.setSize(400, 300);  // Set the size of the frame

        // Name label and text field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);
        frame.add(nameField);

        // Email label and text field
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 30);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 150, 30);
        frame.add(emailField);

        // Password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 100, 30);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 150, 150, 30);
        frame.add(passwordField);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 200, 100, 30);
        frame.add(submitButton);

        // Add an action listener to the submit button
        submitButton.addActionListener((ActionEvent e) -> {
            // Get the input from the text fields
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            
            // Display a message dialog with the user's input
            JOptionPane.showMessageDialog(frame, "Name: " + name + "\nEmail: " + email + "\nPassword: " + password);
        });

        // Set the frame's visibility, close operation, and location
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Run the form in the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new Forms());
    }
}
