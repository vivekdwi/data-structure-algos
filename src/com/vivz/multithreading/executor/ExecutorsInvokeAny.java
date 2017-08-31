package com.vivz.multithreading.executor;

import com.vivz.multithreading.synchronizationandlocks.ConcurrentUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ExecutorsInvokeAny Class is an Example of Executors
 * invokeAny() using Lambda Expression
 *
 * Executors invokeAny() which works slightly different to invokeAll().
 * Instead of returning future objects this method blocks
 * until the first callable terminates and returns the
 * result of that callable.
 *
 *
 * Created by vivekdwivedi on 8/30/2017.
 */
public class ExecutorsInvokeAny {
    public static void main(String[] args){
        ExecutorService lExecutorService = Executors.newWorkStealingPool();
        List<Callable<String>> lCallables = Arrays.asList(
                callable("Task1",2),
                callable("Task2",1),
                callable("Task3",3)
        );
        try{
            String result = lExecutorService.invokeAny(lCallables);
            System.out.println("Result :: "+result);
        }catch (InterruptedException | ExecutionException exp){
            System.err.println(exp.getLocalizedMessage());
        }
    }

    /**
     * We use this method to create a bunch of callables with different
     * durations from one to three seconds. Submitting those callables
     * to an executor via invokeAny() returns the string result of the
     * fastest callable - in that case task2:
     *
     * @param result
     * @param sleepSeconds
     * @return
     */
    protected static Callable<String> callable(String result, long sleepSeconds){
        return () -> {
            ConcurrentUtils.sleep((int)sleepSeconds);
            return result;
        };
    }
}
