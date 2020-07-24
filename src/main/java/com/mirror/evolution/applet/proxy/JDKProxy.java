package com.mirror.evolution.applet.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by mirrordingjing @ 2020/7/20
 * 基于JDK的动态代理
 * 运行时生成字节码 生成效率较快
 * 执行时基于原生反射API 效率低于cglib
 * 可代理未实现接口的类
 * spring默认使用jdk动态代理，如果类没有接口，则使用cglib
 */
public class JDKProxy implements InvocationHandler {

    private Object object;

    public JDKProxy(){}

    public JDKProxy(Object object) {
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
        //可以认为proxyHello代理了invocationHandler,invocationHandler代理了hello（看生成代码中invoke调用）
        InvocationHandler invocationHandler=new JDKProxy(hello);
        HelloInterface proxyHello = (HelloInterface) Proxy
                .newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), invocationHandler);
        proxyHello.sayHello("hello");

        HelloInterface proxyHello1=(HelloInterface)new JDKProxy().bind(new HelloService());
        proxyHello1.sayHello("proxy");

    }
}
