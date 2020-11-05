package com.mirror.evolution.applet.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringTest {
    SpringApplication application=new SpringApplication(SpringTest.class);

}
