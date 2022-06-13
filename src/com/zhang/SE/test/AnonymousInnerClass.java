package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 14:49
 * To: 真常应物，真常得性，常清常静，常清静矣
 */

// 匿名类继承一个父类
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Person person = new Person(){
            public void method(){
                System.out.println("子类的方法");
            }
        };
        person.method();
    }
}
class Person{
    public void method(){
        System.out.println("父类的方法");
    }
}
