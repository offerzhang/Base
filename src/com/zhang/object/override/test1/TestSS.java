package com.zhang.object.override.test1;

import org.junit.validator.PublicClassValidator;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 15:10
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestSS {
    public static void main(String[] args) {
        // static 修饰的方法可以在本类里面直接使用，不需要创建对象
        show(new Cat2());
        show(new Dog2());
        // 向上转型
        Ani a = new Cat2();
        a.eat();  // 调用的是Cat的eat()方法
        // 向下转型
        Cat2 c = (Cat2)a;
        c.work(); // 调用的是Cat的work()方法
    }
    public static void show(Ani ani){
        ani.eat();
        if (ani instanceof  Cat2){
            Cat2 cat2 = (Cat2) ani;
            cat2.work();
        }else if (ani instanceof Dog2){
            Dog2 dog2 = (Dog2) ani;
            dog2.work();
        }
    }
}
abstract class Ani{
    /**
     * 吃东西
     */
    abstract void eat();
    void s1(){
        // 抽象类里面可以有实现的方法
        System.out.println("=====");
    }
}
class Cat2 extends Ani{
    @Override
    void eat() {
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}

class Dog2 extends Ani{
    @Override
    void eat() {
        System.out.println("啃骨头");
    }
    public void work(){
        System.out.println("看家护院");
    }
}
