package com.mirror.evolution.applet.spring.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by mirrordingjing @ 2020/8/19
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.mirror.evolution.applet.spring.AOP")
public class AopConfig {
}
