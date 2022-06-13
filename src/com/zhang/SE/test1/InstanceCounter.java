package com.zhang.SE.test1;

import java.util.function.IntBinaryOperator;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 15:47
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("starting with "+InstanceCounter.getCount());
        for (int i = 0; i < 5; i++) {
            new InstanceCounter();
        }
        System.out.println("created "+ InstanceCounter.getCount());
    }
}
