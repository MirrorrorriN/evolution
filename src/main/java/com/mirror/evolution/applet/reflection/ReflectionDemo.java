package com.mirror.evolution.applet.reflection;

import com.mirror.evolution.applet.service.CakeService;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by MirrorrorriN @ 2020/7/17
 */
public class ReflectionDemo {
    public static void main(String[] main) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //获取类信息的三种方法
        Class<?> clazz = Class.forName("com.mirror.evolution.applet.service.CakeService");
        //Class<?> clazz = cakeService.getClass();
//        Class<?> clazz=CakeService.class;

        Object obj = clazz.newInstance();
        //获取所有public方法 包含父类中方法
        Method method = clazz.getMethod("serve");
        method.invoke(obj);
        //获取该为右所有public,protected,private,default方法，不包含父类方法
        method = clazz.getDeclaredMethod("getServe");
        method.setAccessible(true);
        System.out.println(method.invoke(obj));
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.get(obj));
        }
    }
}
