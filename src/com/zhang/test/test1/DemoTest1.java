package com.zhang.test.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-05-13 22:14
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class DemoTest1 {
    private static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();
                } else {
                    System.out.print(i);
                }
            }catch (IllegalStateException e) {
                System.out.print("E");
            } finally {
                System.out.print("e");
            }
        }
    }

    public static void main(String[]args) {
        try {
            test(new int[] {0, 1, 2, 3, 4, 5});
        } catch (Exception e) {
            System.out.print("E");
        }
    }
}
