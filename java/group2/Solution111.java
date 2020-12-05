package group2;

// 给定一个二叉树，找出其最小深度。
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
//
// 说明：叶子节点是指没有子节点的节点。
//
// 示例 1：
//
//
//   输入：root = [3,9,20,null,null,15,7]
//   输出：2
//
// 示例 2：
//
//   输入：root = [2,null,3,null,4,null,5,null,6]
//   输出：5
//
// 提示：
//
//   树中节点数的范围在 [0, 10^5] 内
//   -1000 <= Node.val <= 1000
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import common.TreeNode;

/**
 * 111. 二叉树的最小深度
 *
 * @author zhuyifa
 * @version 2020-12-04
 */
public class Solution111 {

    public static void main(String[] args) {
        TreeNode left2 = new TreeNode(2);

        TreeNode left = new TreeNode(2);
        left.left = left2;
        TreeNode right = new TreeNode(3);

        TreeNode root = new TreeNode(1, left, right);

        System.out.println("输入：\n" + root);
        System.out.println("输出：" + minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }

}
