package com.zhang.SE.file.s2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 10:45
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        int s = 10;
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
        while (bOutput.size()!=s){
            // 获取用户的输入值
            bOutput.write(System.in.read());
        }

        byte[] b = bOutput.toByteArray();
        System.out.println("Print the content");
        for (int i = 0; i < b.length; i++) {
            // 打印字符
            System.out.print((char) b[i] + "  ");
        }
        System.out.println("    ");
        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("converting characters to Upper case: ");
        for (int y = 0; y < 1; y++) {
            // 每次调用 read() 方法，它从输入流读取一个字符并把该字符作为整数值返回。
            // 当流结束的时候返回 -1
            while ((c=bInput.read())!= -1){
                System.out.println(Character.toUpperCase((char)c));
            }
            bInput.reset();
        }
    }
}
