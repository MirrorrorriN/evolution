package com.mirror.evolution.applet.designPattern.singleton;

/**
 * 登记式/静态内部类
 * 线程安全
 * 静态域的延迟初始化
 * Holder方式
 */
public class Singleton1 {
    private static class SingletonHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }
    private Singleton1(){}

    public static final Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
