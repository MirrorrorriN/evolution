package com.mirror.evolution.domain;

/**
 * Created by mirrordingjing @ 2019/9/27
 */
public class Dog {
    public String hello() {
        return "wow wow";
    }

    public static void main(String[] args) {
        System.out.println(new Dog().hello());
    }
}

