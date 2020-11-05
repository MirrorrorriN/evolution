package com.mirror.evolution.applet.spring.AOP;

import org.springframework.stereotype.Component;

/**
 * Created by mirrordingjing @ 2020/8/19
 */
@Component
public class IndexDao {
    public void query(){
        System.out.println("dao----query");
    }
}
