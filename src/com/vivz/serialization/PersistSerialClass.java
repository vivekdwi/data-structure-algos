package com.vivz.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * {@link PersistSerialClass} is an Example of
 * Serializing Class Object using writeObject().
 *
 * Created by vivekdwivedi on 9/17/2017.
 */
public class PersistSerialClass extends SerialClass{

    public static void main(String[] args){
        String fileName = "time.ser";

        if (args.length > 0){
            fileName = args[0];
        }

        PersistSerialClass lTime = new PersistSerialClass();
        FileOutputStream lFileOutputStream = null;
        ObjectOutputStream lObjectOutputStream = null;

        try {
            lFileOutputStream = new FileOutputStream(fileName);
            lObjectOutputStream = new ObjectOutputStream(lFileOutputStream);
            lObjectOutputStream.writeObject(lTime);
            lObjectOutputStream.flush();
            lObjectOutputStream.close();
        }catch (IOException exp){
            System.err.println("Exception Occured :: "+exp);
        }
    }
}
