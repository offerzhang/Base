package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 13:56
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class OuterClass {
    int x = 10;
    class interClass{
        int y = 5;
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        interClass interClass = outerClass.new interClass();
        System.out.println(interClass.y +""+ outerClass.x);
    }
}
