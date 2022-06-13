package com.zhang.SE.exception;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 9:42
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class CheckExe1 {
    private double balance;
    private int num;

    public CheckExe1(int num) {
        this.num = num;
    }
    /**
     * 存钱
      */
    public void deposit(double amount){
        balance += amount;
    }
    /**
     * 取钱
     */
    public void withDraw(double amount) throws MyException {
        if (amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new MyException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNum(){
        return num;
    }
}
