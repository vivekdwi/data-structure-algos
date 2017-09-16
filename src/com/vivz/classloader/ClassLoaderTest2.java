package com.vivz.classloader;

/**
 * Created by vivekdwivedi on 9/16/2017.
 */
public class ClassLoaderTest2 {
    public ClassLoaderTest2(String arg1, String arg2){
        System.out.println("ClassLoaderTest2 Constructor -->>"+arg1+" "+arg2);
    }

    public void printClassLoader(){
        System.out.println("ClassLoaderTest2 ClassLoader -->> "+ClassLoaderTest2.class.getClassLoader());
    }
}
