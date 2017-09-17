package com.vivz.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * {@link ExternalizationClass} class is an Example
 * of Externalization
 *
 * Created by vivekdwivedi on 9/17/2017.
 */
public class ExternalizationClass extends ExternalizationParentClass implements Externalizable{

    String mName;
    int mYear;

    public ExternalizationClass(){
        super();
    }

    public ExternalizationClass(String pName, int pYear){
        mName = pName;
        mYear = pYear;
    }


    /**
     * The object implements the writeExternal method to save its contents
     * by calling the methods of DataOutput for its primitive values or
     * calling the writeObject method of ObjectOutput for objects, strings,
     * and arrays.
     *
     * @param out the stream to write the object to
     * @throws IOException Includes any I/O exceptions that may occur
     * @serialData Overriding methods should use this tag to describe
     * the data layout of this Externalizable object.
     * List the sequence of element types and, if possible,
     * relate the element to a public/protected field and/or
     * method of this Externalizable class.
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        /*
         * Since the superclass does not implement the Serializable interface
         * we explicitly do the saving.
         */
        /*out.writeObject(mRegNo);
        out.writeObject(mMileage);*/

        /**
         * first we call the writeExternal of the superclass as to write
         * all the superclass data fields
         */
        super.writeExternal(out);

        //Now the subclass fields
        out.writeObject(mName);
        out.writeInt(mYear);
    }

    /**
     * The object implements the readExternal method to restore its
     * contents by calling the methods of DataInput for primitive
     * types and readObject for objects, strings and arrays.  The
     * readExternal method must read the values in the same sequence
     * and with the same types as were written by writeExternal.
     *
     * @param in the stream to read data from in order to restore the object
     * @throws IOException            if I/O errors occur
     * @throws ClassNotFoundException If the class for an object being
     *                                restored cannot be found.
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        /*
         * Since the superclass does not implement the Serializable interface
         * we explicitly do the restoring
         */
        /*mRegNo = (String) in.readObject();
        mMileage = (String) in.readObject();*/

        /**
         * first we call the readExternal of the superclass as to write
         * all the superclass data fields
         */
        super.readExternal(in);

        //Now the subclass fields
        mName = (String) in.readObject();
        mYear = in.readInt();
    }

    @Override
    public String toString() {
        return "[Name : "+mName+" Year : "+mYear+" Reg. No. : "+mRegNo+" Year : "+mYear+"]";
    }
}
