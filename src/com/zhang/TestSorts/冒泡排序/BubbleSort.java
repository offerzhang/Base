package com.zhang.TestSorts.冒泡排序;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 15:52
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class BubbleSort{
    /**
     * 冒泡排序
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        // 需要比较的数组元素个数  8个
        // 因为最后一个元素不需要交换 ，所以只需要循环 7次 ； 数组长度 - 1
        for (int i = 0; i < arr.length-1; i++) {
            // 相邻元素两两比较 次数
            // 同样 最后一个元素不需要比较  再减掉前面已经比较的个数
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x : arr){
            System.out.println(x);
        }
    }
}
