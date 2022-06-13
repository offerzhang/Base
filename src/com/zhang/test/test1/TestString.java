package com.zhang.test.test1;

import org.junit.Test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-04-01 19:35
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * Java 里面判断两个字符串是否相等
 * == 比较引用  ； equals 比较值
 */
public class TestString {
    @Test
    public void s1(){
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c == d);  // 在堆里面创建两个对象，所以引用不同
        System.out.println(c.equals(d)); // equals() 比较的是对象的值

        String e = "ab" + "c";
        System.out.println(a == e);
        System.out.println(a.equals(e));  // 在编译的时候在堆里面创建对象
    }
}
