package com.vivz.multithreading.executor;

import com.vivz.multithreading.synchronizationandlocks.ConcurrentUtils;

import java.util.concurrent.TimeUnit;

/**
 * RunnableFunctionalInterfaceWithSleep Class is an Example
 * of Runnable Functional Interface Using Lambda with
 * Sleep Using Concurrent API
 *
 * Created by vivekdwivedi on 8/30/2017.
 */
public class RunnableFunctionalInterfaceWithSleep {
    public static void main(String[] args){
        Runnable runnable = () -> {
            try{
                String threadName = Thread.currentThread().getName();
                System.out.println("Foo :: "+threadName);
                ConcurrentUtils.sleep(5);
                System.out.println("Bar :: "+threadName);
            }catch (Exception exp){
                System.err.println(exp.getLocalizedMessage());
            }
        };

        Thread lThread = new Thread(runnable);
        lThread.start();
        System.out.println("Done!!!");
    }
}
