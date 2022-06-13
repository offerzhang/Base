package com.zhang.object.polym;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 16:50
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Client {
    public static void main(String[] args) {
        Salary A = new Salary("员工A", "北京", 3, 3600.00);
        Employee B = new Salary("员工B", "上海", 2, 2400.00);
        System.out.println("使用Salary的引用调用mailCheck---");
        A.mailCheck();
        System.out.println("使用Employee里面的mailCheck方法");
        B.mailCheck();
    }
}
