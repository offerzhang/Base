package com.zhang.TestSorts.希尔排序;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 22:10
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class ShellSort1 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        int len = arr.length;
        int temp;
        for (int step = len/2;step >= 1;step /= 2){
            for (int i = step;i < len; i++){
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp){
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
        for (int x : arr){
            System.out.print(x + "  ");
        }
    }
}
