package com.vivz.multithreading.executor;

import com.vivz.multithreading.synchronizationandlocks.ConcurrentUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ExecutorServiceWithShutdown Class is an Example Of
 * ExecutorService with Shutdown and ShutdownNow
 * methods to stop the ExecutorServices
 *
 * An ExecutorService provides two methods for that purpose:
 * shutdown() waits for currently running tasks to finish while
 * shutdownNow() interrupts all running tasks and shut the
 * executor down immediately.
 *
 * Created by vivekdwivedi on 8/30/2017.
 */
public class ExecutorServiceWithShutdown {

    public static void main(String[] args){
        ExecutorService lExecutorService = Executors.newFixedThreadPool(1);
        lExecutorService.submit(() -> {
            try{
                String lThreadName = Thread.currentThread().getName();
                System.out.println("Hello ::: "+lThreadName);
                System.out.println("Attempt to Shutdown Executor");
                ConcurrentUtils.stop(lExecutorService);
            }finally {
                if(!lExecutorService.isShutdown()){
                    System.err.println("Cancel Not Finished Tasks");
                }
                lExecutorService.shutdownNow();
                System.out.println("Shutdown Finished");
            }
        });
    }
}
