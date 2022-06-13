package com.zhang.reflect;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-24 16:06
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test1 {

    /**
     * 反射的三种方式获取类对象
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // 1. 对象获取，调用Student类的父类方法getClass
        Student stu1 = new Student();
        Class<? extends Student> stu1Class = stu1.getClass();

        // 2.类名获取,包括每个类型（基本、引用类型）
        Class<Student> studentClass = Student.class;

        // 3.Class类的静态方法forName(字符串的类名)[常用]
        Class<?> stu2 = Class.forName("com.zhang.reflect.Student");

    }
}
