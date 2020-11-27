package group1;

// 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
//
// 说明：
//
//   初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
//   你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//
// 示例：
//
//   输入：
//   nums1 = [1,2,3,0,0,0], m = 3
//   nums2 = [2,5,6],       n = 3
//   输出：[1,2,2,3,5,6]
//
// 提示：
//
//     -10^9 <= nums1[i], nums2[i] <= 10^9
//     nums1.length == m + n
//     nums2.length == n
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/merge-sorted-array
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 *
 * @author zhuyifa
 * @version 2020-11-26
 */
public class Solution88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        System.out.println("输入：");
        System.out.println("nums1 = " + Arrays.toString(nums1) + ", m = " + m);
        System.out.println("nums2 = " + Arrays.toString(nums2) + ", n = " + n);

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if ((nums1 == null) || (nums2 == null)) {
            return;
        }

        int len1 = nums1.length;
        int len2 = nums2.length;

        if ((len1 != m + n) || (len2 != n)) {
            return;
        }

        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while ((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        System.out.println("输出：" + Arrays.toString(nums1));
    }

}
