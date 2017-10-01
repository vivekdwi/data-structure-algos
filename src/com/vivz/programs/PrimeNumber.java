package com.vivz.programs;

import java.util.Scanner;

/**
 * {@link PrimeNumber} Class is an example of
 * finding Prime Number.
 *
 * Created by vivekdwivedi on 10/1/2017.
 */
public class PrimeNumber {
    public static void main(String[] args){
        Scanner lScanner = new Scanner(System.in);
        PrimeNumber obj = new PrimeNumber();
        System.out.println("Enter lower and upper limit : ");
        int initNumber = lScanner.nextInt();
        int upperLimit = lScanner.nextInt();
        boolean isPrime = Boolean.TRUE;
        for(int i=initNumber; i<=upperLimit;i++){
            isPrime = obj.isPrimeNumber(i);
            if(isPrime)
                System.out.println(i+" is prime number");
            else
                System.out.println(i+" is not prime number");
        }
    }

    /**
     * isPrimeNumber() returns true or false based on
     * Condition weather number is prime or not
     *
     * @param number
     * @return
     */
    private boolean isPrimeNumber(int number){
        boolean isPrime = Boolean.TRUE;
        for(int i=2;i<number;i++){
            if(number % i == 0){
                isPrime = Boolean.FALSE;
                break;
            }
        }
        return isPrime;
    }
}
