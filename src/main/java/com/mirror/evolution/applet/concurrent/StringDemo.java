package com.mirror.evolution.applet.concurrent;

/**
 * Created by mirrordingjing @ 2020/7/21
 */
public class StringDemo {
    public static void main(String[] args){
        // https://www.cnblogs.com/one12138/p/11379840.html
        // 不可变 安全性 hash缓存不必每次CRUD校验提高性能
        // 每次都要创建新变量 gc开销大
        String str0="hello";
        String str1="hello";
        // 用new创建时不校验对象是否存在
        String str2=new String("hello");
        System.out.println(str0==str1); //true
        System.out.println(str0==str2); //false
        System.out.println(str0.getBytes());
        System.out.println(str1.getBytes());
        System.out.println(str2.getBytes());
        str1=str0;
        str0="world";
        str2=new StringBuilder(str0).reverse().toString();
        System.out.println(str0);  //world
        System.out.println(str1);  //hello
        System.out.println(str2);
        //非线程安全
        StringBuilder stringBuilder=new StringBuilder();
        //方法无synchronized关键字
        stringBuilder.append("hello");
        //线程安全
        StringBuffer stringBuffer=new StringBuffer("hello");
        //方法有synchronized关键字
        stringBuffer.append("world");

        //大多数情况速度 StringBuilder>StringBuffer>String
        //build与buffer在此case下差距不明显，buffer中加了一道toStringCache优化，平衡了一部分锁性能带来的影响
        // 使用 String 进行字符拼接
        String str = "";
        long num1 = Runtime.getRuntime().freeMemory();// 获取系统剩余内存空间
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i; // 相当于产生了5000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String 占用了内存：" + (num1 - num2));
        System.out.println("String 占用了时间：" + (time2 - time1));

        // 使用 StringBuilder 进行字符串拼接
        StringBuilder sb = new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            synchronized (sb) {
                sb.append(i);
            }
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder 占用了内存：" + (num3 - num4));
        System.out.println("StringBuilder 占用了时间：" + (time4 - time3));

        // 使用 StringBuilder 进行字符串拼接
        StringBuffer sb2 = new StringBuffer("");
        long num5 = Runtime.getRuntime().freeMemory();
        long time5 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb2.append(i);
        }
        long num6 = Runtime.getRuntime().freeMemory();
        long time6 = System.currentTimeMillis();
        System.out.println("StringBuffer 占用了内存：" + (num5 - num6));
        System.out.println("StringBuffer 占用了时间：" + (time6 - time5));

        //intern() https://www.jianshu.com/p/0d1c003d2ff5
        // 常量池中已缓存 直接返回引用 未缓存 将字符串添加到常量池并返回引用
        // JDK8 常量池在堆上分配
        String s1 = new StringBuilder().append("String").append("Test").toString();
        System.out.println(s1.intern() == s1);  //true

        String s2 = new StringBuilder().append("ja").append("va").toString();
        System.out.println(s2.intern() == s2);  //false

    }
}
