package com.vivz.programs;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class StringAnagramUsingStringBuilder {
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
        String copyOfStr1 = inputString1.replaceAll("\\s","").toLowerCase();
        String copyOfStr2 = inputString2.replaceAll("\\s","").toLowerCase();

        boolean status = true;
        if(copyOfStr1.length() != copyOfStr2.length()){
            status = false;
        }else{
            char[] str1Array = copyOfStr1.toCharArray();
            StringBuilder lStringBuilder = new StringBuilder(copyOfStr2);
            for(Character lCharacter : str1Array){
                int index = lStringBuilder.indexOf(""+lCharacter);
                if(index != -1){
                    lStringBuilder = lStringBuilder.deleteCharAt(index);
                }else{
                    status = false;
                    break;
                }
            }
        }

        if(status)
            System.out.println(inputString1+" and "+inputString2+" are anagrams");
        else
            System.out.println(inputString1+" and "+inputString2+" are not anagrams");
    }
}
