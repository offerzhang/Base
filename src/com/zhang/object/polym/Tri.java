package com.zhang.object.polym;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 15:04
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Tri {
    /*
      多态的： 三个条件：
        继承
        重写
        父类指向子类对象的引用
     */


}
class Shape{
    void draw(){};
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }
}
class Square extends  Shape{
    @Override
    void draw() {
        System.out.println("square.draw()");
    }
}
