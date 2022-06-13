package com.zhang.TestSorts.选择排序;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 20:34
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        // 需要比较的轮数 ， 最后一个元素不需要比较
        for (int i = 0; i < arr.length - 1; i++) {
            // 将当前的元素标记为 最小值元素
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                // 将 第 j 个元素标记为最小的元素
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            // 这一轮结束，将当前的元素与 j 位置的值进行交换
            if (i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for(int x : arr){
            System.out.print(x + "  ");
        }
    }
}
