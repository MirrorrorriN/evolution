package com.mirror.evolution.applet.concurrent.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class ListDemo {
    /**
     * 动态数组
     * 线程不安全 线程安全可使用Vector/CopyOnWriteArrayList/Collections.SynchronizedList
     * Collections.SynchronizedList 类比 Collections.SynchronizedMap mutex上锁
     * Stack为Vector的子类
     */
    List<Integer> arrayList=new ArrayList<>();
    /**
     * 双向链表 JDK1.6-为循环链表 JDK1.7取消了循环
     * 线程不安全 线程安全可使用ConcurrentLinkedQueue
     */
    List<Integer> linkedList=new LinkedList<>();
    List<Integer> concurrentList=new CopyOnWriteArrayList<>();
}
