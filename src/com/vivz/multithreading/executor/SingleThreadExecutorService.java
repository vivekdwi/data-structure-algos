package com.vivz.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SingleThreadExecutorService Class is an example
 * of Executor Service for SingleThreadPool Using
 * Lambda Expression
 *
 * the java process never stops! Executors have to
 * be stopped explicitly - otherwise they keep listening
 * for new task
 *
 * Created by vivekdwivedi on 8/30/2017.
 */
public class SingleThreadExecutorService {

    public static void main(String[] args){
        ExecutorService lExecutorService = Executors.newSingleThreadExecutor();
        lExecutorService.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello :: "+threadName);
        });
    }
}
