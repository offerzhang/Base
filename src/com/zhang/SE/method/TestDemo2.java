package com.zhang.SE.method;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 10:02
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);
        // 引用 z = null 只是将引用z不指向任何对象
        c2 = c3 = null;
        System.gc();   // 调用Java垃圾回收器
    }
}

class Cake extends Object{
    private int id;
    public Cake(int id){
        this.id = id;
        System.out.println("Cake object " + id + " is created");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake object " + id + " is disposed");
    }
}
