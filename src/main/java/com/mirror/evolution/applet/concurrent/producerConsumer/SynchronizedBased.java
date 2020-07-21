package com.mirror.evolution.applet.concurrent.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by mirrordingjing @ 2020/7/5
 */
public class SynchronizedBased {
    public static final int MAX_LEN=10;
    private Queue<Integer> buffer=new LinkedList<>();
    class Producer extends Thread{
        @Override
        public void run(){
            while(true){
                synchronized (buffer){
                    while(buffer.size()==MAX_LEN){
                        System.out.println("当前队列已满");
                        try{
                            buffer.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    Random random=new Random();
                    int product=random.nextInt();
                    buffer.add(product);
                    buffer.notifyAll();
                    System.out.println("produce: "+product+" [size] "+buffer.size());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    class Consumer extends Thread{
        @Override
        public void run(){
            while(true){
                synchronized (buffer){
                    while(buffer.size()==0){
                        System.out.println("当前队列为空");
                        try{
                            buffer.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("consume: "+buffer.poll()+" [size] "+buffer.size());
                    buffer.notifyAll();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        SynchronizedBased pc=new SynchronizedBased();
        Producer producer=pc.new Producer();
        Consumer consumer=pc.new Consumer();
        producer.start();
        consumer.start();
    }
}
