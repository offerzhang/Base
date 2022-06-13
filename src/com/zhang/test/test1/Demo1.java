package com.zhang.test.test1;

import org.junit.Test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 16:32
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            boolean flag = true;
            System.out.println(flag);
            for (int j = 0; j < 3; j++) {
                flag = false;
                System.out.println(flag);
            }
            if(flag){
                break;
            }
        }
    }

    @Test
    public void s1(){
        for (int i = 0; i < 1; i++) {
            int x = 10;
            for (int j = 0; j < 2; j++) {
                x = 2;
            }
        }
    }
}
