package com.mirror.evolution.applet.hotswap;

/**
 * Created by mirrordingjing @ 2020/5/28
 */
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by mirrordingjing @ 2020/5/28
 */
public class HotSwapDemo {

    public static Method initAddMethod() {
        try {
            Method add = URLClassLoader.class.getDeclaredMethod("addURL",
                    new Class[] { URL.class });
            add.setAccessible(true);
            return add;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        // 热部署测试代码
        Thread t;
        t = new Thread(new Multirun());
        t.start();
    }
}