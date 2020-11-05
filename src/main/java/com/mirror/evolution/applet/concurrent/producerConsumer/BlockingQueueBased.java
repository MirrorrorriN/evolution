package com.mirror.evolution.applet.concurrent.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by mirrordingjing @ 2020/7/5
 */
public class BlockingQueueBased {
    public static final int MAX_LEN = 10;
    private BlockingQueue<Integer> buffer = new LinkedBlockingDeque<>(10);

    class Producer extends Thread {
        @Override
        public void run() {
            while (true) {
                Random random = new Random();
                int product = random.nextInt(100)+50;
                try {
                    buffer.put(product);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("produce: " + product + " [size] " + buffer.size());
                try {
                    //注意此处不可设固定值，否则生产/消费方会一直交替进行？
                    //blockQueue中put方法 lock.lockInterruptibly() 非抢占式锁，等待其他线程释放
                    Thread.sleep(new Random().nextInt(1000)+500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("consume: " + buffer.take() + " [size] " + buffer.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    //注意此处不可设固定值，否则生产/消费方会一直交替进行？
                    Thread.sleep(new Random().nextInt(1000)+500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        BlockingQueueBased pc = new BlockingQueueBased();
        Producer producer = pc.new Producer();
        Thread consumer = new Thread(pc.new Consumer());
        producer.start();
        consumer.start();
    }
}
