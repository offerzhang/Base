package com.zhang.SE.test;

import java.util.function.ObjIntConsumer;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 13:01
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class ObjectSAndClass {
    // 构造方法
    public ObjectSAndClass(){

    }
    public ObjectSAndClass(String name){
        // 构造方法只有一个参数 name
        System.out.println("小狗的名字"+ name);
    }

    public static void main(String[] args) {
        ObjectSAndClass objectSAndClass = new ObjectSAndClass("tom");
    }
}
