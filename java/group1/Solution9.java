package group1;

// 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
//
//   输入: 121
//   输出: true
//
// 示例 2:
//
//   输入: -121
//   输出: false
//   解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
// 示例 3:
//
//   输入: 10
//   输出: false
//   解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
// 进阶:
//
//   你能不将整数转为字符串来解决这个问题吗？
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/palindrome-number
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.Random;

/**
 * 回文数
 *
 * @author zhuyifa
 * @version 2020-11-17
 */
public class Solution9 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println("输入：" + x);
        System.out.println("输出：" + isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        // 负数一律不是回文数
        if (x < 0) {
            return false;
        }
        // 尾数为0的数字不是回文数
        if (x > 0 && x % 10 == 0) {
            return false;
        }

        int r = 0;
        // 当 r >= x 时，说明反转了一半的数字
        while (r < x) {

            int p = x % 10;

            r = r * 10 + p;

            x = x / 10;
        }
        // 当数字长度为奇数时，我们可以通过 r/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，r = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return r == x || r / 10 == x;
    }

}
