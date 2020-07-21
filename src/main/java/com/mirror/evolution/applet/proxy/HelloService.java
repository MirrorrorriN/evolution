package com.mirror.evolution.applet.proxy;

/**
 * Created by mirrordingjing @ 2020/7/20
 */
public class HelloService implements HelloInterface {
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
