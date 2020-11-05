package com.mirror.evolution.applet.concurrent.task;

import java.util.Optional;
import java.util.concurrent.CountDownLatch;

/**
 * Created by mirrordingjing @ 2020/6/21
 */
//共5个初始化子线程，6个闭锁扣除点，扣除完毕后，主线程和业务线程才能继续执行
public class CountDownLatchDemo {
    private static CountDownLatch latch = new CountDownLatch(6);

    /*业务线程等待latch的计数器为0完成*/
    private static class BusiThread implements Runnable{

        public void run() {
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i =0;i<3;i++) {
                System.out.println("BusiThread_"+Thread.currentThread().getId()
                        +" do business-----");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        new Thread(new BusiThread()).start();
        for(int i=0;i<=3;i++){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("Thread_"+Thread.currentThread().getId()
                            +" ready init work step 1st......");
                    latch.countDown();
                    System.out.println("begin step 2nd.......");
                    System.out.println("Thread_"+Thread.currentThread().getId()
                            +" ready init work step 2nd......");
                    latch.countDown();
                }
            }).start();
        }
        latch.await();
        System.out.println("Main do ites work........");
    }
}
