package group2;

// 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例:
//   给定如下二叉树，以及目标和 sum = 22，
//
//              5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
//   返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/path-sum
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import common.TreeNode;

/**
 * 112. 路径总和
 *
 * @author zhuyifa
 * @version 2020-12-06
 */
public class Solution112 {

    public static void main(String[] args) {
        TreeNode left2 = new TreeNode(2);

        TreeNode left = new TreeNode(2);
        left.left = left2;
        TreeNode right = new TreeNode(3);

        TreeNode root = new TreeNode(1, left, right);

        System.out.println("输入：" + root);
        System.out.println("输出：" + hasPathSum(root, 5));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
