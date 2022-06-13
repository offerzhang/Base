package com.zhang.SE.exception.login;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-20 10:06
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class LoginExc {
    public void login() throws MyException2{
        if (1==1){
            throw new MyException2("登入失败");
        }
    }
}
