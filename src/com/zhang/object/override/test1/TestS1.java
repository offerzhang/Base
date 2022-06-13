package com.zhang.object.override.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 14:45
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestS1 {
    public static void main(String[] args) {
        Animal a  = new Animal();
        Animal d = new Dog();
        a.move();
        d.move();
    }
}
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("狗可以跑和走");
    }
}
