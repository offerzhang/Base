package com.zhang.TestSorts.选择排序;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-25 20:48
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,9,6,8,1};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
              if (arr[j] < arr[min]){
                  min = j;
              }
            }
            if (i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for (int x : arr){
            System.out.print(x + "   ");
        }
    }
}
