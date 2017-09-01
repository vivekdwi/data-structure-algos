package com.vivz.multithreading.synchronizationandlocks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

/**
 * {@link StampedLockExample} Class is an Example of
 * StampedLock Locking Mechanism
 *
 * Java 8 ships with a new kind of lock called StampedLock
 * which also support read and write locks just like in the
 * example above. In contrast to ReadWriteLock the locking
 * methods of a StampedLock return a stamp represented by a
 * long value. You can use these stamps to either release a
 * lock or to check if the lock is still valid. Additionally
 * stamped locks support another lock mode called optimistic
 * locking.
 *
 * Obtaining a read or write lock via readLock() or writeLock()
 * returns a stamp which is later used for unlocking within the
 * finally block. Keep in mind that stamped locks don't implement
 * reentrant characteristics. Each call to lock returns a new stamp
 * and blocks if no lock is available even if the same thread already
 * holds a lock. So you have to pay particular attention not to run
 * into deadlocks.
 *
 * Just like in the previous ReadWriteLock example both read tasks have
 * to wait until the write lock has been released. Then both read tasks
 * print to the console simultaneously because multiple reads doesn't block
 * each other as long as no write-lock is held.
 *
 * Created by vivekdwivedi on 9/1/2017.
 */
public class StampedLockExample {
    private static StampedLock lock = new StampedLock();

    public static void main(String[] args){
        testStampedLock();
    }

    /**
     * testStampedLock Method handles locking and unLocking
     * mechanism using StampedLock
     */
    private static void testStampedLock(){
        ExecutorService lExecutorService = Executors.newFixedThreadPool(2);
        Map<String,String> lMap = new HashMap<>();

        lExecutorService.submit(() ->{
            long lStamp = lock.writeLock();
            try{
                ConcurrentUtils.sleep(1);
                lMap.put("foo","bar");
            }finally {
                lock.unlockWrite(lStamp);
            }
        });

        Runnable readTask = () -> {
            long lStamp = lock.readLock();
            try{
                System.out.println(lMap.get("foo"));
                ConcurrentUtils.sleep(1);
            }finally {
                lock.unlockRead(lStamp);
            }
        };

        lExecutorService.submit(readTask);
        lExecutorService.submit(readTask);
        ConcurrentUtils.stop(lExecutorService);
    }
}
