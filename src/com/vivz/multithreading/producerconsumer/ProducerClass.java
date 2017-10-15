package com.vivz.multithreading.producerconsumer;

import java.util.List;

/**
 * {@link ProducerClass} class is an Example of
 * Producer Thread which produces data or message
 * in sharedQueue using Wait, Notify and NotifyAll
 *
 * Created by vivekdwivedi on 10/15/2017.
 */
public class ProducerClass implements Runnable{

    private final List<Integer> taskQueue;
    private final int MAX_CAPACITY;

    ProducerClass(List<Integer> sharedQueue, int size){
        this.taskQueue = sharedQueue;
        this.MAX_CAPACITY = size;
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        int counter = 0;
        while (true){
            try {
                produce(counter++);
            }catch (InterruptedException exp){
                exp.printStackTrace();
            }
        }
    }

    /**
     * produce() produces the data in Shared Queue
     *
     * @param data
     * @throws InterruptedException
     */
    private void produce(int data) throws InterruptedException{
        synchronized (taskQueue){
            while (taskQueue.size() == MAX_CAPACITY){
                System.out.println("Queue is Full : "+Thread.currentThread().getName()+" is waiting, Size : "+taskQueue.size());
                taskQueue.wait();
            }
            Thread.sleep(1000);
            taskQueue.add(data);
            System.out.println("Produced :: "+data);
            taskQueue.notifyAll();
        }
    }
}
