// 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
// 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
// 如果不存在最后一个单词，请返回 0 。
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
//
// 示例:
//
//   输入: "Hello World"
//   输出: 5
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/length-of-last-word
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * 58. 最后一个单词的长度
 *
 * @author zhuyifa
 * @version 2020-11-24
 */
public class Solution58 {

    public static void main(String[] args) {
        String s = "Hello World ";

        System.out.println("输入：" + s);
        System.out.println("输出：" + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }

        int i = s.length();
        if (i == 0) {
            return 0;
        }

        s = s.trim();
        i = s.length();

        for (int j = i - 1; j >= 0; j--) {
            if (' ' == s.charAt(j)) {
                return i - j - 1;
            }
        }

        return i;
    }

}
