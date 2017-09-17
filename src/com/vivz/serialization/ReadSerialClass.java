package com.vivz.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;

/**
 * {@link ReadSerialClass} is an Example of
 * De-Serializing Serialized Object of {@link PersistSerialClass}
 *
 * Created by vivekdwivedi on 9/17/2017.
 */
public class ReadSerialClass {
    public static void main(String[] args){
        String fileName = "time.ser";
        if(args.length > 0){
            fileName = args[0];
        }

        PersistSerialClass lPersistSerialClass = null;
        FileInputStream lFileInputStream = null;
        ObjectInputStream lObjectInputStream = null;

        try{
            lFileInputStream = new FileInputStream(fileName);
            lObjectInputStream = new ObjectInputStream(lFileInputStream);
            lPersistSerialClass = (PersistSerialClass) lObjectInputStream.readObject();
            lObjectInputStream.close();
        }catch (IOException exp){
            System.err.println("Exception Occurred :: "+exp);
        }catch (ClassNotFoundException exp){
            System.err.println("Exception Occurred :: "+exp);
        }

        System.out.println("Restored Time :: "+lPersistSerialClass.getCurrentTime());
        System.out.println("Current Time :: "+ Calendar.getInstance().getTime());
    }
}
