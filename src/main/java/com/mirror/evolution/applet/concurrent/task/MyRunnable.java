package com.mirror.evolution.applet.concurrent.task;

/**
 * Created by mirrordingjing @ 2020/6/21
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start(); // 启动新线程

    }
}
