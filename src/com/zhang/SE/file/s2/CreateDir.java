package com.zhang.SE.file.s2;

import java.io.File;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 20:00
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirname = "src/com/zhang/SE/file/s2/testDemo1";
        File d = new File(dirname);
        // 创建目录
        boolean mkdir = d.mkdir();
        System.out.println(mkdir);
    }
}
