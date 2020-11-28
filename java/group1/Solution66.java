package group1;

// 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。
//
// 示例 1：
//
//   输入：digits = [1,2,3]
//   输出：[1,2,4]
//   解释：输入数组表示数字 123。
//
// 示例 2：
//
//   输入：digits = [4,3,2,1]
//   输出：[4,3,2,2]
//   解释：输入数组表示数字 4321。
//
// 示例 3：
//
//   输入：digits = [0]
//   输出：[1]
//
// 提示：
//
//   1 <= digits.length <= 100
//   0 <= digits[i] <= 9
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/plus-one
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.Arrays;

/**
 * 66. 加一
 *
 * @author zhuyifa
 * @version 2020-11-24
 */
public class Solution66 {

    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9};

        System.out.println("输入：" + Arrays.toString(digits));
        System.out.println("输出：" + Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        if (digits == null) {
            return new int[0];
        }

        int len = digits.length;
        if (len == 0) {
            return digits;
        }

        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;

            if (digits[i] != 0) {
                return digits;
            }
        }

        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

}
