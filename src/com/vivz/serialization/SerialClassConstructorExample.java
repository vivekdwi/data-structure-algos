package com.vivz.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * {@link SerialClassConstructorExample} is an Example of
 * Serializing and De-Serializing any class object but we have
 * done some logic in that Class Constructor also.
 *
 * Created by vivekdwivedi on 9/17/2017.
 */
public class SerialClassConstructorExample implements Serializable{
    private Date currentDate;

    public SerialClassConstructorExample(){
        calculateCurrentTime();
    }

    public Date getCurrentDate(){
        return currentDate;
    }
    private void calculateCurrentTime(){
        currentDate =  Calendar.getInstance().getTime();
    }

    private void writeObject(ObjectOutputStream pObjectOutputStream) throws IOException{
        pObjectOutputStream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream pObjectInputStream) throws IOException, ClassNotFoundException{
        pObjectInputStream.defaultReadObject();
        calculateCurrentTime();
    }
}
