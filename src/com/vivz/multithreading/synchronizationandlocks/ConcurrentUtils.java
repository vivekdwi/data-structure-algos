package com.vivz.multithreading.synchronizationandlocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ConcurrentUtils Class Contains Methods
 * to Stop Executors and put Executors in Sleep
 *
 * Created by vivekdwivedi on 8/31/2017.
 */
public class ConcurrentUtils {

    /**
     * This Method Shutdowns the Executors
     *
     * @param executor
     */
    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
        }
    }

    /**
     * This Method Puts the Executors in Sleep.
     *
     * @param seconds
     */
    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
