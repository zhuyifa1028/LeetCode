package group1;

// 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//   1. 左括号必须用相同类型的右括号闭合。
//   2. 左括号必须以正确的顺序闭合。
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
//   输入: "()"
//   输出: true
//
// 示例 2:
//
//   输入: "()[]{}"
//   输出: true
//
// 示例 3:
//
//   输入: "(]"
//   输出: false
//
// 示例 4:
//
//   输入: "([)]"
//   输出: false
//
// 示例 5:
//
//   输入: "{[]}"
//   输出: true
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/valid-parentheses
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20. 有效的括号
 *
 * @author zhuyifa
 * @version 2020-11-20
 */
public class Solution20 {

    public static void main(String[] args) {
        String s = "([)]";

        System.out.println("输入：" + s);
        System.out.println("输出：" + isValid(s));
    }

    public static boolean isValid(String s) {
        // 异常输入的情况
        if (s == null) {
            return false;
        }
        int length = s.length();
        // 长度为奇数的情况
        if (length % 2 != 0) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<>(16);
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');
        // 不是左括号开头的情况
        if (!pairs.containsKey(s.charAt(0))) {
            return false;
        }

        // 空字符串可被认为是有效字符串。
        if ("".equals(s.trim())) {
            return true;
        }

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (pairs.containsKey(c)) {
                deque.push(c);
            } else {
                if (deque.isEmpty() || c != pairs.get(deque.peek())) {
                    return false;
                }
                deque.pop();
            }
        }

        return deque.isEmpty();
    }

}
