package add_two_numbers;

import java.util.*;

/**
 * 链表节点
 *
 * @author zhuyifa
 * @version 2021-04-10
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        ListNode head = this;

        while (head != null) {

            joiner.add("" + head.val);

            head = head.next;
        }

        return joiner.toString();
    }

}
