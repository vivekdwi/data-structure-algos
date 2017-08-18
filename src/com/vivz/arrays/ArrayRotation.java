package com.vivz.arrays;

import java.util.Scanner;

/**
 *
 * ArrayRotation Class Rotates the Given Array
 * with Time Complexity O(size*step) and
 * Auxiliary Space O(1)
 *
 * Created by vivekdwivedi on 8/18/17.
 */
public class ArrayRotation {

    public static void main(String args[]){

        ArrayRotation lArrayRotation = new ArrayRotation();

        Scanner lScanner = new Scanner(System.in);

        System.out.println("Enter Number Of Steps To Rotate Array : ");
        int lRotationStep = lScanner.nextInt();
        System.out.println("Enter Array Size : ");
        int lArraySize = lScanner.nextInt();

        int[] array = new int[lArraySize];

        System.out.println("Enter Array Values : ");
        //Reading Values in Array
        for(int i=0; i < lArraySize; i++){
            array[i] = lScanner.nextInt();
        }

        lArrayRotation.leftRotate(array,lRotationStep);
        lArrayRotation.printArray(array);
    }

    /*
     * leftRotate method rotates the array upto
     * with step we have to rotate
     *
     * @param pArray, pStep
     * @return
     */
    public void leftRotate(int[] pArray, int pStep){
        for (int i=0; i < pStep; i++)
            leftRotateByOne(pArray);
    }

    /*
     * leftRotateByOne method Shifts Array Element By
     * one index
     *
     * @param pArray
     * @return
     */
    public void leftRotateByOne(int[] pArray){

        int i, lTemp = pArray[0];
        for(i =0; i < pArray.length-1; i++){
            pArray[i] = pArray[i+1];
        }
        pArray[i] = lTemp;
    }

    /*
     * printArray method prints array
     *
     * @param pArray
     * @return
     */
    public void printArray(int[] pArray){
        System.out.println();
        for (int element : pArray){
            System.out.print(element+" ");
        }
    }
}
