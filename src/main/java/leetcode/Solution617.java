package leetcode;

import org.junit.Test;


/**
 * 617. Merge Two Binary Trees
 * 合并两个数，对应节点相加，节点没有值就不相加
 *
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/18.
 */
public class Solution617 {


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newTree = new TreeNode(val);
        newTree.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newTree.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return newTree;
    }

}
