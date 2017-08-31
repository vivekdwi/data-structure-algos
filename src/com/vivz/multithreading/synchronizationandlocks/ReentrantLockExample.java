package com.vivz.multithreading.synchronizationandlocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * ReentrantLockExample Class is an Example of
 * Reentrant Lock Mechanism of Java Concurrency
 *
 * The class ReentrantLock is a mutual exclusion
 * lock with the same basic behavior as the implicit
 * monitors accessed via the synchronized keyword but
 * with extended capabilities. As the name suggests
 * this lock implements reentrant characteristics
 * just as implicit monitors.
 *
 * A lock is acquired via lock() and released via unlock().
 * It's important to wrap your code into a try/finally block
 * to ensure unlocking in case of exceptions. This method
 * is thread-safe just like the synchronized counterpart.
 * If another thread has already acquired the lock subsequent
 * calls to lock() pause the current thread until the lock has
 * been unlocked. Only one thread can hold the lock at any given
 * time.
 *
 * Created by vivekdwivedi on 8/31/2017.
 */
public class ReentrantLockExample {
    private static final int NUM_INCREMENTS = 10000;

    private static ReentrantLock lock = new ReentrantLock();

    private static int count = 0;

    public static void main(String args[]){
        testLock();
    }

    /**
     * testLock() implements ExecutorService
     */
    private static void testLock(){
        count = 0;
        ExecutorService lExecutorService = Executors.newFixedThreadPool(2);
        IntStream.range(0,NUM_INCREMENTS).forEach(i -> {
            lExecutorService.submit(ReentrantLockExample::increment);
        });
        ConcurrentUtils.stop(lExecutorService);
        System.out.println(count);
    }

    /**
     * increment() increments count using Lock Mechanism
     */
    private static void increment(){
        lock.lock();
        try{
            count ++;
        }finally {
            lock.unlock();
        }
    }
}
