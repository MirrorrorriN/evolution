package com.mirror.evolution.applet.designPattern.observer;

/**
 * Created by mirrordingjing @ 2020/7/30
 */
public interface Subject {
    //新增观察者
    public void attach(Observer observer);
    //删除观察者
    public void detach(Observer observer);
    //通知
    public void notifyObservers();

    //状态
    public void setAction(String action);
    public String getAction();
}
