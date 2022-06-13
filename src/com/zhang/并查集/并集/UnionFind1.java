package com.zhang.并查集.并集;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-08 15:01
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class UnionFind1 {
    // 我们的第一版Union-Find本质就是一个数组
    private int[] id;
    // 数据的个数
    private int count;

    public UnionFind1(int n){
        count = n;
        id = new int[n];
        // 初始化，每一个id[i]指向自己，没有合并的元素
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    // 查找过程, 查找元素p所对应的集合编号
    private int find(int p){
        // 防止无意义的查找（断言）,超过范围即断言错误
        assert p >= 0 && p < count;
        return id[p];
    }

    // 查看元素p和元素q是否所属一个集合
    // O(1)复杂度
    public boolean isConnected(int p, int q){
        return find(p) == find(q) ;
    }

    // 合并元素p和元素q所属的集合
    // O(n) 复杂度
    public void unionElements(int p , int q){
        int pID = find(p);
        int qID = find(q);

        if (pID == qID){
            return ;
        }

        // 合并过程需要遍历一遍所有元素, 将两个元素的所属集合编号合并
        for (int i = 0; i < count; i++) {
            // 将P集合的元素全部转换为q集合的元素
            if (id[i] == pID){
                id[i] = qID;
            }
        }
    }

    public static void main(String[] args) {
        UnionFind1 find1 = new UnionFind1(4);

        System.out.println(find1.id[2]);

        System.out.println(find1.find(find1.id[1]));
        // 未 并集前，属于不同的集合
        System.out.println(find1.isConnected(find1.id[0],find1.id[1]));

        find1.unionElements(find1.id[0],find1.id[1]);

        //并集后，属于相同的集合
        System.out.println(find1.isConnected(find1.id[0],find1.id[1]));
    }

}
