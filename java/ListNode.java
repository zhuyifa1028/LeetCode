import java.util.Random;

/**
 * 链表节点
 *
 * @author zhuyifa
 * @version 2020-11-12
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("(");

        ListNode l = this;
        do {
            builder.append(l.val);
            l = l.next;

            if (l != null) {
                builder.append(" -> ");
            }
        } while (l != null);

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

    public static void main(String[] args) {
        ListNode l1 = random(10, 3);
        ListNode l2 = random(10, 3);
        System.out.println("输入：" + l1 + " + " + l2 + "");
        System.out.println("输出：" + Solution2.addTwoNumbers(l1, l2));
    }

}
