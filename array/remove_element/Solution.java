package remove_element;

import java.util.Arrays;

/**
 * 27. 移除元素
 *
 * @author zhuyifa
 * @version 2021-04-12
 */
public class Solution {

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = nums.length;

        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[j - 1];
                j--;
            } else {
                i++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int val = 3;

        int[] nums = new int[]{3, 2, 2, 3};

        System.out.println("输入：nums = " + Arrays.toString(nums) + ", val = " + val);

        int length = removeElement(nums, val);

        int[] newNums = Arrays.copyOf(nums, length);

        System.out.println("输出：" + length + ", nums = " + Arrays.toString(newNums));
    }

}
