package com.zhang.SE.exception.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 9:29
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            System.out.println("Access element three : " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : " + e);
        }
        System.out.println("okkk");
    }
}
