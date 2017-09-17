package com.vivz.serialization;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * {@link SerialClass} is an Example of Basic Serialization
 * Process
 *
 * Created by vivekdwivedi on 9/17/2017.
 */
public class SerialClass implements Serializable{
    private Date currentTime;

    public SerialClass(){
        currentTime = Calendar.getInstance().getTime();
    }

    public Date getCurrentTime(){
        return currentTime;
    }
}
