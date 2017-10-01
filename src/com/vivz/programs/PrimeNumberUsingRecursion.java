package com.vivz.programs;

import java.util.Scanner;

/**
 * {@link PrimeNumberUsingRecursion} class is an example
 * of Prime Number Using Recursion.
 *
 * Created by vivekdwivedi on 10/1/2017.
 */
public class PrimeNumberUsingRecursion {
    public static void main(String[] args){
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter Inital Limit of Number : ");
        int initNumber = lScanner.nextInt();
        System.out.println("Enter Upper Limit of Number : ");
        int upperNumber = lScanner.nextInt();

        Boolean isPrimeNumber = Boolean.TRUE;
        for (int i=initNumber;i<=upperNumber; i++){
            isPrimeNumber = isPrimeNumber(i,2);
            if(isPrimeNumber)
                System.out.println(i+" is Prime Number");
            else
                System.out.println(i+" is not Prime Number");
        }
    }

    /**
     * isPrimeNumber() returns True or False Based on Condition
     * weather ni=umber is prime number or not.
     *
     * @param number
     * @param divisibleBy
     * @return
     */
    private static boolean isPrimeNumber(int number, int divisibleBy){
        if(divisibleBy < number){
            if(number % divisibleBy !=0){
                return isPrimeNumber(number,++divisibleBy);
            }else
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
