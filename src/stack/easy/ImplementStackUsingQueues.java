package stack.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        if (queue1.size() == 0)
            queue1.add(x);
        else {
            while (queue1.size() > 0)
                queue2.add(queue1.poll());
            queue1.add(x);
            while (queue2.size() > 0)
                queue1.add(queue2.poll());
        }
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.size() == 0;
    }
}
