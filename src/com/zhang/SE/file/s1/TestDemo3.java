package com.zhang.SE.file.s1;

import java.util.Scanner;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 10:23
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("以next方式接受： ");
        // 以空格结束
        if (scanner.hasNext()){
            String str1 = scanner.next();
            System.out.println("输出为："+str1);
        }
        scanner.close();
    }
}
