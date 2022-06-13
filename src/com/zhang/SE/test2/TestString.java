package com.zhang.SE.test2;

import org.junit.Test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-04 9:08
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestString {
    public static void main(String[] args) {
        int x = 10;
        // 调用对应包装类的方法
        String string = Integer.toString(x);
        // 调用String的valueOf 方法
        String string1 = String.valueOf(x);
        // 基本数据类型加上 空字符串
        String string2 = x + "";
    }

    @Test
    public void s1(){
        int x = 21;
        String string = Integer.toString(x);
        String s = String.valueOf(x);
        String ss = x + "";

        double y = 2.1;
        String s1 = String.valueOf(y);
        Double.toString(y);
        String sss = y + "";
    }

    @Test
    public void s2(){
        String str = "21";
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str));
    }

    @Test
    public void s3(){
        int x = 3;
        System.out.println(Integer.toString(x));
        System.out.println(String.valueOf(x));
        System.out.println(x+"");

        String str = "12";
        System.out.println(Integer.valueOf(str));
        System.out.println(Integer.parseInt(str));
    }
}
