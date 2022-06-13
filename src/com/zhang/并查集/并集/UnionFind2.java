package com.zhang.并查集.并集;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-08 15:27
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class UnionFind2 {
    // 我们的第二版Union-Find, 使用一个数组构建一棵指向父节点的树
    // parent[i]表示第一个元素所指向的父节点
    private int[] parent;
    // 数据个数
    private int count;

    // 构造函数
    public UnionFind2(int count) {
        parent = new int[count];
        this.count = count;
        // 初始化, 每一个parent[i]指向自己, 表示每一个元素自己自成一个集合
        for (int i = 0; i < count; i++) {
            parent[i] = i;
        }
    }

    // 查找过程, 查找元素p所对应的集合编号
    // O(h)复杂度, h为树的高度
    private int find(int p){
        // 防止无意义的查找（断言）,超过范围即断言错误
        assert p >= 0 && p < count;
        // 不断去查询自己的父亲节点, 直到到达根节点
        // 根节点的特点: parent[p] == p
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
        // 找到对应的集合
        int pRoot = find(p);
        int qRoot = find(q);

        if( pRoot == qRoot ) {
            return;
        }
        // 将P集合的元素全部转换为q集合的元素
        parent[pRoot] = qRoot;
    }

    public static void main(String[] args) {
        UnionFind2 find2 = new UnionFind2(4);

        System.out.println(find2.parent[2]);

        System.out.println(find2.find(find2.parent[1]));
        // 未 并集前，属于不同的集合
        System.out.println(find2.isConnected(find2.parent[0],find2.parent[1]));

        find2.unionElements(find2.parent[0],find2.parent[1]);

        //并集后，属于相同的集合
        System.out.println(find2.isConnected(find2.parent[0],find2.parent[1]));
    }

}
