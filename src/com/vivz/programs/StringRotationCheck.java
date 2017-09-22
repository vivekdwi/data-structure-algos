package com.vivz.programs;

/**
 * Created by vivekdwivedi on 9/21/2017.
 */
public class StringRotationCheck {
    public static void main(String[] args){
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        if(str1.length() != str2.length()){
            System.out.println("Str2 is not rotated version of str1");
        }else{
            String str3 = str1 + str2;

            if(str3.contains(str2)){
                System.out.println("Str2 is rotated version of str1");
            }else{
                System.out.println("Str2 is not rotated version of str1");
            }
        }
    }
}
