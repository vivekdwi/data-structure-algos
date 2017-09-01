package com.vivz.multithreading.producerconsumer;

import com.vivz.multithreading.synchronizationandlocks.ConcurrentUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * {@link ProducerConsumerUsingFunctionalInterface} Class is
 * an Example of Producer Consumer Problem Using Functional
 * Interfaces and Functional Programming.
 *
 * The idea is to make use of java.util.function.Supplier and
 * java.util.function.Consumer interfaces.
 *
 * The former will be responsible for creating the object and
 * passing it to the producer thread to be put in the queue and
 * the latter for consuming that object when the consumer thread
 * retrieves it from the queue
 *
 * As a consequence of this approach the logic of creating and consuming
 * the queue’s elements will not reside in the threads but passed to them
 * as functions.
 *
 * Created by vivekdwivedi on 9/1/2017.
 */
public class ProducerConsumerUsingFunctionalInterface {

    private static final int MSG_NBR = 10;
    private final BlockingQueue<String> mQueue = new ArrayBlockingQueue<String>(10);

    public static void main(String[] args){
        new ProducerConsumerUsingFunctionalInterface().startEngine();
    }

    public void startEngine(){
        startProducer();
        startConsumer();
    }

    /**
     * startProducer() is a simple implementation of the Supplier
     * functional interface, which returns a “Hello World” message
     * is created and passed to the produce() method.
     *
     * The thread is created with Lambda expressions, this way the
     * MyProducer and MyConsumer classes don’t have to implement the
     * Runnable interface The producer will produce a number of messages
     * hence the loop.
     */
    private void startProducer(){
        final MyProducer<String> lMyProducer = new MyProducer<>(mQueue);
        final Supplier<String> lSupplier = () -> "Hello World";
        ExecutorService lExecutorService = Executors.newFixedThreadPool(1);
        lExecutorService.submit(() -> {
            IntStream.range(0,MSG_NBR).forEach(id -> {
                lMyProducer.produce(lSupplier);
            });
        });
        ConcurrentUtils.stop(lExecutorService);
    }

    /**
     * startConsumer() a simple implementation of the Consumer functional
     * interface, which displays the message is created and passed to the
     * consume() method. The consumer will consume the produced messages
     * inside the loop.
     */
    private void startConsumer(){
        final MyConsumer<String> lMyConsumer = new MyConsumer<>(mQueue);
        final Consumer<String> lConsumer = (msg) -> System.out.println("Consumed Message :: "+msg);
        ExecutorService lExecutorService = Executors.newFixedThreadPool(1);
        lExecutorService.submit(() -> {
            IntStream.range(0,MSG_NBR).forEach(id -> {
                lMyConsumer.consume(lConsumer);
            });
        });
        ConcurrentUtils.stop(lExecutorService);
    }

    /**
     * {@link MyProducer} Class is Producer Inner Class
     * for Producer Consumer Problem.
     *
     * @param <T>
     */
    static class MyProducer<T>{
        private BlockingQueue<T> lQueue;

        public MyProducer(BlockingQueue<T> pQueue){
            this.lQueue = pQueue;
        }

        /**
         * produce() method accepts an argument of type Supplier,
         * this functional interface is responsible for creating
         * and returning an object of type T with its get() method.
         *
         * @param pSupplier
         */
        public void produce(Supplier<T> pSupplier){
            final T lMsg = pSupplier.get();
            try {
                lQueue.put(lMsg);
                System.out.println("Added Message :: "+lMsg);
                ConcurrentUtils.sleep(9);
            }catch (InterruptedException exp){
                throw new RuntimeException(exp);
            }
        }
    }

    /**
     * {@link MyConsumer} Class is Consumer Inner Class
     * for Producer Consumer Problem.
     *
     * @param <T>
     */
    static class MyConsumer<T>{
        private BlockingQueue<T> lQueue;

        public MyConsumer(BlockingQueue<T> pQueue){
            this.lQueue = pQueue;
        }

        /**
         * consume() method receives an argument or type Consumer,
         * this functional interface will contain the logic to consume
         * the retrieved element.
         *
         * @param pConsumer
         */
        public void consume(java.util.function.Consumer<T> pConsumer){
            try {
                pConsumer.accept(lQueue.take());
                ConcurrentUtils.sleep(12);
            }catch (InterruptedException exp){
                throw new RuntimeException(exp);
            }
        }
    }
}
