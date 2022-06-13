package com.zhang.TestSorts.冒泡排序;

import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 16:18
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Bubble1 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        // 复制元素  ; 浅复制 ， 排序不会改变原数组的顺序
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        for (int x : arr1){
            System.out.print(x + "   ");
        }
        System.out.println();
        for (int i = 1; i < arr1.length; i++) {
            // 设置一个标记 ， 如果已经排序好了，直接跳出循环
           boolean flag = true;
            for (int j = 0; j < arr1.length - i; j++) {
                if (arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;

                    flag = false;
                }
            }
            if (flag){
                // 跳出 外层循环
                // 冒泡排序结束
                break;
            }
        }
        for (int x : arr1){
            System.out.print(x + "   ");
        }
        System.out.println();
        for (int x : arr){
            System.out.print(x + "   ");
        }
    }
}
