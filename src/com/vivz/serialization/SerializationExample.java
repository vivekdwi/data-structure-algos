package com.vivz.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * {@link SerializationExample} class is an Example of
 * Serializing class object who have super class also.
 *
 * 1. First it writes out the serialization stream magic data -
 * What is serialization stream magic data? This is nothing but the
 * STREAM_MAGIC and STREAM_VERSION data (static data) so that JVM can
 * deserialize it when it has to. The STRAM_MAGIC will be "AC ED" and the
 * STREAM_VERSION will be the version of the JVM.
 *
 * 2. Then it writes out the metadata (description) of the class associated with
 * an instance. So in the below example after writing out the magic data, it writes
 * out the description of "SerialClass" class. What does this description include?
 * It includes the length of the class, the name of the class, serialVersionUID
 * (or serial version), various flags and the number of fields in this class.
 *
 * 3. Then it recursively writes out the metadata of the superclass until it finds
 * java.lang.object. Again in the below example, it writes out the description of
 * "SerialParent" and "SerialParentParent" classes.
 *
 * 4. Once it finishes writing the metadata information, it then starts with the
 * actual data associated with the instance. But this time, it starts from the top
 * most superclass. So it starts from "SerialParentParent", then writes out "SerialParent".
 *
 * 5. Finally it writes the data of objects associated with the instance starting from metadata
 * to actual content. So here it starts writing the metadata for the class Contain and then the
 * contents of it as usual recursively.
 *
 * Created by vivekdwivedi on 9/17/2017.
 */

class SerialParentParent implements Serializable{
    int parentParentVersion = 10;
}

class SerialParent implements Serializable{
    int parentVersion = 11;
}

class Contains implements Serializable{
    int containVersion = 20;
}

public class SerializationExample implements Serializable{
    int version = 12;
    Contains lContains = new Contains();

    public int getVersion(){
        return version;
    }

    public static void main(String[] args) throws IOException{
        FileOutputStream lFileOutputStream = new FileOutputStream("temp.ser");
        ObjectOutputStream lObjectOutputStream = new ObjectOutputStream(lFileOutputStream);
        SerializationExample lExample = new SerializationExample();
        lObjectOutputStream.writeObject(lExample);
        lObjectOutputStream.flush();
        lObjectOutputStream.close();
    }
}
