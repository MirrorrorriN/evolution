package com.mirror.evolution.applet.concurrent.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 是否线程安全
 * 是否允许null key/value
 * 快速失败（fail-fast）会抛出Concurrent Modification Exception 迭代中不能修改 java.util中的包都是fail-fast（HashTable是一种特殊case）
 * VS
 * 安全失败（fail-safe) 迭代时基于拷贝迭代 JUC中的包都使用安全失败
 * 锁性能
 */
public class MapDemo {
    //无同步措施，线程不安全，实现简单
    //拉链式 JDK1.8+ 大于8转为红黑树
    //允许null作为key/value hash()方法中特殊处理
    //resize size*2
    Map<Integer,Integer> hashMap=new HashMap<>();
    //方法直接加synchronized效率低 锁住对象 一个线程get,另一个线程其他所有方法也都不能进入
    //不可用null作为key/value
    //多个迭代器 Iterator 同样fail-fast Enumeration 类似fail-safe
    //锁方法
    //拉链 继承HashMap
    //resize size*2+1
    Map<Integer,Integer> hashTable=new Hashtable<>();
    //传入mutex加锁，默认锁传入的map
    //锁方法块
    Map<Integer,Integer> synchronizedMap=Collections.synchronizedMap(hashMap);
    //并发最常用 分段锁 性能优势
    // JDK1.7- segment ReentrantLock
    // JDK1.8 去除segment synchronized（其性能有很大优化）
    Map<Integer,Integer> concurrentHashMap=new ConcurrentHashMap<>();

}
