package com.vivz.multithreading.producerconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link ProducerConsumerProblemWithWaitAndNotify} class is a Test Class
 * to test Producer Consumer Problem Using Wait, Notify and NotifyAll
 *
 * Created by vivekdwivedi on 10/15/2017.
 */
public class ProducerConsumerProblemWithWaitAndNotify {
    public static void main(String[] args) {
        List<Integer> taskQueue = new ArrayList<>();
        int MAX_CAPACITY = 5;
        Thread producerThread = new Thread(new ProducerClass(taskQueue, MAX_CAPACITY), "Producer");
        Thread consumerThread = new Thread(new ConsumerClass(taskQueue), "Consumer");
        producerThread.start();
        consumerThread.start();
    }
}
