package add_two_numbers;

/**
 * 两数相加
 *
 * @author zhuyifa
 * @version 2021-04-10
 */
public class Solution {

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

    public static void main(String[] args) {

        ListNode l12 = new ListNode(3);
        ListNode l22 = new ListNode(4);

        ListNode l11 = new ListNode(4, l12);
        ListNode l21 = new ListNode(6, l22);

        ListNode l1 = new ListNode(2, l11);
        ListNode l2 = new ListNode(5, l21);

        System.out.println("输入：l1 = " + l1 + ", l2 = " + l2 + "");
        System.out.println("输出：" + addTwoNumbers(l1, l2));
    }

}
