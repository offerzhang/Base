package com.zhang.TestSorts.快速排序;

import jdk.nashorn.internal.ir.ReturnNode;

import java.time.temporal.Temporal;
import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 22:59
 * To: 真常应物，真常得性，常清常静，常清静矣
 */

// https://blog.csdn.net/shujuelin/article/details/82423852 快速排序

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        // 基线条件 ，递归的出口
        if (low > high){
            return;
        }
        i = low;
        j = high;
        // temp就是基准位 3
        temp = arr[low];

        while (i < j){
            // 先看右边 j哨兵 ，依次往左递减
            while (temp <= arr[j] && i<j){
                j--;
            }
            // 先看右边 i哨兵 ，依次往右递增
            while(temp >= arr[i] && i < j){
                i++;
            }
            // 如果满足条件则交换
            if (i < j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        // 最后将基准和 i与j 相等的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        // 递归调用左半数组
        quickSort(arr, low, j-1);
        // 递归调用右半数组
        quickSort(arr, j+1, high);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
