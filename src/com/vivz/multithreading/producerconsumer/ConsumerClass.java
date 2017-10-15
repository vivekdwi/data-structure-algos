package com.vivz.multithreading.producerconsumer;

import java.util.List;

/**
 * {@link ConsumerClass} is an Example of
 * Consumer Thread which consumes the data
 * from Shared Queue using Wait, Notify and
 * NotifyAll
 *
 * Created by vivekdwivedi on 10/15/2017.
 */
public class ConsumerClass implements Runnable{

    private final List<Integer> taskQueue;

    ConsumerClass(List<Integer> sharedQueue){
        this.taskQueue = sharedQueue;
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
        while (true){
            try {
                consume();
            }catch (InterruptedException exp){
                exp.printStackTrace();
            }
        }
    }

    /**
     * consume() consumes data from sharedQueue
     *
     * @throws InterruptedException
     */
    private void consume() throws InterruptedException{
        synchronized (taskQueue){
            while (taskQueue.isEmpty()){
                System.out.println("Queue is Empty :: "+Thread.currentThread().getName()+" is waiting, Size :: "+taskQueue.size());
                taskQueue.wait();
            }
            Thread.sleep(1000);
            int data = (Integer) taskQueue.remove(0);
            System.out.println("Consumed :: "+data);
            taskQueue.notifyAll();
        }
    }
}
