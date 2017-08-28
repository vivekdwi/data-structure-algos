package com.vivz.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by vivekdwivedi on 8/28/2017.
 */
public class ThreadPoolExample {

    public static void main(String[] args){
        ExecutorService lExecutorService = Executors.newFixedThreadPool(10);
        for(int i=0; i<100; i++){
            lExecutorService.submit(new Task(i));
        }
    }
}

final class Task implements Runnable{

    private int taskId;

    public Task(int id){
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task ID : "+this.taskId+" performed by "+Thread.currentThread().getName());
    }
}
