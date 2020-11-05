package com.mirror.evolution.applet.designPattern.singleton;

/**
 * DCL，即 double-checked locking 双检锁
 * 线程安全
 * 实例域的延迟初始化
 */
public class Singleton {

    //volatile避免指令重排
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
        Class<?> clazz = Singleton.class;
        try {
            Object obj = clazz.newInstance();
            Singleton singleton2 = (Singleton) clazz.newInstance();
            System.out.println(singleton.equals(singleton2));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
