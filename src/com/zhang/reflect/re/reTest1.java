package com.zhang.reflect.re;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-26 16:08
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * 反射获取构造方法
 */
public class reTest1 {
    public static void main(String[] args) throws Exception {
        // 使用类对象
        Class<?> myClass = Class.forName("com.zhang.reflect.Student");
        // new Student()   无参构造方法
        Object myObject = myClass.getDeclaredConstructor().newInstance();
        // 获取有参数的构造方法
        Object o = myClass.getDeclaredConstructor(String.class, String.class).newInstance("张三", "Tom");
        // 获取所有的构造方法
        Constructor<?>[] declaredConstructors = myClass.getDeclaredConstructors();
        // 获取类的路径名字
        System.out.println("类的全类名: " + myClass.getName());
        System.out.println("类的简单类名: " + myClass.getSimpleName());
        new Double(0);
    }

    @Test
    public void s1() throws Exception {
        // 获取类对象
        Class<?> myClass = Class.forName("com.zhang.reflect.Student");
        // 获取所有的构造方法 ； 结果为构造方法数组
        Constructor<?>[] constructors = myClass.getDeclaredConstructors();
        // 迭代器获取数组里面构造方法数组里面每一个构造方法对象
        for (Constructor constructor : constructors){
            System.out.println(constructor.getName()); // 构造方法的名
            System.out.println(constructor.getModifiers()); // 获取构造方法的修饰符
            System.out.println(Modifier.toString(constructor.getModifiers()));  // 人性化表达（默认为数字表达，对开发者不友好）
            // 获取构造方法所以的参数（每一个参数也是一个对象）
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                // 获取参数的名parameter.getName()[实际没有]   parameter.getType()获得参数的类型返回的是一个对象，在获取参数类型对象的名字
                // String.format() 格式化输出，第一个参数是格式化模式，后面的参数为格式化模式里面 %s（占位符）的个数
                System.out.println(String.format("\t参数: %s  %s", parameter.getType().getTypeName(),parameter.getName()));

                // 对程序来说参数名字没有意义
                // parameter.getName()相当于  int index = 0; System.out.println("arg" + index); index ++;（满足你的需要）

                // 对于一个方法来说需要获取的东西有： - 修饰符 - 方法名 - 参数的个数 - 每个参数类型（反射全部可以做到）
            }
        }
    }
}
