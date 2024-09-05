
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
public class Windows {
        // Method to create the first window
    public static void createFirstWindow() {
        // Create the first window (JFrame)
        JFrame firstWindow = new JFrame("First Window");
        firstWindow.setSize(400, 300);
        firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstWindow.setLayout(null);

        // Create a button and set its position and size
        JButton button = new JButton("Open Second Window");
        button.setBounds(120, 100, 160, 50);

        // Add action listener to the button to open the second window
        button.addActionListener(e -> createSecondWindow());

        // Add the button to the first window
        firstWindow.add(button);

        // Make the first window visible
        firstWindow.setVisible(true);
    }

    // Method to create the second window
    public static void createSecondWindow() {
        // Create the second window (JFrame)
        JFrame secondWindow = new JFrame("Second Window");
        secondWindow.setSize(400, 300);
        secondWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close to only close this window

        // Add content to the second window if needed
        JLabel label = new JLabel("Welcome to the Second Window!", SwingConstants.CENTER);
        secondWindow.add(label);

        // Make the second window visible
        secondWindow.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        // Create and display the first window
        createFirstWindow();
    }
}
