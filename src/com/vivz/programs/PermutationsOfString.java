package com.vivz.programs;

/**
 * Created by vivekdwivedi on 9/22/2017.
 */
public class PermutationsOfString {
    public static void main(String[] args){
        stringPermutations("Hi this is vivek");
    }

    private static void stringPermutations(String inputString){
        getPermutations("",inputString);
    }

    private static void getPermutations(String permutation, String inputString){
        if(inputString.length() == 0)
            System.out.println(permutation);
        else{
            for(int i=0; i<inputString.length();i++){
                getPermutations(permutation+inputString.charAt(i),inputString.substring(0,i)+inputString.substring(i+1,inputString.length()));
            }
        }
    }
}
