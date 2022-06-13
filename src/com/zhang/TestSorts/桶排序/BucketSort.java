package com.zhang.TestSorts.桶排序;

import com.zhang.TestSorts.插入排序.InsertSort;

import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-26 11:43
 * To: 真常应物，真常得性，常清常静，常清静矣
 */

// 下标越界

public class BucketSort {
    private  static  final InsertSort insertSort = new InsertSort();

    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        sort(arr);
    }

    private static void sort(int[] arr) {
        // 5 为桶的默认大小
        int[] sort = bucketSort(arr, 5);
        System.out.println(Arrays.toString(sort));
    }

    private static int[] bucketSort(int[] arr, int bucketSize) {
        if (arr.length == 0){
            return arr;
        }
        int minValue = arr[0];
        int maxValue = arr[0];
        // 选出 数组的最大元素与最小元素
        for (int value : arr){
            if (value < minValue){
                minValue = value;
            }else if(value > maxValue){
                maxValue = value;
            }
        }
        int bucketCount = (int) Math.floor((maxValue - minValue) / bucketSize) + 1; // 需要多加1 不然数据元素下标越界
        int[][] buckets = new int[bucketCount][0];
        // 利用映射函数将数据分配到各个桶里面
        for (int i = 0; i < arr.length; i++) {
            int index = (int) Math.floor((arr[i] - minValue)/bucketSize);
            buckets[index] = arrAppend(buckets[index],arr[i]);
        }
        int arrIndex = 0;
        for (int[] bucket : buckets){
            // 如果桶为空 ，跳出这次循环
            if (bucket.length <= 0){
                continue;
            }
            // 对每个桶进行排序，这里使用插入排序
            bucket = insertSort.sort(bucket);
            // 将桶里面的每一个元素插入数组里面
            for (int value : bucket){
                arr[arrIndex++] = value;
            }
        }

        return arr;
    }

    /**
     * 自动扩容，并保存数据
     * @param arr
     * @param value
     * @return
     */
    public static int[] arrAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1] = value;
        return arr;
    }
}
