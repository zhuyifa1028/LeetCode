package group1;// 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
//   输入: 123
//   输出: 321
//
// 示例 2:
//
//   输入: -123
//   输出: -321
//
// 示例 3:
//
//   输入: 120
//   输出: 21
//
// 注意:
//
//   假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [-2^31, 2^31-1]。
//   请根据这个假设，如果反转后整数溢出那么就返回 0。
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/reverse-integer
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.Random;

/**
 * 整数反转
 *
 * @author zhuyifa
 * @version 2020-11-16
 */
public class Solution7 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println("输入：" + x);
        System.out.println("输出：" + reverse(x));
    }

    public static int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int pop = x % 10;

            if (res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10) {
                return 0;
            }

            res = res * 10 + pop;

            x = x / 10;
        }

        return res;
    }

}
