package com.zhang.object.abstr;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-21 17:20
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public abstract class Empl2 {
    private String name = "zhangsan";
    private String address;
    private int number;

    /**
     * 计算工资
     * @return
     */
    public abstract double computePay();

    public String getName() {
        return name;
    }
}
