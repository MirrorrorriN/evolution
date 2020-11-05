package com.mirror.evolution.applet.designPattern.observer;

/**
 * Created by mirrordingjing @ 2020/7/30
 */
public abstract class Observer {
    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
