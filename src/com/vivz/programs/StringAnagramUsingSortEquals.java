package com.vivz.programs;

import java.util.Arrays;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class StringAnagramUsingSortEquals {
    public static void main(String[] args){
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");
    }

    private static void isAnagram(String inputString1, String inputString2){
        String copyOfString1 = inputString1.replaceAll("\\s","");
        String copyOfString2 = inputString2.replaceAll("\\s","");

        boolean status = true;

        if(copyOfString1.length() != copyOfString2.length()){
            status = false;
        }else{
            char[] str1Array = copyOfString1.toLowerCase().toCharArray();
            char[] str2Array = copyOfString2.toLowerCase().toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            status = Arrays.equals(str1Array,str2Array);
        }

        if(status)
            System.out.println(inputString1+" and "+inputString2+" are anagrams");
        else
            System.out.println(inputString1+" and "+inputString2+" are not anagrams");
    }
}
