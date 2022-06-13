package com.zhang.test.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-05-13 22:38
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test01 {
    public static void main(String[] args)
    {
        Base base = new Son();
        base.method();
        ((Son) base).methodB();
    }
}
class Base
{
    public void method()
    {
        System.out.println("Base");
    }
}
class Son extends Base
{
    @Override
    public void method()
    {
        System.out.println("Son");
    }

    public void methodB()
    {
        System.out.println("SonB");
    }
}
