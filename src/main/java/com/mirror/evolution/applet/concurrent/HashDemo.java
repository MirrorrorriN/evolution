package com.mirror.evolution.applet.concurrent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mirrordingjing @ 2020/7/22
 */
public class HashDemo {
    public static void main(String[] args){
        Set<Integer> hashSet=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> concurrentMap=new ConcurrentHashMap<>();
        for(int i=0;i<10;i++){
            concurrentMap.put(i,(int)Math.pow(2,i));
        }

    }
}
