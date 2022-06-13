package com.zhang.SE.file.s1;

import java.util.Scanner;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 10:23
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String str2 = scanner.nextLine();
            System.out.println(str2);
        }
        scanner.close();
    }
}
