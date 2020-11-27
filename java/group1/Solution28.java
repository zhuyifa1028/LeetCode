package group1;// 实现 strStr() https://baike.baidu.com/item/strstr/811469 函数。
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
// 如果不存在，则返回 -1。
//
// 示例 1:
//
//   输入: haystack = "hello", needle = "ll"
//   输出: 2
//
// 示例 2:
//
//   输入: haystack = "aaaaa", needle = "bba"
//   输出: -1
//
// 说明:
//
//   当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//   对于本题而言，当 needle 是空字符串时我们应当返回 0 。
//   这与C语言的 strstr() https://baike.baidu.com/item/strstr/811469
//   以及 Java的 indexOf() https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String) 定义相符。
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/implement-strstr
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * 28. 实现 strStr()
 *
 * @author zhuyifa
 * @version 2020-11-22
 */
public class Solution28 {

    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "ba";

        System.out.println("输入：" + haystack + ", " + needle);
        System.out.println("输出：" + strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }

        if ("".equals(needle.trim())) {
            return 0;
        }

        int l = needle.length(), n = haystack.length();
        if (l > n) {
            return -1;
        }

        for (int i = 0; i < n - l + 1; i++) {
            if (haystack.substring(i, i + l).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
