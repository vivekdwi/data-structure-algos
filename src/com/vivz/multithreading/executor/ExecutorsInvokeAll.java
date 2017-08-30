package com.vivz.multithreading.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ExecutorsInvokeAll Class is an Example of Executors invokeAll Method.
 * Here we have used Stream API in order to process all futures returned
 * by the invocation of invokeAll().
 *
 * Executors support batch submitting of multiple callables at once via
 * invokeAll(). This method accepts a collection of callables and returns
 * a list of futures.
 *
 * Created by vivekdwivedi on 8/30/2017.
 */
public class ExecutorsInvokeAll {
    public static void main(String[] args){
        ExecutorService lExecutorService = Executors.newWorkStealingPool();
        List<Callable<String>> lCallables = Arrays.asList(
                () -> "task1",
                () -> "task2",
                () -> "task3"
        );

        try{
            lExecutorService.invokeAll(lCallables)
                    .stream()
                    .map(future -> {
                        try{
                            return future.get();
                        }catch (Exception exp){
                            throw new IllegalStateException(exp);
                        }
                    })
                    .forEach(System.out :: println);
        }catch (InterruptedException exp){
            System.err.println(exp.getLocalizedMessage());
        }
    }
}
