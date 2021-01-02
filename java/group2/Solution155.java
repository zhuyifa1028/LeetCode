package group2;

// 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
//
//   push(x) —— 将元素 x 推入栈中。
//   pop() —— 删除栈顶的元素。
//   top() —— 获取栈顶元素。
//   getMin() —— 检索栈中的最小元素。
//
// 示例:
//
//   输入：
//   ["MinStack","push","push","push","getMin","pop","top","getMin"]
//   [[],[-2],[0],[-3],[],[],[],[]]
//
//   输出：
//   [null,null,null,null,-3,null,0,-2]
//
//   解释：
//   MinStack minStack = new MinStack();
//   minStack.push(-2);
//   minStack.push(0);
//   minStack.push(-3);
//   minStack.getMin();   --> 返回 -3.
//   minStack.pop();
//   minStack.top();      --> 返回 0.
//   minStack.getMin();   --> 返回 -2.
//
// 提示：
//
//   pop、top 和 getMin 操作总是在 非空栈 上调用。
//
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/min-stack
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

import common.MinStack;

/**
 * 155. 最小栈
 *
 * @author zhuyifa
 * @version 2021-01-02
 */
public class Solution155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        // --> 返回 -3.
        System.out.println("输出：" + minStack.min());

        minStack.pop();

        // --> 返回 0.
        System.out.println("输出：" + minStack.top());
        // --> 返回 -2.
        System.out.println("输出：" + minStack.min());
    }

}
