package com.mirror.evolution.applet.classLoader;

import apple.laf.AquaLookAndFeel;
import sun.net.spi.nameservice.dns.DNSNameService;

/**
 * Created by mirrordingjing @ 2020/5/10
 */
public class ClassLoaderDemo {
    public static final void main(String[] args){
        ClassLoader classLoader=Object.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println("=================================");

        classLoader=AquaLookAndFeel.class.getClassLoader();
        System.out.println(classLoader);
//        System.out.println(classLoader.getParent());
        System.out.println("=================================");

        classLoader=DNSNameService.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println("=================================");

        classLoader=ClassLoaderDemo.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
