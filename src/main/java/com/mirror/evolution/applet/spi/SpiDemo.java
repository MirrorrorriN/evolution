package com.mirror.evolution.applet.spi;

import java.util.ServiceLoader;

/**
 * Created by mirrordingjing @ 2020/5/12
 */
public class SpiDemo {
    public static final void main(String[] args) {
        ServiceLoader<DessertService> serviceLoader = ServiceLoader.load(DessertService.class);
        for (DessertService dessertService : serviceLoader) {
            dessertService.serve();
        }
    }
}
