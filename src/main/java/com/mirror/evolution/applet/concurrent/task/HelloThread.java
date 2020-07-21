package com.mirror.evolution.applet.concurrent.task;

/**
 * Created by mirrordingjing @ 2020/6/23
 */
public class HelloThread extends Thread{
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
