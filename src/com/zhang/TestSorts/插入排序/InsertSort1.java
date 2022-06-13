package com.zhang.TestSorts.插入排序;

import java.util.jar.JarEntry;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 21:30
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class InsertSort1 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j-1]){
                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i){
                arr[j] = temp;
            }
        }
        for (int x : arr){
            System.out.print(x + "  ");
        }
    }
}
