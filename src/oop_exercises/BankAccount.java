package oop_exercises;

/*
 * Michael Pu
 * Mr. Radulovic
 * 2019/02/26
 * ICS4U1
 *
 * Represents a bank account, storing the name of the account holder, balance, and last 5 valid transactions.
 * It supports getting and setting the name of the account holder, getting the balance, withdrawing money,
 * depositing money, as well as outputting a formatted summary of the account.
 */

public class BankAccount {

    private double balance;
    private double[] history;
    private String name;

    public BankAccount() {
        this.history = new double[5];
    }

    private void addTransaction(double amount) {
        for (int i = 0; i < history.length - 1; i++) {
            history[i] = history[i + 1];
        }
        history[history.length - 1] = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            this.addTransaction(amount);
        } else {
            System.out.println("You cannot deposit a negative or zero amount.");
        }
    }

    public double withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            this.addTransaction(-amount);
            return this.balance;
        } else if (amount > 0) {
            System.out.println("Insufficient funds.");
            return -1;
        } else {
            System.out.println("You cannot withdraw a negative or zero amount.");
            return -1;
        }
    }

    public void setName(String name) {
        if (name.length() == 0) {
            System.out.println("You cannot set an empty string for name.");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String output = "----------\n";
        output += "Bank Account Summary for " + getName() + "\n";
        output += String.format("Current Balance: $%.2f\n", getBalance());
        output += String.format("Transaction History\n");

        int transactionCount = 0;
        for (int i = 0; i < 5; i++) {
            if (this.history[i] > 0) {
                output += String.format("Deposited $%.2f\n", this.history[i]);
                transactionCount++;
            } else if (this.history[i] < 0) {
                output += String.format("Withdrew $%.2f\n", -this.history[i]);
                transactionCount++;
            }
        }
        if (transactionCount == 0) {
            output += "No transactions stored.\n";
        }

        output += "----------";

        return output;
    }

}
