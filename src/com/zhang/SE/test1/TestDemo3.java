package com.zhang.SE.test1;

import org.junit.Test;

import java.util.function.IntToDoubleFunction;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-01 17:45
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo3 {
    @Test
    public void s1(){
        int[] numbers = {12,123,43,54};
        for (int x : numbers){
            if (x==43){
                // 程序到这里停止 ， 43 不包括
                break;
            }
            System.out.println(x);
        }
        System.out.println("==================");
        for(int x : numbers){
            if (x==43){
                // 跳过43这个元素
                continue;
            }
            System.out.println(x);
        }
    }

}
