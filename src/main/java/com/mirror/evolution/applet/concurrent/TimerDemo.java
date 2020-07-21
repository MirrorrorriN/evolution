package com.mirror.evolution.applet.concurrent;


import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mirrordingjing @ 2020/6/22
 */
public class TimerDemo {
    public static void main(String[] args) throws Exception{
        //Timer不会捕获异常，第一次抛出异常后整个Timer将被取消
        Timer timer=new Timer();
        timer.schedule(new ThrowTask(),1);
        timer.schedule(new ThrowTask(),5);
    }

    private static class ThrowTask extends TimerTask{
        public void run(){
            System.out.println("processing---");
            throw new RuntimeException();
        }
    }
}
