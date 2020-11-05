package com.mirror.evolution.applet.concurrent.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by mirrordingjing @ 2020/7/5
 */
public class LockBased {
    public static final int MAX_LEN = 10;
    private Queue<Integer> buffer = new LinkedList<>();
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    class Producer extends Thread {
        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    while (buffer.size() == MAX_LEN) {
                        System.out.println("当前队列已满");
                        try {
                            condition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Random random = new Random();
                    int product = random.nextInt();
                    buffer.add(product);
                    condition.signalAll();
                    System.out.println("produce: " + product + " [size] " + buffer.size());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    lock.unlock();
                }

            }
        }
    }

    class Consumer extends Thread {
        @Override
        public void run() {
            while (true) {
                lock.lock();
//                System.out.println("after lock"+this.getState().name());
                try {
                    while (buffer.size() == 0) {
                        System.out.println("当前队列为空");
                        try {
                            condition.await();
//                            System.out.println("after await"+this.getState().name());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("consume: " + buffer.poll() + " [size] " + buffer.size());
                    condition.signalAll();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {
        LockBased pc = new LockBased();
        Producer producer = pc.new Producer();
        Consumer consumer = pc.new Consumer();
        producer.start();
        consumer.start();
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //尝试获取lock会使线程进入 BLOCKED状态 await()也与wait()类似会使线程进入WAITING状态
            System.out.println("[producer]" + producer.getState().name());
            System.out.println("[consumer]" + consumer.getState().name());
        }
    }
}
