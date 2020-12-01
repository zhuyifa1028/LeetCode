package group2;

// 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
// 例如：
// 给定二叉树 [3,9,20,null,null,15,7],
//
//        3
//       / \
//       9  20
//       /  \
//      15   7
//   返回其自底向上的层次遍历为：
//
//   [
//       [15,7],
//       [9,20],
//       [3]
//   ]
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107. 二叉树的层次遍历 II
 *
 * @author zhuyifa
 * @version 2020-12-01
 */
public class Solution107 {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);

        TreeNode root = new TreeNode(1, left, right);

        System.out.println("输入：\n" + root);
        System.out.println("输出：" + levelOrderBottom(root));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> linkedList = new LinkedList<>();
        if (root == null) {
            return linkedList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                level.add(node.val);
                TreeNode left = node.left,
                        right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            linkedList.add(0, level);
        }
        return linkedList;
    }

}
