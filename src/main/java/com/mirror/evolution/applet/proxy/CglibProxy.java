package com.mirror.evolution.applet.proxy;

import com.mirror.evolution.applet.service.CakeService;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by mirrordingjing @ 2020/7/22
 * Cglib动态代理
 * 基于ASM框架运行时生成字节码 生成字节码较慢
 * 基于fastClass机制调用执行效率高 比较适合单例模式
 * 代理未实现接口的类
 * spring默认使用jdk动态代理，如果类没有接口，则使用cglib
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("enhance!");
        Object object = methodProxy.invokeSuper(o, args);
        return object;
    }

    public static void main(String[] args){
        //在指定目录下生成动态代理类，我们可以反编译看一下里面到底是一些什么东西
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/didi/didi/git/evolution/com/sun/proxy/cglib");
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(CakeService.class);
        //设置回调函数
        enhancer.setCallback(new CglibProxy());
        //这里的create方法就是正式创建代理类
        CakeService proxyCake = (CakeService) enhancer.create();
        //调用代理类的eat方法
        proxyCake.serve();
    }
}
