package com.zhang.SE.test2;

import org.junit.Test;

import java.util.Random;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-01 19:29
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestPackaging {
    @Test
    public void s1(){
        // 编译器将基本类型的包装类拆箱为内置类型
        Integer x = 5;
        x = x + 2;
        System.out.println(x);
    }

    @Test
    public void s2(){
        // Math类的方法被定义为static 的类变量
        System.out.println("90的正弦值 "+ Math.sin(Math.PI/2));
        System.out.println("0的余弦值 " + Math.cos(0));
        System.out.println("60度的正切值 " + Math.tan(Math.PI/2));
        System.out.println("1的反余切值 " + Math.atan(1));
        System.out.println("π的角度值 "  + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        System.out.println(Math.random());
        Random random = new Random();
        System.out.println(random.nextInt(10));
    }

    @Test
    public void s3(){
        // 必须是包装类才能 将数字进行转换
        Integer x = 10;
        System.out.println(x.doubleValue());
        System.out.println(x.shortValue());
    }
}
