package com.zhang.SE.test1;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 15:04
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class PrimitiveTypeTest {
    static boolean bool;
    static byte by;
    static  int i;
    static short sh;
    static  long l;
    static double d;
    static float f;
    static char ch;
    static String str;

    public static void main(String[] args) {
        System.out.println(Byte.SIZE);
        System.out.println("====================");
        // 测试八大基本类型的默认值
        System.out.println("Boolean  "+ bool);
        System.out.println("Byte  "+ by);
        System.out.println("Short  "+ sh);
        System.out.println("int    "+ i);
        System.out.println("long    "+ l);
        System.out.println("double    "+ d);
        System.out.println("float    "+ f);
        System.out.println("char    "+ ch);// "u0000"
        System.out.println("string    "+ str);
    }
}
