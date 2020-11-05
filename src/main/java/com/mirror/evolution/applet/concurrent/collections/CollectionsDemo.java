package com.mirror.evolution.applet.concurrent.collections;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by mirrordingjing @ 2020/7/6
 */
public class CollectionsDemo {
    public static void traverse(List<String> list){
        for(String item:list){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        List<String> alphabets= Lists.newArrayList("coconut","apple","banana","pineapple");
        //对每一位使用生成的随机数位与当前位交换
        Collections.shuffle(alphabets);
        traverse(alphabets);
        Collections.sort(alphabets, (String o1,String o2)-> {
            return 0;
        });
        traverse(alphabets);
        Collections.reverse(alphabets);
        traverse(alphabets);
        Collections.min(alphabets);
    }
}
