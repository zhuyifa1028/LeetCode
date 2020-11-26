// 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
// 示例：
//
//   输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//   输出：7 -> 0 -> 8
//   原因：342 + 465 = 807
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/add-two-numbers
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import common.ListNode;

/**
 * 两数相加
 *
 * @author zhuyifa
 * @version 2020-11-13
 */
public class Solution2 {

    public static void main(String[] args) {
        ListNode l1 = ListNode.random(10, 3);
        ListNode l2 = ListNode.random(10, 3);
        System.out.println("输入：" + l1 + " + " + l2 + "");
        System.out.println("输出：" + addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 头部节点
        ListNode head = null;
        // 尾部节点
        ListNode tail = null;

        // 尾部节点值
        int v3 = 0;
        while (l1 != null || l2 != null) {

            int v1 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }

            int v2 = 0;
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }

            int sum = v1 + v2 + v3;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            v3 = sum / 10;
        }
        if (v3 > 0) {
            tail.next = new ListNode(v3);
        }
        return head;
    }

}
