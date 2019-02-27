package oop_exercises;

public class Bank {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("Tester Guy");
        bankAccount.deposit(50.25);
        bankAccount.deposit(10.10);
        bankAccount.withdraw(100.01);
        bankAccount.withdraw(10.01);
        bankAccount.deposit(2.25);
        bankAccount.withdraw(25.25);
        System.out.println(bankAccount);
    }

}
