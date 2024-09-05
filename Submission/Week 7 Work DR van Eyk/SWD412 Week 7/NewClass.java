import javax.swing.*;
import java.awt.event.*;

// Implementing ActionListener
public class NewClass implements ActionListener {  // Fixed typo in ActionListener

    // Declare components
    JFrame frame1;
    JLabel label1, label2;
    JTextField t1;  
    JPasswordField t2;  
    JButton b1;

    // Constructor
    NewClass() {
        // Initialize components
        frame1 = new JFrame("Log in");  // Fixed typo in Jframe to JFrame
        label1 = new JLabel("User Name");
        label2 = new JLabel("Password");
        t1 = new JTextField(40);
        t2 = new JPasswordField(20);  
        b1 = new JButton("OK");

        // Setting up the frame
        frame1.setSize(800, 400);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        // Adding components to the frame
        frame1.add(label1);
        frame1.add(t1);
        frame1.add(label2);
        frame1.add(t2);
        frame1.add(b1);

        // Setting positions of components
        label1.setBounds(0, 30, 100, 30);
        t1.setBounds(110, 30, 100, 30);
        label2.setBounds(0, 70, 100, 30);
        t2.setBounds(110, 70, 100, 30);
        b1.setBounds(0, 120, 100, 30);

        // Adding action listener to the button
        b1.addActionListener(this);  // Corrected: Proper implementation of ActionListener
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame1.dispose();  // Close the login window

        // Ensure that Secon_JFrame is defined and initialized correctly
        Secon_JFrame plne2 = new Secon_JFrame();  // Ensure Secon_JFrame class exists
    }

    public static void main(String[] args) {
        NewClass newClass = new NewClass();  // Corrected class instantiation in main method
    }
}