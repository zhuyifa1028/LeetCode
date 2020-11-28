package group1;

// 给你两个二进制字符串，返回它们的和（用二进制表示）。
//
// 输入为 非空 字符串且只包含数字 1 和 0。
//
// 示例 1:
//
//   输入: a = "11", b = "1"
//   输出: "100"
//
// 示例 2:
//
//   输入: a = "1010", b = "1011"
//   输出: "10101"
//
// 提示：
//
//   每个字符串仅由字符 '0' 或 '1' 组成。
//   1 <= a.length, b.length <= 10^4
//   字符串如果不是 "0" ，就都不含前导零。
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/add-binary
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * 67. 二进制求和
 *
 * @author zhuyifa
 * @version 2020-11-24
 */
public class Solution67 {

    public static void main(String[] args) {
        String a = "1010", b = "1011";

        System.out.println("输入：" + a + ", " + b);
        System.out.println("输出：" + addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        int len = a.length(), len2 = b.length();

        int rem = 0, max = Math.max(len, len2);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < max; ++i) {
            rem += i >= len ? 0 : a.charAt(len - 1 - i) - '0';
            rem += i >= len2 ? 0 : b.charAt(len2 - 1 - i) - '0';

            sb.append((char) (rem % 2 + '0'));
            rem /= 2;
        }
        if (rem > 0) {
            sb.append(rem);
        }
        return sb.reverse().toString();
    }

}
