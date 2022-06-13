package com.zhang.test.test2;

import java.util.Date;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-02 9:15
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class X {
    // 时间相加测试
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(new Date(l));
        Date date = new Date(l + 15);
        long ll = l + 15000;
        System.out.println(date);
        System.out.println(new Date(ll));
    }
}


