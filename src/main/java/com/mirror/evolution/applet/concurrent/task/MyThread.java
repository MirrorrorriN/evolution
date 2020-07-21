package com.mirror.evolution.applet.concurrent.task;

/**
 * Created by mirrordingjing @ 2020/6/23
 */
public class MyThread extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.start(); // 启动hello线程
        try {
            hello.join(); // 等待hello线程结束
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
            hello.interrupt();
        }
//        hello.interrupt();

    }
    public static void main(String[] args) throws InterruptedException{
        Thread t = new MyThread();
        t.start(); // 启动新线程
        Thread.sleep(1000); // 暂停1毫秒
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }

}
