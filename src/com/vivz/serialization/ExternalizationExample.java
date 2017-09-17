package com.vivz.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * {@link ExternalizationExample} class is test class
 * to Test Externalization in Java.
 *
 * Created by vivekdwivedi on 9/17/2017.
 */
public class ExternalizationExample {

    public static void main(String[] args){
        ExternalizationClass lExample = new ExternalizationClass("Mitsubishi",2009);
        ExternalizationClass lNewExample = null;

        try{
            FileOutputStream lFileOutputStream = new FileOutputStream("tmp");
            ObjectOutputStream lObjectOutputStream = new ObjectOutputStream(lFileOutputStream);
            lObjectOutputStream.writeObject(lExample);
            lObjectOutputStream.flush();
        }catch (Exception exp){
            System.err.println("Exception Occurred :: "+exp);
        }

        try {
            FileInputStream lFileInputStream = new FileInputStream("tmp");
            ObjectInputStream lObjectInputStream = new ObjectInputStream(lFileInputStream);
            lNewExample = (ExternalizationClass) lObjectInputStream.readObject();
        }catch (Exception exp){
            System.err.println("Exception Occurred :: "+exp);
            System.exit(1);
        }

        System.out.println("The Original Example is :: "+lExample);
        System.out.println("The New Example is :: "+lNewExample);
    }
}
