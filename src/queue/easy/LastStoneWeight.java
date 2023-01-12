package queue.easy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) queue.offer(i);

        while (queue.size() > 1) {
            int first = queue.poll();
            int next = queue.poll();
            if (first != next) {
                queue.offer(first - next);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
