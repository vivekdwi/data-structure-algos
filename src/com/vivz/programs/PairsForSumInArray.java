package com.vivz.programs;

import java.util.Arrays;

/**
 * {@link PairsForSumInArray} Class is an Example of Printing
 * the pairs of Integers from an Array whose sum equals to given sum.
 *
 * Time Complexity O(n2)
 * Created by vivekdwivedi on 12/5/17.
 */
public class PairsForSumInArray {
    public static void main(String[] args) {
        int[] array = {2,4,3,5,7,8,9};
        int[] arrayWithDuplicateNumbers = {2,4,3,5,6,-2,4,7,8,9};
        prettyPrint(array,7);
        prettyPrint(arrayWithDuplicateNumbers,7);
    }

    /**
     * This Method Prints the Pairs From Array whose sum
     * equals to given sum
     *
     * @param array
     * @param sum
     */
    public static void printPairs(int[] array, int sum){
        for (int i =0; i<array.length; i++){
            int firstNumber = array[i];
            for(int j= i+1; j<array.length; j++){
                int secondNumber = array[j];
                if(firstNumber + secondNumber == sum)
                    System.out.printf("(%d %d) %n",firstNumber,secondNumber);
            }
        }
    }

    /**
     * This method prints the Array Details.
     *
     * @param array
     * @param sum
     */
    public static void prettyPrint(int[] array, int sum){
        System.out.println("Given Array :: "+ Arrays.toString(array));
        System.out.println("Given Sum :: "+sum);
        System.out.println("Integer numbers, whose sum is equal to value : " + sum);
        printPairs(array,sum);
    }
}
