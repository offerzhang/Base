package com.zhang.test.test1;

import org.junit.Test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-05-13 22:14
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class DemoTest2 {
    static{
        int x=5;
    }
    static int x,y;
    public static void main(String args[]){
        x--;
        myMethod();
        System.out.println(x+y+ ++x);
    }
    public static void myMethod( ){
        y=x++ + ++x;
    }


    @Test
    public void s1(){
        String lx = "lexin";
        String nb = lx;
        lx = "Fenqile";
        System.out.println(nb);
    }
}
