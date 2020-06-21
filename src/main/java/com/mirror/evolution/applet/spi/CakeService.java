package com.mirror.evolution.applet.spi;

/**
 * Created by mirrordingjing @ 2020/5/12
 */
public class CakeService implements DessertService {
    @Override
    public void serve() {
        System.out.println("serve cake");
    }
}
