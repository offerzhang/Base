package com.zhang.object.enumTest;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-22 15:40
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test1 {
    public static void main(String[] args) {
        // 迭代获取 枚举类型的每一个元素
        for (Color1 myVar : Color1.values()) {
            System.out.println(myVar);
        }
    }
}
enum Color1{
    RED,GREEN,BLUE
}
