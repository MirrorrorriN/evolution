package com.mirror.evolution.applet.designPattern.singleton;

/**
 * 枚举方式
 * Effective Java 作者 Josh Bloch 提倡的方式
 * 线程安全
 * 且还自动支持序列化机制，绝对防止多次实例化
 * 也不能使用反射 reflection attack调用构造函数
 */
public enum Singleton2 {
    INSTANCE;
    public void whateverMethod() {
    }
}
