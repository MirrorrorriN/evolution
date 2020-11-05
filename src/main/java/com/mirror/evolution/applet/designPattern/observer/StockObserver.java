package com.mirror.evolution.applet.designPattern.observer;

/**
 * Created by mirrordingjing @ 2020/7/30
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction()+" 关闭股票，继续工作");
    }
}
