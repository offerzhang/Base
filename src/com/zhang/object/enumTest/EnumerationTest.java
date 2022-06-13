package com.zhang.object.enumTest;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-22 16:33
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class EnumerationTest {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Webs");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        // 遍历获取枚举类型的元素（一次获取一个）
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
