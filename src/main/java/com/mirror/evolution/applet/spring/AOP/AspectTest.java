package com.mirror.evolution.applet.spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by mirrordingjing @ 2020/8/19
 * 当方法符合切点规则不符合环绕通知的规则时候，执行的顺序如下
 *
 * @Before→@After→@AfterRunning(如果有异常→@AfterThrowing)
 *
 * 当方法符合切点规则并且符合环绕通知的规则时候，执行的顺序如下
 *
 * @Around→@Before→@Around执行 ProceedingJoinPoint.proceed() 之后的操作→@After→@AfterRunning(如果有异常→@AfterThrowing)
 */
@Component
@Aspect
@Order(1)
public class AspectTest {

    @Pointcut(value = "execution( * com.mirror.evolution.applet.spring.AOP.IndexDao.query(..))")
    public void point(){
    }

    @Before("point()")
    public void before(){
        System.out.println("before");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around before");
        joinPoint.proceed();
        System.out.println("around end");

    }

    @After("point()")
    public void after() throws InterruptedException {
//        Thread.sleep(1000);
        System.out.println("after");
    }

    @AfterReturning("point()")
    public void afterReturn(){
        System.out.println("after return");
    }

    @AfterThrowing("point()")
    public void afterThrow(){
        System.out.println("after throw");
    }
}
