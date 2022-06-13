package com.zhang.test.test2;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-02 8:30
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Z{
    public static void main(String[] args) {
        int i = 5;
        // 反码
//        1 0 1
//         0 1 0 1
//
//         1 0  1 0
//         0 1  0 1 1
        int j = 10;
        System.out.println(~j);
        System.out.println(~i);
        System.out.println(i + ~j);

    }
}
