package common;

import group1.Solution2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 链表节点
 *
 * @author zhuyifa
 * @version 2020-11-12
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        //noinspection MapOrSetKeyShouldOverrideHashCodeEquals
        Set<ListNode> seen = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        builder.append("(");

        ListNode head = this;
        while (head != null) {

            builder.append(head.val);

            ListNode next = head.next;
            //noinspection MapOrSetKeyShouldOverrideHashCodeEquals
            if (!seen.add(next)) {
                break;
            }
            if (next != null) {
                builder.append(" -> ");
            }

            head = next;
        }

        builder.append(")");
        return builder.toString();
    }

    public static ListNode random(int bound, int length) {
        // 头部节点
        ListNode head = null;
        // 尾部节点
        ListNode tail = null;

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int val = random.nextInt(bound);
            if (head == null) {
                head = tail = new ListNode(val);
            } else {
                tail.next = new ListNode(val);
                tail = tail.next;
            }
        }
        if (tail != null && tail.val == 0) {
            tail.val = 1;
        }
        return head;
    }

    public static ListNode valueOf(int... values) {
        // 头部节点
        ListNode head = null;
        // 尾部节点
        ListNode tail = null;

        for (int value : values) {
            if (head == null) {
                head = tail = new ListNode(value);
            } else {
                tail.next = new ListNode(value);
                tail = tail.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = random(10, 3);
        ListNode l2 = random(10, 3);
        System.out.println("输入：" + l1 + " + " + l2 + "");
        System.out.println("输出：" + Solution2.addTwoNumbers(l1, l2));
    }

}
