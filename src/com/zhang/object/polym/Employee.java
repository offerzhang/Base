package com.zhang.object.polym;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 16:38
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Employee的构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck(){
        System.out.println("邮寄纸片给： " + this.name + " "  + this.address);
    }
    @Override
    public String toString(){
        return name + " " + address + " ";
    }

    public String getName() {
        System.out.println("getName------");
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
