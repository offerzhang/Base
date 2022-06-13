package com.zhang.SE.file.s2;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 11:03
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream("src/com/zhang/SE/file/s2/test.txt"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("src/com/zhang/SE/file/s2/test1.txt"));
        BufferedReader d = new BufferedReader(new InputStreamReader(in));
        String count;
        while ((count = d.readLine()) != null){
            String u = count.toUpperCase();
            System.out.println(u);
            out.writeBytes(u+ " ,");
        }
        d.close();
        out.close();
    }
}
