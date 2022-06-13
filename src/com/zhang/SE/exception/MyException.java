package com.zhang.SE.exception;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 9:06
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class MyException extends Exception{
    /**
     *    定义出现错误存储出现的异常
      */
    private  double amount;
    public MyException(double amount) {
        // 可以接受一个参数
        super(String.valueOf(amount));
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
