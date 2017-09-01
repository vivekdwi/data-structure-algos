package com.vivz.multithreading.synchronizationandlocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

/**
 * {@link StampedLockWithTryConvertToWriteLock} Class is an Example
 * of StampedLock Mechanism with tryConvertToWriteLock().
 *
 * The task first obtains a read lock and prints the current value
 * of field count to the console. But if the current value is zero
 * we want to assign a new value of 23. We first have to convert the
 * read lock into a write lock to not break potential concurrent access
 * by other threads. Calling tryConvertToWriteLock() doesn't block but
 * may return a zero stamp indicating that no write lock is currently
 * available. In that case we call writeLock() to block the current
 * thread until a write lock is available.
 *
 * Created by vivekdwivedi on 9/1/2017.
 */
public class StampedLockWithTryConvertToWriteLock {
    private static StampedLock mLock = new StampedLock();
    private static int mCount = 0;
    public static void main(String[] args){
        testStampedLock();
    }

    /**
     * testStampedLock Method handles locking and unLocking
     * mechanism using StampedLock with tryConvertToWriteLock()
     */
    private static void testStampedLock(){
        ExecutorService lExecutorService = Executors.newFixedThreadPool(2);
        lExecutorService.submit(() -> {
            long lStamp = mLock.readLock();
            try {
                if(mCount == 0){
                    lStamp = mLock.tryConvertToWriteLock(lStamp);
                    if(lStamp == 0L){
                        System.out.println("Could not convert to write lock");
                        lStamp = mLock.writeLock();
                    }
                    mCount = 23;
                }
                System.out.println("Count :: "+mCount);
            }finally {
                mLock.unlock(lStamp);
            }
        });

        ConcurrentUtils.stop(lExecutorService);
    }
}
