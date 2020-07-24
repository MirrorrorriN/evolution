package com.mirror.evolution.applet.service;

import com.mirror.evolution.applet.service.impl.DessertService;

/**
 * Created by mirrordingjing @ 2020/5/12
 */
public class IceCreamService implements DessertService {
    @Override
    public void serve(){
        System.out.println("serve ice cream");
    }
}
