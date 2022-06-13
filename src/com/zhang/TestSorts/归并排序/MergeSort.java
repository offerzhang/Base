package com.zhang.TestSorts.归并排序;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 22:18
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        int[] sort = sort(arr);
        for (int x : sort){
            System.out.print(x + "  ");
        }
    }

    public static int[] sort(int[] sourceArray){
        int[] arr = sourceArray;
        // 基线条件
        if (arr.length < 2){
            return arr;
        }
        int middle = (int) Math.floor(arr.length/2);
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left),sort(right));
    }
    public static int[] merge(int[] left , int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0){
            if (left[0] <= right[0]){
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            }else{
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0){
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0){
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }
}
