package com.vivz.multithreading.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * CallableFunctionalInterface Class is An Example Of
 * Callable Functional Interface Using Lambda and Future
 * Concepts
 *
 * Callables are functional interfaces just like runnables
 * but instead of being void they return a value.
 *
 * Future which can be used to retrieve the actual result
 * at a later point in time.
 *
 * Created by vivekdwivedi on 8/30/2017.
 */
public class CallableFunctionalInterface {
    public static void main(String[] args){
        Callable<Integer> task = () -> {
            try{
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }catch (InterruptedException exp){
                System.err.println(exp.getLocalizedMessage());
                throw new IllegalStateException("task interrupted", exp);
            }
        };

        ExecutorService lExecutorService = Executors.newFixedThreadPool(1);
        Future<Integer> lFuture = lExecutorService.submit(task);
        System.out.println("Is future Done ? :: "+lFuture.isDone());
        try {

            Integer result = lFuture.get(1,TimeUnit.SECONDS);
            System.out.println("Is Future Done ? :: "+lFuture.isDone());
            System.out.println("Result :: "+result);
            lExecutorService.shutdown();
        }catch (InterruptedException | ExecutionException | TimeoutException exp){
            System.err.println(exp.getLocalizedMessage());
        }

    }
}
