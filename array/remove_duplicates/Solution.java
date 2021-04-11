package remove_duplicates;

import java.util.Arrays;

/**
 * 26. 删除排序数组中的重复项
 *
 * @author zhuyifa
 * @version 2021-04-11
 */
public class Solution {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                if (j - i > 1) {
                    nums[i + 1] = nums[j];
                }
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int length = removeDuplicates(nums);

        int[] newNums = Arrays.copyOf(nums, length);

        System.out.println("输入：nums = " + Arrays.toString(nums));
        System.out.println("输出：" + length + ", nums = " + Arrays.toString(newNums));
    }

}
