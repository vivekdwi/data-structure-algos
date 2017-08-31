package com.vivz.multithreading.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutorsAtFixedRate class is an Example of
 * scheduleAtFixedRate() of Executors.
 *
 * scheduleAtFixedRate() is capable of executing tasks
 * with a fixed time rate, e.g. once every second.
 * Additionally this method accepts an initial delay
 * which describes the leading wait time before the
 * task will be executed for the first time.
 *
 * Please keep in mind that scheduleAtFixedRate() doesn't
 * take into account the actual duration of the task. So
 * if you specify a period of one second but the task needs
 * 2 seconds to be executed then the thread pool will working
 * to capacity very soon.
 *
 * Created by vivekdwivedi on 8/31/2017.
 */
public class ScheduledExecutorsAtFixedRate {
    public static void main(String[] args){
        ScheduledExecutorService lExecutorService = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling :: "+System.nanoTime());

        int initialDelay = 0;
        int period = 1;
        lExecutorService.scheduleAtFixedRate(task,initialDelay,period,TimeUnit.SECONDS);
    }
}
