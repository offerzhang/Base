package com.zhang.object.enumTest;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-22 15:49
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test4 {
    public static void main(String[] args) {
        // 调用values()方法
        Color4[] arr = Color4.values();
        // 迭代获取枚举
        for(Color4 color4 : arr){
            // 查看索引 ordinal()方法
            System.out.println(color4 + " at index "+ color4.ordinal());
        }
        // 使用 valueOf()方法，返回枚举类型，不存在会报错 IllegalArgumentException
        System.out.println(Color4.valueOf("RED"));
//        System.out.println(Color4.valueOf("REDS"));
    }
}
enum Color4{
    RED,GREEN,BLUE;
}
