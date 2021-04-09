package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author zhuyfia
 * @version 2021-04-09
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>(16);
        for (int i = 0, length = nums.length; i < length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return new int[]{hashMap.get(nums[i]), i};
            }
            hashMap.put(target - nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println("输入：nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("输出：" + Arrays.toString(twoSum(nums, target)));
    }

}
