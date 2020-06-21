package com.mirror.evolution.applet.hotswap;

import java.lang.reflect.Method;

/**
 * Created by mirrordingjing @ 2020/5/28
 */
public class Multirun implements Runnable {
    public void run() {
        try {
            while (true) {
                // 每次都创建出一个新的类加载器
                // class需要放在自己package名字的文件夹下
                String url = System.getProperty("user.dir") + "/lib";
                HotSwapClassLoader cl = new HotSwapClassLoader(url,
                        new String[]{"hotswap.Dessert"});
                Class cls = cl.loadClass("hotswap.Dessert");
                Object foo = cls.newInstance();
                // 被调用函数的参数
                Method m = foo.getClass().getMethod("serve", new Class[]{});
                m.invoke(foo, new Object[]{});
                Thread.sleep(500);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

