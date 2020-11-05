package com.mirror.evolution.applet.serialization;

import java.io.Externalizable;
import java.io.Serializable;

//如果实现Externalizable接口要实现writeExternal,readExternal方法
//此时序列化不受transient等关键字影响，由用户自定义决定
public class Person implements Serializable{
    private static String category="personal";

    private String name;

    private transient String password;

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String category) {
        Person.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
