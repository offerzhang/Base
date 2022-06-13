package com.zhang.SE.file.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 10:12
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo1 {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br);
        System.out.println("输入字符，按下q键退出");
        do {
            //输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回 -1。该方法抛出 IOException。
            c = (char) br.read();
            System.out.println("输出为 " + c);
        }while (c != 'q');
    }
}
