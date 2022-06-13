package com.zhang.SE.file.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 10:12
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text: ");
        System.out.println("Enter end to quit");
        do {
            str = sb.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}
