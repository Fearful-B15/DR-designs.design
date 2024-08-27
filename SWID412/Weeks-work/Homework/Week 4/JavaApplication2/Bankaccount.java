/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dian
 */
public class Bankaccount {
    // Private fields
    private String accountNumber;
    private double balance;

    // Constructor to initialize accountNumber and balance
    public Bankaccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Public method to check the balance
    public double getBalance() {
        return balance;
    }

    // Public method to get the account number (if needed)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        // Create a BankAccount object
        Bankaccount account = new Bankaccount("123456789", 1000.00);

        // Display initial balance
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit funds
        account.deposit(500.00);

        // Withdraw funds
        account.withdraw(200.00);

        // Try to withdraw more than the balance
        account.withdraw(2000.00);

        // Check final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
