package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 14:43
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class AnonymousDemo2 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.createClass();
    }
}
interface  polygons{
    void display();
}
class Demo3{
    public void createClass(){
        polygons p1 = new polygons() {
            @Override
            public void display() {
                System.out.println("在匿名的类中");
            }
        };
        p1.display();
    }
}
