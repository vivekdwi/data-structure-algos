package com.vivz.programs;

/**
 * Created by vivekdwivedi on 11/14/2017.
 */
public class BankAccountProgram {
    public static void main(String[] args) {
        Account account = new Account(5000,4.5);
        System.out.println("Account Number :: "+account.getId());
        System.out.println("Account Created :: "+account.getDateCreated());
        System.out.println("Account Opening Balance :: "+account.getBalance());
        account.deposit(5000);
        System.out.println("After Deposit Account Balance :: "+account.getBalance());
        account.withdraw(500);
        System.out.println("After Withdraw Account Balance :: "+account.getBalance());
    }
}
