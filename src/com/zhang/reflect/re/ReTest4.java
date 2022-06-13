package com.zhang.reflect.re;

import sun.util.resources.cldr.es.TimeZoneNames_es_419;

import java.lang.reflect.Field;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-27 15:11
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * 对属性的读写
 */
public class ReTest4 {
    public static void main(String[] args) throws Exception {
        Class<?> myClass = Class.forName("com.zhang.reflect.Student");
        Object o = myClass.getDeclaredConstructor().newInstance();

        // 对公有属性的读取
        Field catName = myClass.getDeclaredField("catName");
        System.out.println(catName.getName()); // 读取这个属性的名
        System.out.println(catName.get(o)); // 读取这个属性的值

        // 对属性的私有的属性进行读取
        Field name = myClass.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.getName());
        System.out.println(name.get(o));

        // 对私有属性的写入
        Field name1 = myClass.getDeclaredField("name");
        name1.setAccessible(true); // 设置可以访问
        System.out.println(String.format("写入前的值：%s = %s ", name1.getName(),name1.get(o)));
        name1.set(o, "小张");   // 写入 ； 需要操作的对象，需要写入的值
        System.out.println(String.format("写入后的值: %s = %s",name1.getName(),name1.get(o)));

        // 对公有属性的写入
        Field catName1 = myClass.getDeclaredField("catName");
        System.out.println(String.format("写入前的值：%s = %s", catName1.getName(),catName1.get(o)));
        catName1.set(o, "Jack");
        System.out.println(String.format("写入的值: %s = %s", catName1.getName(),catName1.get(o)));
    }
}
