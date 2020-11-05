package com.mirror.evolution.applet.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mirrordingjing @ 2020/7/30
 */
public class Secretary implements Subject {

    private List<Observer> observers=new ArrayList<>();

    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update();
        }
    }

    @Override
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return this.action;
    }
}
