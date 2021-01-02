package common;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 最小栈
 *
 * @author zhuyifa
 * @version 2021-01-02
 */
public class MinStack {

    private final Deque<Integer> min;
    private final Deque<Integer> data;

    public MinStack() {
        min = new LinkedList<>();
        data = new LinkedList<>();

        min.push(Integer.MAX_VALUE);
    }

    public void pop() {
        min.pop();
        data.pop();
    }

    public void push(int x) {
        //noinspection ConstantConditions
        int m = Math.min(min.peek(), x);

        min.push(m);
        data.push(x);
    }

    public int min() {
        //noinspection ConstantConditions
        return min.peek();
    }

    public int top() {
        //noinspection ConstantConditions
        return data.peek();
    }

}
