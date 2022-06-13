package com.zhang.SE.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-01 17:24
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestGetName {
    public static void main(String[] args) {
        // 获取当前的对象名
        System.out.println(TestGetName.class.getSimpleName());
        // 获得这个对象类的全路径
        System.out.println(TestGetName.class);
        // 获得对象得类模板示例，也就是Class
        System.out.println(TestGetName.class.getClass());
        // 得到Class类的名称
        System.out.println(TestGetName.class.getClass().getName());
    }
}
