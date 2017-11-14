package com.vivz.programs;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

/**
 * Created by vivekdwivedi on 11/14/2017.
 */
public class Account {
    private int id;
    private Date dateCreated;
    private  double balance, annualInterest;

    Account(){
        this.id = generateRandomNumber().nextInt(50);
        this.dateCreated = new Date();
    }

    Account(double balance, double annualInterest){
        this.id = generateRandomNumber().nextInt(50);
        this.dateCreated = new Date();
        this.balance = balance;
        this.annualInterest = annualInterest;
    }

    public void withdraw(double amount){
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    public double addInterest(){
        balance += (balance * annualInterest);
        return balance;
    }
    private Random generateRandomNumber(){
        SecureRandom random = new SecureRandom();
        final byte[] bytes = new byte[50];
        random.nextBytes(bytes);
        return random;
    }

    public int getId(){
        return id;
    }

    public Date getDateCreated(){
        return dateCreated;
    }
}
