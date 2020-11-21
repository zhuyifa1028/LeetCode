// 将两个升序链表合并为一个新的 升序 链表并返回。
// 新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 示例：
//
//   输入：1->2->4, 1->3->4
//   输出：1->1->2->3->4->4
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * 21. 合并两个有序链表
 *
 * @author zhuyifa
 * @version 2020-11-20
 */
public class Solution21 {

    public static void main(String[] args) {
        ListNode l1 = ListNode.valueOf(1, 2, 4);
        ListNode l2 = ListNode.valueOf(1, 3, 4);

        System.out.println("输入：" + l1 + ", " + l2);
        System.out.println("输出：" + mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 头部节点
        ListNode head = new ListNode(-1);
        // 尾部节点
        ListNode tail = head;

        while (l1 != null && l2 != null) {

            if (l1.val >= l2.val) {
                tail.next = l2;
                l2 = l2.next;
            } else {
                tail.next = l1;
                l1 = l1.next;
            }

            tail = tail.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        tail.next = (l1 != null) ? l1 : l2;

        return head.next;
    }

}
