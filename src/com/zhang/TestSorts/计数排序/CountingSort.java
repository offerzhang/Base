package com.zhang.TestSorts.计数排序;

import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-26 11:17
 * To: 真常应物，真常得性，常清常静，常清静矣
 */

// 计数排序： https://www.cnblogs.com/developerY/p/3166462.html

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        sort(arr);
    }

    private static void sort(int[] arr) {
        // 找出数组的最大元素
        int maxValue = getMaxValue(arr);
        // 计数数组元素
        countingSort(arr,maxValue);
    }

    private static void countingSort(int[] arr, int maxValue) {
        // 需要分几个桶
        int bucketLen = maxValue + 1;
        // 确定桶数组的大小长度
        int[] bucket = new int[bucketLen];

        for (int value : arr){
            bucket[value]++;
        }
        int sortIndex = 0;
        for (int j = 0;j < bucketLen; j++){
            // 将桶里面的一个个元素放到原数组里面取
            while (bucket[j] > 0){
                arr[sortIndex++] = j;
                bucket[j]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value :arr){
            if (maxValue < value){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
