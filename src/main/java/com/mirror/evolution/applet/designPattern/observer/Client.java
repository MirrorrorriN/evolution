package com.mirror.evolution.applet.designPattern.observer;

/**
 * Created by mirrordingjing @ 2020/7/30
 */
public class Client {
    public static void main(String[] args) {
        Subject secretary = new Secretary();
        Observer alice = new StockObserver("alice", secretary);
        secretary.attach(alice);
        secretary.setAction("小心boss回来了");
        secretary.notifyObservers();
    }
}
