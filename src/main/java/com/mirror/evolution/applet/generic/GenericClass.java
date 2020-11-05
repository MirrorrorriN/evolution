package com.mirror.evolution.applet.generic;

/**
 * Created by mirrordingjing @ 2020/8/8
 */
public class GenericClass<T> {
//    静态变量 静态方法中不可使用范型类型变量 未实例化拿不到T类型
//    public static T t;

//    public void static T show(T one){
//
//    }
    private T t;
    //静态泛型方法中的T非泛型类中的T
    public static  <T> T show(T one){
        System.out.println(((Object)one).toString());
        return one;
    }

    public static void main(String[] args){
        GenericClass<Integer> genericClass=new GenericClass<>();
        String str="hello";
        GenericClass.show(str);
    }
}
