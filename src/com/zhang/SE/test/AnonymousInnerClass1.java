package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 14:53
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class AnonymousInnerClass1 {
    public static void main(String[] args) {
        inter inter = new inter() {
            @Override
            public void method() {
                System.out.println("实现一个接口的匿名类");
            }
        };
        inter inter1 = () -> System.out.println("111");// lambda表达式
        inter.method();
    }
}
interface inter{
    void method();
}
