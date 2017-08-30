package com.vivz.multithreading.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutors Class an Example for
 * ScheduledExecutorService to scheduled task
 * periodically or once.
 *
 * In order to periodically run common tasks multiple
 * times, we can utilize scheduled thread pools.
 * A ScheduledExecutorService is capable of scheduling
 * tasks to run either periodically or once after a
 * certain amount of time has elapsed.
 *
 * Created by vivekdwivedi on 8/30/2017.
 */
public class ScheduledExecutors {
    public static void main(String[] args){
        try{
            ScheduledExecutorService lExecutorService = Executors.newScheduledThreadPool(1);
            Runnable task = () -> System.out.println("Scheduling :: "+System.nanoTime());
            ScheduledFuture<?> lFuture = lExecutorService.schedule(task,3, TimeUnit.SECONDS);
            TimeUnit.MILLISECONDS.sleep(1337);
            long remainingDelay = lFuture.getDelay(TimeUnit.MILLISECONDS);
            System.out.printf("Remaining Delays : %sms \n",remainingDelay);
            lExecutorService.shutdown();
        }catch (InterruptedException exp){
            System.err.println(exp.getLocalizedMessage());
        }
    }
}
