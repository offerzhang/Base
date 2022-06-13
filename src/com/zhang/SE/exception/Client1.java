package com.zhang.SE.exception;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 9:50
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Client1 {
    public static void main(String[] args) {
        CheckExe1 c = new CheckExe1(101);
        System.out.println("Depositing &500 ...");
        c.deposit(500.00);

        try {
            c.withDraw(100.00);
            c.withDraw(600.00);
        } catch (MyException e) {
            e.getMessage();  // 作为异常后面的描述信息（throw 丢出的信息string）
            System.out.println("Sorry " + e.getAmount());
            e.printStackTrace();
        }
    }
}
