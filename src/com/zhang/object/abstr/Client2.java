package com.zhang.object.abstr;

import com.zhang.object.polym.Employee;
import com.zhang.object.polym.Salary;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 17:15
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Client2 {
    public static void main(String[] args) {
        Sala a = new Sala("员工a", "北京", 2, 3600.00);
        Empl b = new Sala("员工", "上海", 3, 2400.00);
        System.out.println("Salary的使用----");
        a.mailCheck();
        System.out.println("Empl的使用----");
        b.mailCheck();
    }
}
