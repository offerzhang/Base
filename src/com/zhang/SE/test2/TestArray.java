package com.zhang.SE.test2;

import org.junit.Test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-07 13:21
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestArray {
    public static void main(String[] args) {
        int size = 10;
        double[] myList = new double[size];
        myList[0] = 5.5;
        myList[1] = 4.5;
        myList[2] = 3.3;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("合为： "+ total);
    }

    @Test
    public void t1(){
        int size = 10;
        double[] my = new double[size];
        my[0] = 5.5;
        my[1] = 4.5;
        my[2] = 10;
        double total = 0;
        for (int i = 0; i < my.length; i++) {
            total += my[i];
        }
        System.out.println(total);
        System.out.println(my);
    }

    @Test
    public void t2(){
        double[] myList = {1.2,1.4,2.3,2.5,2.5,2.1};
        // 打印所有的元素
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]+"");
        }
        // 计算总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is"+ total);
        // 查找最大元素
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("MAx is "+ max);
    }

    @Test
    public void t3(){
        double[] my = {1.9,2.4,3.3,1.5};
        for (double ele : my) {
            System.out.println(ele);
        }
    }

    @Test
    public void t4(){
        printArray(new int[]{1, 2, 3, 4, 5, 6});
        int[] demo = reverseDemo(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(demo);
        printArray(demo);
    }
    // 打印数组元素
    public static void printArray(int[] array){
        for (int x : array) {
            System.out.println(x+ "");
        }
    }
    // 反转数组
    public static int[] reverseDemo(int[] list){
        int[] result = new int[list.length];
        for (int i=0,j = result.length-1; i< list.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }
}
