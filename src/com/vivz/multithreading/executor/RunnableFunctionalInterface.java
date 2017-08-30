package com.vivz.multithreading.executor;

/**
 * RunnableFunctionalInterface Class ia an example
 * of Runnable Functional Interface using Lambda
 * Expression
 *
 * Runnable - a functional interface defining a
 * single void no-args method run()
 * Created by vivekdwivedi on 8/30/2017.
 */
public class RunnableFunctionalInterface {

    public static void main(String[] args){
        Runnable task = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello "+threadName);
        };

        task.run();
        Thread lThread = new Thread(task);
        lThread.start();
        System.out.println("Done!!!");
    }
}
