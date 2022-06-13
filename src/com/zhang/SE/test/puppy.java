package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 13:31
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class puppy {
    protected int puppyAge;
    public puppy(String name){
        System.out.println("小狗的名字是 "+ name );
    }
    public void setPuppyAge(int age){
        this.puppyAge = age;
    }
    public int getPuppyAge(){
        System.out.println("小狗的年龄为 "+ puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        puppy puppy = new puppy("tom");
        puppy.setPuppyAge(10);
        puppy.getPuppyAge();
        System.out.println(puppy.puppyAge);
    }
}
