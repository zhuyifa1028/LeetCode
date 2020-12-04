package group2;

// 给定一个二叉树，判断它是否是高度平衡的二叉树。
//
// 本题中，一棵高度平衡二叉树定义为：
//
//   一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
//
// 示例 1：
//
//   输入：root = [3,9,20,null,null,15,7]
//   输出：true
//
// 示例 2：
//
//   输入：root = [1,2,2,3,3,null,null,4,4]
//   输出：false
//
// 示例 3：
//
//   输入：root = []
//   输出：true
//
// 提示：
//
//   树中的节点数在范围 [0, 5000] 内
//   -10^4 <= Node.val <= 10^4
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/balanced-binary-tree
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
