package group2;

// 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
//
// 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
//
// 示例:
//
//   给定有序数组: [-10,-3,0,5,9],
//
//   一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
//
//         0
//        / \
//      -3   9
//      /   /
//     -10  5
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * @author zhuyifa
 * @version 2020-12-01
 */
public class Solution108 {

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};

        System.out.println("输入：" + Arrays.toString(nums));
        System.out.println("输出：\n" + sortedArrayToBST(nums));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

}
