package com.vivz.multithreading.synchronizationandlocks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * {@link ReadWriteLockExample} Class is an Example that
 * first acquires a write-lock in order to put a new value
 * to the map after sleeping for one second. Before this task
 * has finished two other tasks are being submitted trying to
 * read the entry from the map and sleep for one second:
 *
 * The interface ReadWriteLock specifies another type of lock
 * maintaining a pair of locks for read and write access. The
 * idea behind read-write locks is that it's usually safe to
 * read mutable variables concurrently as long as nobody is
 * writing to this variable. So the read-lock can be held
 * simultaneously by multiple threads as long as no threads hold
 * the write-lock. This can improve performance and throughput in
 * case that reads are more frequent than writes.
 *
 * When you execute this code sample you'll notice that both read
 * tasks have to wait the whole second until the write task has
 * finished. After the write lock has been released both read tasks
 * are executed in parallel and print the result simultaneously to the
 * console. They don't have to wait for each other to finish because
 * read-locks can safely be acquired concurrently as long as no write-lock
 * is held by another thread.
 *
 * Created by vivekdwivedi on 9/1/2017.
 */
public class ReadWriteLockExample {
    private static ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args){
        testReadWriteLock();
    }

    /**
     * testReadWriteLock() acquires the Write Lock First
     * to write data in map then Read Lock read the data
     * from map
     */
    private static void testReadWriteLock(){
        ExecutorService lExecutorService = Executors.newFixedThreadPool(2);
        Map<String,String> lMap = new HashMap<>();

        lExecutorService.submit(() -> {
            lock.writeLock().lock();
           try{
               ConcurrentUtils.sleep(1);
               lMap.put("foo","bar");
           }finally {
               lock.writeLock().unlock();
           }
        });

        Runnable readTask = () -> {
          lock.readLock().lock();
          try{
              System.out.println(lMap.get("foo"));
              ConcurrentUtils.sleep(1);
          }finally {
              lock.readLock().unlock();
          }
        };

        lExecutorService.submit(readTask);
        lExecutorService.submit(readTask);

        ConcurrentUtils.stop(lExecutorService);
    }
}
