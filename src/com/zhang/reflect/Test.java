package com.zhang.reflect;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-23 22:08
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test {
    public static void main(String[] args) {
        Class[] obj = {};
        obj = new Class[1];

        int[] ins = {};
        // 长度为0
        System.out.println(ins.length);

        ins = new int[0];
        System.out.println(ins.length);
    }

    @org.junit.Test
    public void s1(){
        System.out.println(new Double(10));
    }
}
