package com.zhang.object.override.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 14:55
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Demo1 {
    public int test(){
        System.out.println("test1");
        return 1;
    }
    public void test(int a){
        System.out.println("test2");
    }
    public String test(int a, String s){
        System.out.println("test3");
        return "test3 is int string";
    }
    public String test(String s , int a){
        System.out.println("test4");
        return "test4 is string int";
    }
    public static void main(String[] args) {
        Demo1 o = new Demo1();
        System.out.println(o.test());
        o.test(112);
        System.out.println(o.test(1,"this is test before"));
        System.out.println(o.test("this is test after ", 2));
    }
}

