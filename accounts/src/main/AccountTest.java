package main;

import exceptions.InsufficientFundsException;
import pojos.Account;

import java.math.BigDecimal;

public class AccountTest {

    public static void main(String[] args) {

        Account a1 = null;
        Account a2 = null;

        try {
            a1 = new Account("Fred", new BigDecimal("1000"));
            a2 = new Account("Ned");
        } catch (InsufficientFundsException e) {
            System.out.println("Starter balance must be more that zero!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (a1 != null && a2 != null) {
            a2.deposit(new BigDecimal(500));
            try {
                a2.withdraw(new BigDecimal(2000));
            } catch (InsufficientFundsException e) {
                System.out.println("Insufficient funds!");
            }
            System.out.printf("Account number: %s%n Name: %s%n Balance: %s%n", a1.getNumber(), a1.getName(), a1.getBalance());
            System.out.printf("Account number: %s%n Name: %s%n Balance: %s%n", a2.getNumber(), a2.getName(), a2.getBalance());

        }
    }
}
