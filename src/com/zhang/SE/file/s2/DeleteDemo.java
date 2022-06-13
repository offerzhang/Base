package com.zhang.SE.file.s2;

import java.io.File;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 8:56
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class DeleteDemo {
    public static void main(String[] args) {
        File fileFolder = new File("src/com/zhang/SE/file/s2/testDemo1");
        deleteFolder(fileFolder);
    }
    /**
     *  删除文件及目录
     */
    public static void deleteFolder(File folder){
        // 必须保证目录下没有其他的文件【空的】
      File[] files = folder.listFiles();
      if (files != null){
          for (File f : files){
              if (f.isDirectory()){
                  deleteFolder(f);
              }else{
                  f.delete();
              }
          }
      }
      folder.delete();
    }
}
