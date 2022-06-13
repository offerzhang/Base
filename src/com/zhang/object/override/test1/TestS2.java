package com.zhang.object.override.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 14:49
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestS2 {
    public static void main(String[] args) {
        Animal1 a1 = new Animal1();
        Animal d1 = new Dog1();
        a1.move();
        d1.move();
//        d1.bark();  没有这个方法
    }
}
class Animal1{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog1 extends Animal{
    @Override
    public void move() {
        System.out.println("狗子可以跑和走");
    }

    public void bark(){
        System.out.println("汪汪汪");
    }
}