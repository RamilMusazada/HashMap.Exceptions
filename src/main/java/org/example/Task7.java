package org.example;
import java.util.Scanner;

//Bir bank sistemində balansdan çıxarış funksiyası yaradın:
//Əgər balans kifayət qədər deyilsə, istisna atılsın.Bu istisnanı throws istifadə edərək bir metodun daxilind yaradın.
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(500);
        try {
            System.out.println("Current balance : " + account.getBalance());
            System.out.println("Enter amount : ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class InsufficientException extends Exception {
    public InsufficientException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientException {
        if (amount > balance) {
            throw new InsufficientException("Insufficient balance to withdraw" + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful , balance :  " + balance);
        }
    }
    public double getBalance() {
        return balance;
    }
}