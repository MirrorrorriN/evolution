package com.mirror.evolution.applet.serialization;

import org.junit.Test;

import java.io.*;

/**
 * Created by mirrordingjing @ 2020/7/25
 */
public class SerializationUtils {
    private static String FILE_NAME = "./tmp/obj";
    //序列化  写的过程
    public static void write(Serializable s){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            objectOutputStream.writeObject(s);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //反序列化 读的过程
    public static Object read(){
        Object obj=null;
        // 反序列化
        try {
            ObjectInput input = new ObjectInputStream(new FileInputStream(FILE_NAME));
            obj = input.readObject();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Test
    public void testWrite(){
        Person.setCategory("xxx");
        Person person=new Person();
        person.setName("Alice");
        person.setPassword("123456");
        SerializationUtils.write(person);
    }

    @Test
    public void testRead() {
        Person.setCategory("yyy");
        Person person = (Person) SerializationUtils.read();
        //静态属性的值不会被序列化，虽然有值不是通过反序列化得到的，是JVM中static变量的值
        System.out.println(Person.getCategory());
        System.out.println(person.getName());
        //transient字段不会被自动序列化反序列化
        System.out.println(person.getPassword());
    }
}
