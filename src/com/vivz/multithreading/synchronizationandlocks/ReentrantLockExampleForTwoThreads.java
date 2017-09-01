package com.vivz.multithreading.synchronizationandlocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLockExampleForTwoThreads Class is an Example
 * of Lock with tryLock().
 *
 * The method tryLock() as an alternative to lock() tries
 * to acquire the lock without pausing the current thread.
 * The boolean result must be used to check if the lock has
 * actually been acquired before accessing any shared mutable
 * variables.
 *
 * Created by vivekdwivedi on 9/1/2017.
 */
public class ReentrantLockExampleForTwoThreads {

    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args){
        testLock();
    }

    /**
     * testLock() Methods Checks Lock
     *
     * While the first task holds the lock for one second the
     * second task obtains different information about the
     * current state of the lock:
     */
    private static void testLock(){
        ExecutorService lExecutorService = Executors.newFixedThreadPool(2);

        lExecutorService.submit(() -> {
           lock.lock();
           try{
               ConcurrentUtils.sleep(1);
           }finally {
               lock.unlock();
           }
        });

        lExecutorService.submit(() -> {
            System.out.println("Locked :: "+lock.isLocked());
            System.out.println("Held By Me :: "+lock.isHeldByCurrentThread());
            boolean locked = lock.tryLock();
            System.out.println("Lock Acquired :: "+locked);
        });

        ConcurrentUtils.stop(lExecutorService);
    }
}
