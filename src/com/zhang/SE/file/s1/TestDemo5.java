package com.zhang.SE.file.s1;

import java.util.Scanner;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 10:23
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数：");
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println(i);
        }else{
            System.out.println("输入的不是一个个整数");
        }

        System.out.println("输入小数：");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println(f);
        }else{
            System.out.println("输入的不是一个小数");
        }
        scanner.close();
    }
}
