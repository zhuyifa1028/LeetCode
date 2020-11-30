package group2;

// 给定一个二叉树，检查它是否是镜像对称的。
//
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//
//      1
//     / \
//    2   2
//   / \ / \
//   3  4 4  3
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
//
//      1
//     / \
//    2   2
//     \   \
//     3    3
//
// 进阶：
//
//   你可以运用递归和迭代两种方法解决这个问题吗？
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/symmetric-tree
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import common.TreeNode;

/**
 * 101. 对称二叉树
 *
 * @author zhuyifa
 * @version 2020-11-30
 */
public class Solution101 {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);

        TreeNode root = new TreeNode(1, left, right);

        System.out.println("输入：\n" + root);
        System.out.println("输出：" + isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (!p.val.equals(q.val)) {
            return false;
        } else {
            return check(p.left, q.right) && check(p.right, q.left);
        }
    }

}
