package com.zhang.SE.test;

import com.sun.org.apache.xml.internal.utils.IntVector;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 14:19
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class OuterClass2 {
    // 从内部类访问外部类的属性和方法
    int x = 12;
    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        InnerClass innerClass = outerClass2.new InnerClass();
        System.out.println(innerClass.myInnerMethod());
    }
}
