package com.zhang.SE.exception.login;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 10:09
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Client2 {
    public static void main(String[] args) {
        LoginExc loginExc = new LoginExc();
        try {
            loginExc.login();
        }catch (MyException2 e){
            System.out.println(e.getMessage());
            e.getMessage();  // 写不写都会把message信息加到printStackTrace的后面
            e.printStackTrace();  // 打印错误信息，没有这个，则输出为空
        }
    }
}
