package com.zhang.SE.file.s2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 11:30
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class FileTest {
    public static void main(String[] args) throws Exception {
        byte[] bWrite = {11,21,3,40,5};
        FileOutputStream os = new FileOutputStream("src/com/zhang/SE/file/s2/t.txt");
        for (int i = 0; i < bWrite.length; i++) {
            os.write(bWrite[i]);
        }
        os.close();
        FileInputStream is = new FileInputStream("src/com/zhang/SE/file/s2/test.txt");
        int size = is.available();
        for (int i = 0; i < size; i++) {
            System.out.print((char)is.read() + " ");
        }
        is.close();
    }
}
