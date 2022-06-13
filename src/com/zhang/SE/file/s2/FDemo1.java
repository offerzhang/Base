package com.zhang.SE.file.s2;

import java.io.File;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 11:39
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class FDemo1 {
    public static void main(String[] args) {
        String dirname = "F:\\java重新学习\\学习日记";
        File f1 = new File(dirname);
        if (f1.isDirectory()){
            System.out.println("Dir " + dirname);
            String[] s = f1.list();
            for (int i = 0; i < s.length; i++) {
                File file = new File(dirname + "/" + s[i]);
                if (file.isDirectory()){
                    System.out.println("Dir " + s[i]);
                }else{
                    System.out.println("file " + s[i]);
                }
            }
        }else {
            System.out.println(dirname + " is not a dir");
        }
    }
}
