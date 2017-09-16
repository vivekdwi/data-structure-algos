package com.vivz.classloader;

/**
 * Created by vivekdwivedi on 9/16/2017.
 */
public class ClassLoaderTest1 {
    public static void main(String[] args){
        System.out.println("ClassLoaderTest1 Constructor -->> "+args[0]+" "+args[1]);
        ClassLoaderTest2 lCCTest = new ClassLoaderTest2(args[0],args[1]);
        lCCTest.printClassLoader();
    }

    public void printClassLoader(){
        System.out.println("ClassLoaderTest1 Constructor -->> "+ClassLoaderTest1.class.getClassLoader());
    }
}
