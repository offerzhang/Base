package com.zhang.SE.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 15:19
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class VariableDemo {
    // 类变量
    // 独立于方法之外的变量，用static修饰
    static int allClicks = 1;
    // 实例变量
    // 独立于方法之外，但是没有使用static修饰
    String string = "this is test";

    public void method(){
        // 位于类中的方法中的变量
        int i = 1;
    }
}
