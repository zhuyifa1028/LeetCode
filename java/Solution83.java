// 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//
// 示例 1:
//
//   输入: 1->1->2
//   输出: 1->2
//
// 示例 2:
//
//   输入: 1->1->2->3->3
//   输出: 1->2->3
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/**
 * 83. 删除排序链表中的重复元素
 *
 * @author zhuyifa
 * @version 2020-11-25
 */
public class Solution83 {

    public static void main(String[] args) {
        ListNode head = ListNode.valueOf(1, 1, 2, 3, 3);

        System.out.println("输入：" + head);
        System.out.println("输出：" + deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode ans = head;
        while (ans != null && ans.next != null) {
            if (ans.val == ans.next.val) {
                ans.next = ans.next.next;
            } else {
                ans = ans.next;
            }
        }
        return head;
    }

}
