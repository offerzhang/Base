package com.zhang.object.inherit.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 10:17
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Penguin {
    private String name;
    private int id;

    public Penguin(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void eat(){
        System.out.println(name + "正在吃");
    }
    public void sleep(){
        System.out.println(name + "正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是 " + id + "号"  + name + ".");
    }
}
