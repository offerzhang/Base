package com.zhang.object.inherit.test4;

import com.zhang.SE.test1.SubClass;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 14:24
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestSuperSub {
    public static void main(String[] args) {
        System.out.println("------Subclass类继承-------");
        SubClass1 sc1 = new SubClass1();
        SubClass1 sc2 = new SubClass1(120);
        System.out.println("-------subclass2类继承---------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(130);
    }
}
class SuperClass{
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
    }
}

/**
 *  subClass 类继承
 */
class SubClass2 extends SuperClass{
    private int n;
    SubClass2(){
        // 调用父类的有参数的构造器
        super(300);
        System.out.println("Subclass2");
    }
    SubClass2(int n){
        // 系统自动调用无参构造方法
        System.out.println("Subclass2(int n):" + n);
        this.n = n;
    }
}
class SubClass1 extends SuperClass{
    private int n;
    SubClass1(){
        // 系统自动调用无参构造方法
        System.out.println("Subclass1");
    }
    SubClass1(int n){
        // 调用父类的有参数的构造器
        super(300);
        System.out.println("Subclass1(int n):" + n);
        this.n = n;
    }
}

