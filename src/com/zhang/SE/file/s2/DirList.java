package com.zhang.SE.file.s2;

import java.io.File;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 8:46
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class DirList {
    public static void main(String[] args) {
        // 默认的相对路径为当前项目下
        String dirname = "src/com/zhang/SE/file/s2/";
        File f = new File(dirname);
        if (f.isDirectory()){
            System.out.println("目录: "+dirname);
            String[] s = f.list();
            for (int i = 0; i < s.length; i++) {
                File f1 = new File(dirname + "/" + s[i]);
                if (f1.isDirectory()){
                    System.out.println(s[i] + " 是一个目录");
                }else{
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        }else{
            System.out.println(dirname+ " 不是一个目录");
        }
    }
}
