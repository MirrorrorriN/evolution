package com.mirror.evolution.applet.spi;

/**
 * Created by mirrordingjing @ 2020/5/12
 */
public class IceCreamService implements DessertService {
    @Override
    public void serve(){
        System.out.println("serve ice cream");
    }
}
