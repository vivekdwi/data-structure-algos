package com.vivz.programs;

/**
 * Created by vivekdwivedi on 11/14/2017.
 */
public class SortArray {
    public static void main(String[] args) {
        int[] array = {1,4,6,2,7,8,3,5};
        sortArray(array);
    }

    private static void sortArray(int[] array){
        int size = array.length;
        int temp;
        for(int i=0; i<size; i++){
            for(int j= i+1; j < size; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }
}
