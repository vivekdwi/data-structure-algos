package com.vivz.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class StringAnagramUsingHashMap {
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
            Map<Character,Integer> map = new HashMap<>();
            for(int i =0;i<copyOfStr1.length();i++){
                char charAsKey = copyOfStr1.charAt(i);
                int charCountAsValue = 0;
                if(map.containsKey(charAsKey)){
                    charCountAsValue = map.get(charAsKey);
                }

                map.put(charAsKey,++charCountAsValue);
                charAsKey = copyOfStr2.charAt(i);
                charCountAsValue = 0;
                if(map.containsKey(charAsKey)){
                    charCountAsValue = map.get(charAsKey);
                }
                map.put(charAsKey,--charCountAsValue);
            }

            for(int value : map.values()){
                if(value != 0){
                    status = false;
                }
            }
        }

        if(status)
            System.out.println(inputString1+" and "+inputString2+" are anagrams");
        else
            System.out.println(inputString1+" and "+inputString2+" are not anagrams");

    }
}
