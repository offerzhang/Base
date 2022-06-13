package com.zhang.SE.test2;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-07 13:21
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestArray1 {
    public static void main(String[] args) {
        String[][] s = new String[2][];
        // 从最高维度，分别为每个维度分配空间
        // 第一行最多有几个元素
        s[0] = new String[2];
        // 第二个最多有几个元素
        s[1] = new String[3];
        s[0][0] = new String("good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
    }

    @Test
    public void s1(){
        int[] ints = {1,2,3,3,4,4,5,6};
        int[] intss = {1,5,3,3,4,4,2,6};
        System.out.println(Arrays.equals(ints, intss));
        System.out.println(Arrays.binarySearch(ints, 3));
        Arrays.sort(ints);  // 对给定的数组进行排序
        Arrays.fill(ints, 8);   // 将数组的元素全部用8来填充
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    @Test
    public void s2(){
        // Java 基本数据类型传递为值传递，引用数据类型为引用传递
        // 将引用 z = null 只是将引用不指向任何对象，不会对原先的对象数据进行修改
        int[] myArray = {1,2,3,4,5};
        ChangeIt.doIt(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print( myArray[i]+" ");
        }
        myArray = null; // 不能这样赋值
    }

    @Test
    public void s3(){
        int[] myArray = {1,2,3,4,5};
        // 传递的引用传递，在调用方法后可以修改
        ChangeIt.doIt1(myArray);
        for (int x :  myArray) {
            System.out.print(x + " ");
        }
    }

    @Test
    public void s4(){
        int[] myArray = {1,2,3,4,5};
        ChangeIt.doIt2(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
    }

    @Test
    public void s5(){
        int[] arr = new int[9];
        System.out.println(arr[9]);   // 超出边界
        // 0
        System.out.println(arr[8]);   // 默认的初始值为数组对应的基本数据类型及复合数据类型的默认初始值
    }

    @Test
    public void s6(){
        int[] arr = {1,3,4,2,8,9,5,0};
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x){
                x = arr[i];
            }
        }
        System.out.println(x);
        System.out.println(new int[]{1,2,3});
    }

    @Test
    public void s7(){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 8; i++) {
            System.out.println(numbers[i]);
        }
    }
}

class ChangeIt{
    static void doIt( int[] z){
        z = null;
    }
    static void doIt1(int[] z){
        int temp = z[z.length-1];
        z[z.length-1] = z[0];
        z[0] = temp;
    }
    static void doIt2(int[] z){
        int[] A = z;
        A[0] = 99;
    }

    static void blur(char[] z,String st){
        // 数组是一个相同的数据类型，值可以相同，也可不同
        // 数组是一种类型数据的集合，其实数组就是一个容器，它的值可以相同也可以不相同
        if (z.length < st.length()) return;
        for (int i = 0; i < st.length(); i++) {
            z[i] = st.charAt(i); // 将字符串的每一个字符放到一个字符数组里面
        }
    }
}
