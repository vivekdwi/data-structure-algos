package com.vivz.classloader;

import java.lang.reflect.Method;

/**
 * Created by vivekdwivedi on 9/16/2017.
 */
public class CustomClassLoaderRun {
    public static void main(String[] args) throws Exception{
        String progClass = args[0];
        String progArgs[] = new String[args.length -1];
        System.arraycopy(args,1,progArgs,0,progArgs.length);

        CustomClassLoader lCustomClassLoader = new CustomClassLoader(CustomClassLoaderRun.class.getClassLoader());
        Class lClass = lCustomClassLoader.loadClass(progClass);
        Class mainArgsType[] = {(new String[0]).getClass()};
        Method lMain = lClass.getMethod("main",mainArgsType);
        Object argsArray[] = {progArgs};
        lMain.invoke(null,argsArray);

        // Below method is used to check that the ClassLoaderTest1 is getting loaded
        // by our custom class loader i.e CustomClassLoader
        Method lPrintClassLoader = lClass.getMethod("printClassLoader",null);
        lPrintClassLoader.invoke(null,new Object[0]);
    }
}
