package com.zhang.树;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-07-11 14:31
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class CountNode {

    public int countNodes2(TreeNode root){
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int result = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            result++;
            while(size-- > 0){
                TreeNode cur = queue.poll();
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
            }
        }
        return 0;
    }

    public int countNodes1(TreeNode root){
        // 通用递归解法
        if (root == null){
            return 0;
        }
        return countNodes1(root.left) + countNodes1(root.right) + 1;
    }

}
