package com.vivz.multithreading.synchronizationandlocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * SynchronizedExample is an Example of
 * Shared resources for Synchronized and
 * non synchronized resources using Synchronize
 * keyword.
 *
 * Created by vivekdwivedi on 8/31/2017.
 */
public class SynchronizedExample {
    private static final int NUM_INCREMENTS = 10000;

    private static int count = 0;

    public static void main(String[] args) {
        testSyncIncrement();
        testNonSyncIncrement();
    }

    private static void testSyncIncrement() {
        count = 0;

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, NUM_INCREMENTS)
                .forEach(i -> executor.submit(SynchronizedExample::incrementSync));

        ConcurrentUtils.stop(executor);

        System.out.println("   Sync: " + count);
    }

    private static void testNonSyncIncrement() {
        count = 0;

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, NUM_INCREMENTS)
                .forEach(i -> executor.submit(SynchronizedExample::increment));

        ConcurrentUtils.stop(executor);

        System.out.println("NonSync: " + count);
    }

    private static synchronized void incrementSync() {
        count = count + 1;
    }

    private static void increment() {
        count = count + 1;
    }
}
