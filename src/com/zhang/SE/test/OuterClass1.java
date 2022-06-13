package com.zhang.SE.test;

import com.sun.org.apache.xml.internal.utils.IntVector;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 14:07
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class OuterClass1 {
    int x =12;
    static class interClass{
        int y = 10;
    }

    public static void main(String[] args) {
        interClass interClass = new interClass();
    }
}
