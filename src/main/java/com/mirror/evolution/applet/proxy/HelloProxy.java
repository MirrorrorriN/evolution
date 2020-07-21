package com.mirror.evolution.applet.proxy;

/**
 * Created by mirrordingjing @ 2020/7/20
 * 静态代理
 */
public class HelloProxy implements HelloInterface {
    private HelloInterface helloInterface = new HelloService();

    public void sayHello(String name) {
        System.out.println("before invoke sayHello");
        helloInterface.sayHello(name);
        System.out.println("after invoke sayHello");
    }

    public static void main(String[] args){
        HelloProxy proxy=new HelloProxy();
        proxy.sayHello("proxy");
    }
}
