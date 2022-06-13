package com.zhang.SE.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 15:24
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class PupTest {
    // 局部变量，分配在栈中
    // 局部变量没有默认值
    // Private 等访问修饰符不能作用于局部变量
    public void pupAge(){
        int age = 1;
        age = age + 12;
//        int b;
//        System.out.println(b);
        System.out.println("小狗的年级是 "+ age);
    }

    public static void main(String[] args) {
        PupTest pupTest = new PupTest();
        pupTest.pupAge();
    }
}
