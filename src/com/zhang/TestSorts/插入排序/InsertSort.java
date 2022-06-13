package com.zhang.TestSorts.插入排序;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 20:57
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        // 从第二个元素位置插入 ， 第一个元素的下标为第一个元素，默认为有序的
        for (int i = 1 ; i < arr.length ; i++) {
            // 需要插入的位置
            int temp = arr[i] ;
            // 从右边开始比较哦  ，找到比起小的数
            int j = i;
            // 循环条件 ; 基线条件
            while (j > 0 && temp < arr[j - 1]){
                // 如果 插入数据小于 右边的数 ， 即将右边的依次向后移动一个，直到数据插入
                arr[j] = arr[j - 1];
                // 循环条件
                j--;
            }
            // 存在比其小的数，将这个数插入 ，插入的位置为循环结束的位置
            if (j != i){
                arr[j] = temp;
            }
        }
        for (int x : arr){
            System.out.print(x + "  ");
        }
    }

    public int[] sort(int[] arr){
        int[] arr1 = {3,5,2,4,9,6,8,1};
        // 从第二个元素位置插入 ， 第一个元素的下标为第一个元素，默认为有序的
        for (int i = 1 ; i < arr1.length ; i++) {
            // 需要插入的位置
            int temp = arr1[i] ;
            // 从右边开始比较哦  ，找到比起小的数
            int j = i;
            // 循环条件 ; 基线条件
            while (j > 0 && temp < arr1[j - 1]){
                // 如果 插入数据小于 右边的数 ， 即将右边的依次向后移动一个，直到数据插入
                arr1[j] = arr1[j - 1];
                // 循环条件
                j--;
            }
            // 存在比其小的数，将这个数插入 ，插入的位置为循环结束的位置
            if (j != i){
                arr1[j] = temp;
            }
        }

        return arr1;
    }
}
