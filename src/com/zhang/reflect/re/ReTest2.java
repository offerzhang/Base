package com.zhang.reflect.re;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-27 14:05
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * 获取一般构造方法
 */
public class ReTest2 {
    public static void main(String[] args) throws Exception {
        Class<?> myClass = Class.forName("com.zhang.reflect.Student");
        Object myObject = myClass.getDeclaredConstructor().newInstance();
        System.out.println("======获取一般方法====");
        // 获取方法等都是在类模板上面操作的
        // 获取所声明的方法（public private等）
        Method[] methods = myClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getModifiers());
            System.out.println(Modifier.toString(method.getModifiers())); // 人性化显示
            // 获取一般方法上面的所有参数
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                // 返回的参数类型为一个对象
                System.out.println(String.format("参数：%s  %s ", parameter.getType().getTypeName(),parameter.getName()));
            }
        }
    }
}
