package search_insert;

import java.util.Arrays;

/**
 * 35. 搜索插入位置
 *
 * @author zhuyifa
 * @version 2020-11-23
 */
public class Solution {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }

        int ans = nums.length;
        if (ans == 0) {
            return 0;
        }

        int left = 0, right = ans - 1;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;

        System.out.println("输入：" + Arrays.toString(nums) + ", " + target);
        System.out.println("输出：" + searchInsert(nums, target));
    }

}
