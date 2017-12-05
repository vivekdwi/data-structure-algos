package com.vivz.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * {@link ArraySumUsingSet} class is an Example of Printing
 * the pairs of Integers from an Array whose sum equals to given sum.
 *
 * Time Complexity O(N)
 * Created by vivekdwivedi on 12/5/17.
 */
public class ArraySumUsingSet {
    public static void main(String[] args) {
        prettyPrint(getRandomArray(9),10);
        prettyPrint(getRandomArray(10),11);
    }

    /**
     * This Method Prints the Pairs From Array whose sum
     * equals to given sum using Set.
     *
     * @param array
     * @param sum
     */
    public static void printPairUsingSet(int[] array, int sum){
        if(array.length < 2)
            return;

        Set<Integer> lSet = new HashSet<>(array.length);
        for(int value : array){
            int target = sum - value;
            if(!lSet.contains(target))
                lSet.add(value);
            else
                System.out.printf("(%d %d)%n",value,target);
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
        printPairUsingSet(array,sum);
    }

    /**
     * This method generates Random Array
     *
     * @param length
     * @return
     */
    public static int[] getRandomArray(int length){
        int[] randomArray = new int[length];
        for (int i =0; i<length; i++){
            randomArray[i] = (int) (Math.random()*15);
        }
        return randomArray;
    }
}
