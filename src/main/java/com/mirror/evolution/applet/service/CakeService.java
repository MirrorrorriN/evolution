package com.mirror.evolution.applet.service;

import com.mirror.evolution.applet.service.impl.DessertService;

/**
 * Created by mirrordingjing @ 2020/5/12
 */
public class CakeService implements DessertService {

    private String dishName = "cake";

    @Override
    public void serve() {
        System.out.println(this.getServe());
    }

    private String getServe() {
        return "serve" + dishName;
    }
}
