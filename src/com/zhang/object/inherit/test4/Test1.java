package com.zhang.object.inherit.test4;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 14:08
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        System.out.println("------------------");
        Dog dog = new Dog();
        dog.eat();
        System.out.println("============");
        dog.eatTest();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal : eat ");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog : eat ");
    }
    void eatTest(){
        this.eat();
        super.eat();
    }
}
