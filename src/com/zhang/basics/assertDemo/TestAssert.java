package com.zhang.basics.assertDemo;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-23 13:57
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestAssert {
    public static void main(String[] args) {
        String name = "12";
        assert name!="12" : "错误";
        System.out.println("no");
    }

    @Test
    public void s1(){
        int i = 6;
        // 如果参数不为 断言的值 会报断言错误【在这里即i!=6】
        assert i==6;
        System.out.println("如果断言正常，我就被打印");
    }

    @Test
    public void s2(){
        // 如果 表达式 1<2 为true，则忽略 表达式"yes",程序继续运行
        // 如果表达式 1<2 为false ,则运行表达式 "yes" ，退出程序(报断言错误警告)
        assert 1<2 : "yes";
        System.out.println("no");
    }

    @Test
    public void s3(){
        int i = 3;
        switch (i){
            case 1:
                System.out.println("正常");
                break;
            case 2:
                System.out.println("正常那");
                break;
            case 5:
                System.out.println("正常的");
                break;
            default:
                assert false : "i的值为无效的";
        }
        System.out.println("如果断言正常，我就被打印");
        // 三元运算符
        System.out.println(1>2 ? 1 : 2);
    }

    @Test
    public void s4(){
        String name = "123";
        assert name == "12" : "错误";
        System.out.println("显示正常");
    }
    @Test
    public void s5(){
        String name = "12";
        assert name!="12" : "错误";
        System.out.println("no");
    }
}
