package com.zhang.reflect.re;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-27 14:22
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * 反射获取属性
 */
public class ReTest3 {
    public static void main(String[] args) throws Exception {
        // 相当于一个DNA
        Class myClass = Class.forName("com.zhang.reflect.Student");
        //  由DNA具体产生的一个人，实例化
        Object o = myClass.getDeclaredConstructor().newInstance();
        // 获取这个类对象的所有参数
        Field[] declaredFields = myClass.getDeclaredFields();
        for (Field field : declaredFields){
            // 设置字段为可以访问
            field.setAccessible(true);
            System.out.println(field.getModifiers());
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getName());  // 获取属性的名
            System.out.println(field.getType());
            System.out.println(field.getType().getName());
            System.out.println(field.get(o));  // 获取一个具体的人，这个DNA在这个人身上的具体表现的值
            System.out.println("-----------------------");
        }
    }

    @Test
    public void s1() throws Exception {
        Class<?> myClass = Class.forName("com.zhang.reflect.Student");
        Object o = myClass.getDeclaredConstructor().newInstance();

        // 获取指定的属性 , 读取这个对象都是可以读取到的，无论这个属性是私有还是公有
        Field name = myClass.getDeclaredField("name");
        // 是一个对象
        System.out.println(name);
        // 设置为可以访问
        name.setAccessible(true);
        System.out.println(name.get(o));
    }
}
