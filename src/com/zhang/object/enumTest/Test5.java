package com.zhang.object.enumTest;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-22 15:58
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test5 {
    public static void main(String[] args) {
        Color5 red = Color5.RED;
        System.out.println(red);
        red.colorInfo();
    }
}
enum Color5{
    /**
     * 枚举的具体元素
     */
    RED,GREEN,BLUE;

    /**
     * 构造函数
     */
    private Color5() {
        System.out.println("Constructor called for : " + this.toString());
    }
    public void colorInfo(){
        System.out.println("Universal Color");
    }
}
