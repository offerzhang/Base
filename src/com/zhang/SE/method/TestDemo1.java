package com.zhang.SE.method;

import org.junit.Test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 9:28
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo1 {
    public static int max(int num1,int num2){
        int result;
        if (num1 > num2){
            result = num1;
        }else {
            result = num2;
        }
        int i = num1 > num2 ? num1 : num2;
        return result;
    }

    @Test
    public void s1(){
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        printMax(34,32,24,56,25);
        printMax(new double[]{1,2,3});
    }

    /**
     *   可变参数必须是3个.
     */
    public static void printMax(double...numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println(result);
    }
}
