package com.zhang.test.test1;

import org.junit.Test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-04-24 15:25
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test1 {
    public static void main(String[] args) {
//        List<User> result = null;
//        System.out.println(result.get(0));
        try {
            int i = 2/0;
            System.out.println("okk");
        }catch (Exception e){
            System.out.println("error");
        }
        System.out.println("-----");
    }

    @Test
    public void s1(){
        String s = " this is test   ";
        // 取到不为空格的字符串
        int start = 0,end = s.length() - 1;
        while (s.charAt(start) == ' ') {start++;}
        while (s.charAt(end) == ' ') {end--;}

        System.out.println(start);
        System.out.println(end);
    }

    @Test
    public void s2(){
        int i = 10;
        System.out.println(i=i == 0 ? 20: 30);
    }

}
class User{

}
