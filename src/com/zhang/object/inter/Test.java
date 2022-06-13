package com.zhang.object.inter;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 17:35
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test implements Anim{
    @Override
    public void eat() {

    }

    @Override
    public void travel() {

    }
    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.eat();
        test.travel();
    }
}
