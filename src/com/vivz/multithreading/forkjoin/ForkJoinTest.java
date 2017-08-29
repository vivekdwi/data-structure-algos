package com.vivz.multithreading.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by vivekdwivedi on 8/29/2017.
 */
public class ForkJoinTest {

    public static void main(String[] args){
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        System.out.println("**** Fork-Join Recursive Action Starts ****");
        MyRecursiveAction lMyRecursiveAction = new MyRecursiveAction(26);
        forkJoinPool.invoke(lMyRecursiveAction);
        System.out.println("**** Fork-Join Recursive Action Ends ****");

        System.out.println("**** Fork-Join Recursive Task Starts ****");
        MyRecursiveTask lMyRecursiveTask = new MyRecursiveTask(128);
        long mergedResult = forkJoinPool.invoke(lMyRecursiveTask);
        System.out.println("Merged result :: "+mergedResult);
        System.out.println("**** Fork-Join Recursive Task Ends ****");
    }
}
