package com.zhang.SE.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 16:10
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo1 extends Car{
    public static void main(String[] args) {
        String name = "this is test";
        System.out.println(name instanceof String);
        System.out.println(1 > 2 ? 1:20);
// 子类的类型兼容父类
        Car demo1 = new TestDemo1();
        // 父类的类型不兼容子类
//        TestDemo1 car = new Car();
        System.out.println(demo1 instanceof TestDemo1);
    }
}

class Car{

}
