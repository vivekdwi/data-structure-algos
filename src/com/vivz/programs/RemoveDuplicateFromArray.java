package com.vivz.programs;

import java.util.Arrays;

/**
 * Created by vivekdwivedi on 11/14/2017.
 */
public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,1,2,7,8,8,9};
        removeDuplicateFromArray(array);
    }

    private static void removeDuplicateFromArray(int[] array){
        int arraySize = array.length;
        for (int i=0; i < arraySize; i++){
            for(int j=i+1; j < arraySize; j++){
                if(array[i] == array[j]){
                    array[j] = array[arraySize-1];
                    arraySize--;
                    j--;
                }
            }
        }

        int[] arrayWithoutDuplicates = Arrays.copyOf(array,arraySize);
        for(int i=0; i < arrayWithoutDuplicates.length; i++){
            System.out.print(arrayWithoutDuplicates[i]+" ");
        }
    }
}
