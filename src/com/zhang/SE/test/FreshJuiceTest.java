package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 13:12
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class FreshJuiceTest {
    public static void main(String[] args) {
        // 枚举果汁的类型只能是大杯、小杯
        FreshJuice juice = new FreshJuice() ;
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
}
