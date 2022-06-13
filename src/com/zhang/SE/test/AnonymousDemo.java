package com.zhang.SE.test;

import java.security.PublicKey;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 14:25
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class AnonymousDemo {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.createClass();
    }
}
class Polygon{
    public void display(){
        System.out.println("我现在在Polygon的内部");
    }
}
class Demo1{
    public void createClass(){
        Polygon polygon = new Polygon(){
            public void display(){
                System.out.println("在你匿名类的内部");
            }
        };
        polygon.display();
    }
}
