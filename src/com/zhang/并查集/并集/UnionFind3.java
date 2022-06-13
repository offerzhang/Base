package com.zhang.并查集.并集;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-08 15:48
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * 并查集size的优化
 */
public class UnionFind3 {
    // parent[i]表示第一个元素所指向的父节点
    private int[] parent;
    // sz[i]表示以i为根的集合中元素个数
    private int[] sz;
    // 数据个数
    private int count;

    // 构造函数
    public UnionFind3(int count){
        parent = new int[count];
        sz = new int[count];
        this.count = count;
        // 初始化, 每一个parent[i]指向自己, 表示每一个元素自己自成一个集合
        for( int i = 0 ; i < count ; i ++ ){
            parent[i] = i;
            sz[i] = 1;
        }
    }

    // 查找过程, 查找元素p所对应的集合编号
    // O(h)复杂度, h为树的高度
    private int find(int p){
        assert( p >= 0 && p < count );
        // 不断去查询自己的父亲节点, 直到到达根节点
        // 根节点的特点: parent[p] == p,p集合
        while( p != parent[p] ) {
            p = parent[p];
        }
        return p;
    }

    // 查看元素p和元素q是否所属一个集合
    // O(h)复杂度, h为树的高度
    public boolean isConnected( int p , int q ){
        return find(p) == find(q);
    }

    // 合并元素p和元素q所属的集合
    // O(h)复杂度, h为树的高度
    public void unionElements(int p, int q){

        int pRoot = find(p);
        int qRoot = find(q);

        if( pRoot == qRoot ) {
            return;
        }

        // 根据两个元素所在树的元素个数不同判断合并方向
        // 将元素个数少的集合合并到元素个数多的集合上
        if( sz[pRoot] < sz[qRoot] ){
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }
        else{
            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }

    }

    public static void main(String[] args) {
        UnionFind3 find3 = new UnionFind3(4);

        System.out.println(find3.parent[2]);

        System.out.println(find3.find(find3.parent[1]));
        // 未 并集前，属于不同的集合
        System.out.println(find3.isConnected(find3.parent[0],find3.parent[1]));

        find3.unionElements(find3.parent[0],find3.parent[1]);

        //并集后，属于相同的集合
        System.out.println(find3.isConnected(find3.parent[0],find3.parent[1]));
    }
}
