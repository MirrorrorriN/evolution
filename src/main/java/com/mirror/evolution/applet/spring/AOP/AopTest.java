package com.mirror.evolution.applet.spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mirrordingjing @ 2020/8/19
 */
public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        annotationConfigApplicationContext.start();
        IndexDao bean = annotationConfigApplicationContext.getBean(IndexDao.class);
        bean.query();

    }

}
