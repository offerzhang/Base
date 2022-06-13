package com.zhang.object.enumTest;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-22 15:43
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test2 {
    public static void main(String[] args) {
        Color2 blue = Color2.BLUE;
        switch (blue){
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
enum Color2{
    RED,GREEN,BLUE;
}
