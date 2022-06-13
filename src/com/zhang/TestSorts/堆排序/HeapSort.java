package com.zhang.TestSorts.堆排序;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import javax.swing.*;
import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-26 9:47
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};

        sort(arr);

    }

    private static void sort(int[] arr) {
        // 数组长度
        int len = arr.length;
        // 构建大堆顶
        buildMaxHeap(arr,len);

        System.out.println("构建的大堆顶： " + Arrays.toString(arr));

        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 构建大堆顶
     * @param arr
     * @param len
     */
    private static void buildMaxHeap(int[] arr, int len) {
        for (int i = (int) Math.floor(len/2); i >= 0; i--) {
            // i 为根节点
            heapify(arr,i,len);
        }
    }

    /**
     * 堆化
     * @param arr
     * @param i
     * @param len
     */
    private static void heapify(int[] arr, int i, int len) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        // 根节点最大
        int largest = i;
        // 保证左孩子小于数组长度 且 左孩子小于根节点
        if (left < len && arr[left] > arr[largest]){
            // 如果左孩子大于根节点 ， 将左孩子替换为根节点
            largest = left;
        }
        // 保证右孩子小于数组长度 且 右孩子小于根节点
        if (right < len && arr[right] > arr[largest]){
            // 如果右孩子大于根节点 ， 将右孩子替换为根节点
            largest = right;
        }
        // 如果根节点不是最大节点
        if (largest != i){
            // 交换，保证根节点为数组的最大值
            swap(arr,i,largest);
            heapify(arr, largest, len);
        }
    }

    private static void swap(int[] arr, int i, int largest) {
        // 根节点
        int temp = arr[i];
        // 将最大值替换为根节点
        arr[i] = arr[largest];
        // 将最大值的位置替换为原来根节点的值
        arr[largest] = temp;
    }
}
