package com.zhang.并查集.并集;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-08 14:56
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * 并查集的构造
 */
public class UnionFind {
    private int[] id;
    // 数据的个数
    private int count;

    public UnionFind(int n){
        count = n;
        id = new int[n];
        // 初始化，每一个id[i]指向自己，没有合并的元素,下标即为集合的标识
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public static void main(String[] args) {
        UnionFind u1 = new UnionFind(4);
        for (int i : u1.id) {
            System.out.println(i);
        }
    }
}
