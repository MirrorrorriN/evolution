package com.mirror.evolution.applet.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by mirrordingjing @ 2020/7/20
 * 基于JDK的动态代理
 */
public class HelloProxyHandler implements InvocationHandler {

    private Object object;

    public HelloProxyHandler(){}

    public HelloProxyHandler(Object object) {
        this.object = object;
    }

    public Object bind(Object object){
        this.object=object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke " + method.getName());
        method.invoke(object, args);
        System.out.println("after invoke " + method.getName());
        return null;
    }

    public static void main(String[] args){
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloInterface hello=new HelloService();
        InvocationHandler invocationHandler=new HelloProxyHandler(hello);
        HelloInterface proxyHello = (HelloInterface) Proxy
                .newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), invocationHandler);
        proxyHello.sayHello("hello");

        HelloInterface proxyHello1=(HelloInterface)new HelloProxyHandler().bind(new HelloService());
        proxyHello1.sayHello("proxy");

    }
}
