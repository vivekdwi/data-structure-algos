package com.vivz.classloader;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * {@link CustomClassLoader} Class Loader to load the classes. Any class in the com.journaldev
 * package will be loaded using this ClassLoader. For other classes, it will
 * delegate the request to its Parent ClassLoader.
 *
 *
 * Created by vivekdwivedi on 9/16/2017.
 */
public class CustomClassLoader extends ClassLoader{

    /**
     * This constructor is used to set the parent ClassLoader
     *
     * @param parent
     */
     public CustomClassLoader(ClassLoader parent){
         super(parent);
     }

    /**
     * Loads the class from the file system. The class file should be located in
     * the file system. The name should be relative to get the file location.
     *
     * @param fileName
     * @return
     * @throws ClassNotFoundException
     */
     private Class getClass(String fileName) throws ClassNotFoundException{
        String lFile = fileName.replace('.', File.separatorChar)+".class";
        byte[] lBytes = null;
        try {
            lBytes = loadClassFile(fileName);
            Class lClass = defineClass(lFile,lBytes,0,lBytes.length);
            resolveClass(lClass);
            return lClass;
        }catch (IOException exp){
            System.err.println("Exception Occurred : "+exp.getMessage());
            return null;
        }
    }

    /**
     * Every request for a class passes through this method. If the class is in
     * com.vivz package, we will use this classloader or else delegate the
     * request to parent classloader.
     *
     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.out.println("Load Class [ "+name+" ]");
        if(name.startsWith("com.vivz")){
            System.out.println("Loading Class Using Custom ClassLoader");
            return getClass(name);
        }
        return super.loadClass(name);
    }

    /**
     * Reads the file (.class) into a byte array. The file should be
     * accessible as a resource and make sure that its not in Classpath to avoid
     * any confusion.
     *
     * @param fileName
     * @return
     * @throws IOException
     */
    private byte[] loadClassFile(String fileName) throws IOException{
        InputStream lInputStream = getClass().getClassLoader().getResourceAsStream(fileName);
        int lSize = lInputStream.available();
        byte[] lBuffer = new byte[lSize];
        DataInputStream lDataInputStream = new DataInputStream(lInputStream);
        lDataInputStream.readFully(lBuffer);
        lDataInputStream.close();
        return lBuffer;
    }
}
