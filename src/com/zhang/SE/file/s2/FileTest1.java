package com.zhang.SE.file.s2;

import java.io.*;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 11:38
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class FileTest1 {
    public static void main(String[] args) throws Exception {
        File f = new File("src/com/zhang/SE/file/s2/a.txt");
        FileOutputStream fos = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
        // 写入缓存区
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fos.close();

        FileInputStream fis = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            // 装换为char加到stringBuffer
            sb.append(reader.read());
        }
        System.out.println(sb.toString());
        // 关闭操作
        reader.close();
        fis.close();
    }
}
