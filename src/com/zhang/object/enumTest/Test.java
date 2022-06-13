package com.zhang.object.enumTest;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-22 13:51
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test {
    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red);
    }
}

/**
 * 表示一组常量,枚举类
 */
enum Color{
    // 定义一组颜色
    RED,GREEN,BLUE;
}
/**
 * 等价于这个内部类
 */
//class Color{
// 所有的枚举值都是 public static final
//    public static final Color RED = new Color();
//    public static final Color GREEN = new Color();
//    public static final Color BLUE = new Color();
//}
