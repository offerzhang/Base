package com.zhang.TestSorts.基数排序;

import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-26 15:48
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sort(int[] arr) {
        int maxDigit = getMaxDigit(arr);
        return radixSort(arr,maxDigit);
    }

    private static int[] radixSort(int[] arr, int maxDigit) {
        int mod = 10;
        int dev = 1;
        for (int i = 0; i < maxDigit; i++,dev*=10,mod *= 10) {
            // 考虑负数的情况，这里扩展一倍队列数，其中 [0-9]对应负数，[10-19]对应正数 (bucket + 10)
            int[][] counter = new int[mod * 2][0];
            for (int j = 0; j < arr.length; j++) {
                int bucket = ((arr[j] % mod) / dev) + mod;
                counter[bucket] = arrayAppend(counter[bucket],arr[j]);
            }

            int pos = 0;
            for (int[] bucket : counter){
                for (int value : bucket){
                    arr[pos++] = value;
                }
            }
        }
        return arr;
    }

    private static int[] arrayAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }

    /**
     * 获取最高位数
     * @param arr
     * @return
     */
    private static int getMaxDigit(int[] arr) {
        int maxValue = getMaxValue(arr);
        return getNumLenght(maxValue);
    }

    private static int getNumLenght(long num) {
        if (num == 0){
            return 1;
        }
        int lenght = 0;
        for (long temp = num; temp != 0; temp /= 10){
            lenght++;
        }
        return lenght;
    }

    /**
     * 获取最大值
     * @param arr
     * @return
     */
    private static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr){
            if (maxValue < value){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
