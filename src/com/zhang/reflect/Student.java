package com.zhang.reflect;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-24 16:13
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Student {
    private String name = "张三";
    public String catName = "Tom";

    public Student() {
    }

    public Student(String name, String catName) {
        this.name = name;
        this.catName = catName;
    }

    public String s2(){
        return "this is s2";
    }

    public void s1(){
        System.out.println("this is s1");
    }

    public String eat(String food){
        return food + " is a good food";
    }

    private String sleep(String msg){
        return msg + " is a good ";
    }
    public static void Stu(String name){
        System.out.println("this is stu");
    }

    public int s5(int x){
        return 5;
    }
}
